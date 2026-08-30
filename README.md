# Java Spring Cache

Projeto de estudo desenvolvido com Java e Spring Boot para demonstrar o uso de mecanismos de cache da plataforma Spring.

O foco do projeto é explorar a abstração de cache disponibilizada pelo Spring Framework e compreender como o armazenamento temporário de resultados pode reduzir operações desnecessárias e melhorar o desempenho de aplicações.

## Objetivos

- Demonstrar a configuração de cache no Spring Boot
- Explorar a abstração `org.springframework.cache`
- Compreender o funcionamento do cache em métodos da aplicação
- Praticar testes automatizados relacionados ao projeto

## Tecnologias

- Java 21
- Spring Boot 3.4.5
- Spring Cache
- Lombok
- Maven
- JUnit 5
- Mockito

## Como executar

Clone o repositório:

```bash
git clone https://github.com/bispobr/java-Spring-Cache.git
cd java-Spring-Cache
```

Execute a aplicação com Maven:

```bash
mvn spring-boot:run
```

## Testes

Execute os testes automatizados com:

```bash
mvn test
```

## Conceito de cache

O cache permite armazenar temporariamente resultados de operações que podem ser reutilizados em chamadas posteriores.

Em uma aplicação Spring, a abstração de cache pode ser utilizada para evitar a execução repetida de operações custosas, como consultas a bancos de dados ou chamadas a serviços externos.

Fluxo simplificado:

```text
Requisição
    │
    ▼
Método da aplicação
    │
    ▼
Existe resultado no cache?
    │
    ├── Sim ──► Retorna resultado armazenado
    │
    └── Não
          │
          ▼
    Executa operação
          │
          ▼
    Armazena resultado
          │
          ▼
    Retorna resultado
```

## Principais conceitos do Spring Cache

A abstração de cache do Spring fornece anotações como:

- `@Cacheable` — utiliza o cache para evitar a execução desnecessária de um método.
- `@CachePut` — executa o método e atualiza o valor armazenado no cache.
- `@CacheEvict` — remove entradas do cache.
- `@Caching` — permite combinar diferentes operações de cache.
- `@EnableCaching` — habilita o suporte de cache na aplicação.

## Observação

Este repositório tem caráter didático e está focado no estudo do mecanismo de cache do Spring Boot.

## Status

Projeto de estudo para prática de implementação e testes de cache utilizando Spring Boot.
