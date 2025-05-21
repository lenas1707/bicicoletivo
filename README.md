# BiciColetivo

Sistema de gerenciamento de bicicletas coletivas desenvolvido com Spring Boot.

## Funcionalidades Implementadas

### Usuários
- Cadastro de usuários com informações básicas (nome, email, RA)
- Autenticação e autorização usando OAuth2
- Perfis de usuário (ADMIN e CLIENT)
- Busca de usuários por nome
- Visualização de perfil próprio
- Administradores podem visualizar todos os usuários

### Bicicletas
- Cadastro de bicicletas vinculadas a usuários
- Informações da bicicleta (marca, modelo, cor)
- Atualização de informações da bicicleta
- Relacionamento proprietário-bicicleta

### Registros
- Sistema de registro de entrada e saída de bicicletas
- Controle de status de registro (ativo/finalizado)
- Vinculação de registros a usuários e bicicletas

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Security com OAuth2
- Spring Data JPA
- PostgreSQL
- H2Database (contexto de testes)
- Maven

## Estrutura do Projeto
- Controllers: Endpoints da API REST
- Services: Lógica de negócio
- Repositories: Acesso ao banco de dados
- Entities: Modelos de dados
- DTOs: Objetos de transferência de dados
- Config: Configurações do sistema

## Segurança
- Autenticação via OAuth2
- Tokens JWT
- Controle de acesso baseado em roles
- Proteção de endpoints
