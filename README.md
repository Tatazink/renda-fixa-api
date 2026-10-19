# Renda Fixa API

API REST de renda fixa desenvolvida com Java e Spring Boot. Projeto de estudo em construção, feito por etapas para praticar boas práticas de back-end

## Tecnologias

- Java 21
- Spring Boot
- Maven

## Como executar

Pré-requisito: Java 21 instalado.

```bash
./mvnw spring-boot:run
```

No Windows (PowerShell), use `.\mvnw spring-boot:run`.

A aplicação sobe em `http://localhost:8080`.

## Endpoints 

| Método | Rota | Descrição |
|--------|------|-----------|
|GET | `/status`| Verifica se a API está no ar |

## Roadmap

- [x] Projeto inicial e endpoint de status
- [] Banco de dados PostgreSQL com Docker e Spring Data JPA
- [] Cadastro de clientes e produtos de renda fixa
- [] Simulação de rendimento e aplicações
- [] Testes unitários com JUnit e Mockito
- [] Docker e CI com GitHub Actions
- [] Documentação com Swagger