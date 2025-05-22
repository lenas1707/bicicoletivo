# 🚲 BiciColetivo

[![Java](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.2.3-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![PostgreSQL](https://img.shields.io/badge/PostgreSQL-15-blue.svg)](https://www.postgresql.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9+-red.svg)](https://maven.apache.org/)

Sistema de gerenciamento de bicicletas coletivas desenvolvido com Spring Boot, oferecendo uma solução completa para controle e monitoramento de bicicletas compartilhadas.

## 📋 Índice
- [Funcionalidades](#-funcionalidades-implementadas)
- [Tecnologias](#-tecnologias-utilizadas)
- [Estrutura do Projeto](#-estrutura-do-projeto)
- [Segurança](#-segurança)
- [Documentação](#-documentação)

## ✨ Funcionalidades Implementadas

### 👥 Usuários
- ✅ Cadastro de usuários com informações básicas (nome, email, RA)
- 🔐 Autenticação e autorização usando OAuth2
- 👮‍♂️ Perfis de usuário (ADMIN e CLIENT)
- 🔍 Busca de usuários por nome
- 👤 Visualização de perfil próprio
- 👨‍💼 Administradores podem visualizar todos os usuários

### 🚲 Bicicletas
- ➕ Cadastro de bicicletas vinculadas a usuários
- 📝 Informações detalhadas da bicicleta:
  - Marca
  - Modelo
  - Cor
  - Status
- 🔄 Atualização de informações da bicicleta
- 🔗 Relacionamento proprietário-bicicleta

### 📝 Registros
- ⏰ Sistema de registro de entrada e saída de bicicletas
- 📊 Controle de status de registro (ativo/finalizado)
- 🔄 Vinculação de registros a usuários e bicicletas
- 📈 Histórico de utilização

## 🛠 Tecnologias Utilizadas
- **Backend**: Java 17
- **Framework**: Spring Boot 3.2.3
- **Segurança**: Spring Security com OAuth2
- **Persistência**: Spring Data JPA
- **Banco de Dados**: PostgreSQL 15
- **Gerenciamento de Dependências**: Maven 3.9+

## 📁 Estrutura do Projeto
```
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── bicicoletivo/
│   │           ├── controllers/    # Endpoints da API REST
│   │           ├── services/       # Lógica de negócio
│   │           ├── repositories/   # Acesso ao banco de dados
│   │           ├── entities/       # Modelos de dados
│   │           ├── dto/           # Objetos de transferência
│   │           └── config/        # Configurações do sistema
│   └── resources/
│       └── application.properties  # Configurações da aplicação
```

## 🔒 Segurança
- 🔐 Autenticação via OAuth2
- 🎟️ Tokens JWT
- 👮‍♂️ Controle de acesso baseado em roles
- 🛡️ Proteção de endpoints
- 🔑 Criptografia de senhas
- 🚫 Prevenção contra ataques comuns

  ## 📚 Documentação
  -🧑🏻‍💻[Resumo Bicicoletivo](docs/bicicoletivo_resume.pdf)
