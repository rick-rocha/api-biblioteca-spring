package com.biblioteca.api_biblioteca.controller;

import com.biblioteca.api_biblioteca.model.Livro;
import com.biblioteca.api_biblioteca.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroRepository repository;

    // Listar Todos
    @GetMapping
    public List<Livro> listar() {
        return repository.findAll();
    }

    // Busca Avançada
    @GetMapping("/busca")
    public List<Livro> buscar(@RequestParam(required = false) String titulo,
                              @RequestParam(required = false) String categoria,
                              @RequestParam(required = false) String autor,
                              @RequestParam(required = false) Integer anoPublicacao,
                              @RequestParam(required = false) String status) {
        if (titulo != null) {
            return repository.findByTitulo(titulo);
        }
        if (categoria != null) {
            return repository.findByCategoria(categoria);
        }
        if (autor != null) {
            return repository.findByAutoresContaining(autor);
        }
        if (anoPublicacao != null) {
            return repository.findByAnoPublicacao(anoPublicacao);
        }
        if (status != null) {
            return repository.findByStatus(status);
        }
        return repository.findAll();
    }

    // Criar Novo Livro
    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return repository.save(livro);
    }

    // Atualizar Dados do Livro
    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        return repository.findById(id).map(livro -> {
            livro.setTitulo(livroAtualizado.getTitulo());
            livro.setAutores(livroAtualizado.getAutores());
            livro.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
            livro.setStatus(livroAtualizado.getStatus());
            return repository.save(livro);
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Livro não encontrado"));
    }

    // Deletar livro
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}