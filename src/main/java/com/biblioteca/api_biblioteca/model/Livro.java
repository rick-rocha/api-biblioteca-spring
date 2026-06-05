package com.biblioteca.api_biblioteca.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "livro")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Atributos do Livro
    private String titulo;
    @ElementCollection
    private List<String> autores;
    private String categoria;
    private Integer anoPublicacao;
    private String status; // "EM_ESTOQUE", "EMPRESTADO", "DANIFICADO"
}