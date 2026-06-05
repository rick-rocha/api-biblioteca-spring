# 📚 API de Gerenciamento de Biblioteca

![Java](https://img.shields.io/badge/Java-000?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/spring_boot-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/postgresql-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)

Uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de livros em uma biblioteca. O sistema permite o cadastro completo de obras, gestão de múltiplos autores e conta com um sistema de busca avançada por parâmetros dinâmicos.

## ✨ Funcionalidades

* **CRUD Completo:** Criação, leitura, atualização e exclusão de livros.
* **Múltiplos Autores:** Suporte para livros com mais de um autor através de mapeamento `@ElementCollection`.
* **Busca Avançada:** Filtros dinâmicos via *Query Parameters* permitindo buscar por:
  * Título
  * Categoria
  * Nome do Autor
  * Ano de Publicação
  * Status (ex: EM_ESTOQUE, EMPRESTADO)

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3+** (Web, Data JPA)
* **PostgreSQL** (Banco de dados relacional)
* **Hibernate** (Mapeamento Objeto-Relacional)
* **Maven** (Gerenciamento de dependências)
* **Postman** (Testes de API)

## 🚀 Como Executar o Projeto

### Pré-requisitos
* Java JDK 17 ou superior
* PostgreSQL e pgAdmin instalado e rodando
* Maven

### Passos
1. Clone o repositório:
   ```bash
   git clone [https://github.com/rick-rocha/api-biblioteca-spring.git](https://github.com/SeuUsuario/api-biblioteca-spring.git)
