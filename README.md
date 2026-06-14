# To-Do List - Clean Architecture

Este projeto é uma aplicação simples de lista de tarefas (To-Do List) desenvolvida para praticar e aplicar os conceitos de **Clean Architecture** (Arquitetura Limpa) utilizando Java.

## 🚀 Objetivo
O objetivo principal deste repositório é demonstrar uma implementação básica de como organizar um projeto em camadas, separando as regras de negócio das preocupações de infraestrutura e interface de usuário.

## 🛠️ Tecnologias Utilizadas
- **Java 21**
- **Maven** (Gerenciador de dependências e automação de build)

## 🏗️ Estrutura do Projeto (Clean Architecture)
O projeto está dividido em módulos Maven, cada um representando uma camada da Clean Architecture:

1.  **`domain` (Domínio):**
    - Contém as entidades de negócio e enums.
    - É o núcleo da aplicação e não possui dependências de outras camadas.
    - Ex: `TarefaEntity`, `TarefaEnum`.

2.  **`usecase` (Casos de Uso):**
    - Define as interfaces das operações que o sistema pode realizar.
    - Representa as regras de negócio da aplicação.
    - Ex: `CreateTarefaUseCase`, `ListarTarefasUseCase`.

3.  **`application` (Aplicação):**
    - Contém a implementação dos casos de uso.
    - Gerencia o fluxo de dados de e para o domínio.
    - Atualmente, utiliza uma lista em memória para persistência temporária.

4.  **`infraestructure` (Infraestrutura):**
    - Camada mais externa que lida com detalhes como interface de usuário (CLI), DTOs e Mappers.
    - Contém o ponto de entrada da aplicação (`ToDoList.java`).
    - Faz a tradução entre dados externos (DTOs) e objetos de domínio.

## ✨ Funcionalidades
- **Adicionar Tarefa:** Permite criar uma nova tarefa informando nome e descrição.
- **Status Automático:** Toda nova tarefa é criada com o status inicial `ABERTA`.
- **Listar Tarefas:** Exibe todas as tarefas cadastradas com seus respectivos detalhes e status.
- **Interface CLI:** Interação simples via terminal utilizando o teclado.

## 📋 Como Executar
1. Certifique-se de ter o **JDK 21** e o **Maven** instalados.
2. Clone o repositório.
3. No diretório raiz, execute o comando para compilar o projeto:
   ```bash
   mvn clean install
   ```
4. Execute a classe principal `ToDoList.java` localizada no módulo `infraestructure`.

---
*Este projeto serve como base de estudos para evolução constante em boas práticas de desenvolvimento.*
