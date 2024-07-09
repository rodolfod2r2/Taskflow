# Taskflow-API-Webflux-MongoDB Ajuda

## Visão Geral

Taskflow-API-Webflux-MongoDB é uma API reativa em Java para gerenciamento de tarefas, utilizando MongoDB como banco de
dados e o framework Webflux para operações reativas.

## Iniciando

Para começar a usar a API:

1. Clone o repositório.
2. Verifique se você tem o JDK 11+ e o MongoDB instalados.
3. Construa e execute o aplicativo usando Maven:
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```
4. Acesse a API em http://localhost:8080.

## Endpoints da API

GET /tasks: Retorna todas as tarefas. GET /tasks/{id}: Retorna uma tarefa específica pelo ID. POST /tasks: Cria uma nova
tarefa. PUT /tasks/{id}: Atualiza uma tarefa existente. DELETE /tasks/{id}: Exclui uma tarefa pelo ID. POST
/users/signup: Registra um novo usuário. POST /users/login: Autentica o usuário e retorna um token JWT.

### Para documentação detalhada da API, consulte Documentação da API.

## Configuração

Configure os detalhes da conexão com o MongoDB em application.properties.

## Contribuições

Contribuições são bem-vindas! Por favor, faça um fork do repositório, faça suas alterações e envie um pull request.

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE para mais informações.