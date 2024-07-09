# TASKFLOW-WEBFLUX

Este repositório contém uma aplicação TASKFLOW desenvolvida com Spring WebFlux em Java.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/main/java/taskflow/controller/`: Contém os controladores da aplicação.
    - `ArchiveController.java`, `FamilyController.java`, `GamificationController.java`, `HaloController.java`
      , `HistoryController.java`, `KindController.java`, `ProjectController.java`, `RemarkController.java`
      , `SkillController.java`, `TaskController.java`, `TeamController.java`, `UserController.java`: Controladores para
      manipulação das entidades correspondentes.

- `src/main/java/taskflow/document/`: Documentação das entidades da aplicação.
    - `Archive.java`, `Family.java`, `Gamification.java`, `Halo.java`, `History.java`, `Kind.java`, `Project.java`
      , `Remark.java`, `Skill.java`, `Task.java`
      , `Team.java`, `User.java`: Modelos de dados representando cada entidade.

- `src/main/java/taskflow/repository/`: Repositórios para acesso aos dados.
    - `ArchiveRepository.java`, `FamilyRepository.java`, `GamificationRepository.java`, `HaloRepository.java`
      , `HistoryRepository.java`, `KindRepository.java`, `ProjectRepository.java`, `RemarkRepository.java`
      , `SkillRepository.java`, `TaskRepository.java`, `TeamRepository.java`, `UserRepository.java`: Interfaces de
      repositório para cada entidade.

- `src/main/java/taskflow/response/`: Classes para customização de respostas.
    - `CustomResponse.java`: Classe para manipulação de respostas customizadas.

- `src/main/java/taskflow/service/`: Implementações de serviços.
    - `ArchiveServiceImp.java`, `FamilyServiceImp.java`, `GamificationServiceImp.java`, `HaloServiceImp.java`
      , `HistoryServiceImp.java`, `KindServiceImp.java`, `ProjectServiceImp.java`, `RemarkServiceImp.java`
      , `SkillServiceImp.java`, `TaskServiceImp.java`, `TeamServiceImp.java`, `UserServiceImp.java`: Implementações de
      serviços para cada entidade.

- `src/main/java/taskflow/TaskflowApplication.java`: Classe principal que inicia a aplicação.

- `src/resources/`: Recursos da aplicação.
    - `application.properties`: Arquivo de configuração da aplicação.

- `src/test/java/taskflow/`: Testes da aplicação.
    - `TaskflowApplicationTests.java`: Classe de teste principal.

## Configuração do Ambiente

Para configurar o ambiente de desenvolvimento:

1. Clone este repositório:
   ```bash
   git clone https://github.com/rodolfod2r2/TASKFLOW-WEBFLUX.git
   ```
2. Abra o projeto em seu IDE preferido (Eclipse, IntelliJ, etc.).

3. Certifique-se de ter o JDK (Java Development Kit) e Maven instalados e configurados corretamente.

4. Configure as propriedades de conexão com o banco de dados no arquivo ```bash application.properties.```

## Uso

### Execução

Para executar a aplicação, você pode seguir estes passos:
Compile o projeto e empacote-o em um arquivo JAR executável:

```bash
mvn clean package
```

Execute o arquivo JAR gerado:

```bash
java -jar target/taskflow-webflux.jar
```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias no código,
documentação ou qualquer outra sugestão que possa beneficiar o projeto.
