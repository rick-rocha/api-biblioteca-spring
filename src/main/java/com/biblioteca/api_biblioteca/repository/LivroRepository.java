package com.biblioteca.api_biblioteca.repository;

import com.biblioteca.api_biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    // Busca por Título
    List<Livro> findByTitulo(String titulo);

    // Busca por Autor
    List<Livro> findByAutoresContaining(String autor);

    // Busca por Categoria
    List<Livro> findByCategoria(String categoria);

    // Busca por Ano de Publicação
    List<Livro> findByAnoPublicacao(Integer anoPublicacao);

    // Busca por Status
    List<Livro> findByStatus(String status);

}