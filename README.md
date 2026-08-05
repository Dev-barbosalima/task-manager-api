# 📌 Task Manager API

API REST para gerenciamento de tarefas desenvolvida com Java e Spring Boot.

---

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

---

## 📂 Estrutura do projeto

- controller → endpoints da API
- service → lógica de negócio
- repository → acesso ao banco
- model → entidades

---

## 🔧 Funcionalidades

- Criar tarefa
- Listar tarefas
- Buscar por ID
- Atualizar tarefa
- Deletar tarefa

---

## ▶️ Como rodar o projeto

1. Pré-requisitos:
   - 1.2: Instalar JDK
     - Guia de Instalação oficial: [JDK](https://www.oracle.com/br/java/technologies/downloads/#java21)
   - 1.3: Instalar o Maven
     - Guia de Instalção do oficial: [Maven](https://maven.apache.org/download.cgi)
2. Clonar o repositório:
```bash
git clone https://github.com/Dev-barbosalima/task-manager-api.git
```
3. Buildar e Rodar o projeto:
   - Abra o terminal no diretório do projeto e rode o seguinte comando:
```bash
    mvn spring-boot:run
```