# Sistema de Gerenciamento de Estacionamento
Este projeto implementa um sistema para gerenciamento de estacionamento usando Spring Boot e Jakarta EE.
## Descrição
O Sistema de Gerenciamento de Estacionamento é uma aplicação que permite controlar e administrar veículos e empresas em um estacionamento. Com ele, é possível cadastrar, consultar, atualizar e remover informações sobre os veículos estacionados e as empresas parceiras.
## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Jakarta EE
- Maven

## Recursos
- Cadastro e gerenciamento de veículos
- Cadastro e gerenciamento de empresas
- Consultas individuais ou paginadas
- Atualização de informações
- Remoção de registros

## Estrutura do Projeto
O projeto segue a arquitetura MVC (Model-View-Controller) com as seguintes camadas:
- **Controllers**: Recebem as requisições HTTP e direcionam para os serviços apropriados
- **Services**: Contêm a lógica de negócio da aplicação
- **Repositories**: Responsáveis pela persistência dos dados
- **DTOs**: Objetos de transferência de dados entre camadas
- **Entities**: Representações das tabelas do banco de dados

## API REST
A aplicação expõe uma API REST com os seguintes endpoints:
### Endpoints de Veículos

| Método HTTP | Endpoint | Descrição |
| --- | --- | --- |
| GET | `/veiculos/{id}` | Busca um veículo pelo ID |
| GET | `/veiculos` | Lista todos os veículos (com suporte a paginação) |
| POST | `/veiculos` | Cadastra um novo veículo |
| PUT | `/veiculos/{id}` | Atualiza as informações de um veículo |
| DELETE | `/veiculos/{id}` | Remove um veículo do sistema |
### Endpoints de Empresas

| Método HTTP | Endpoint | Descrição |
| --- | --- | --- |
| GET | `/empresas/{id}` | Busca uma empresa pelo ID |
| GET | `/empresas` | Lista todas as empresas (com suporte a paginação) |
| POST | `/empresas` | Cadastra uma nova empresa |
| PUT | `/empresas/{id}` | Atualiza as informações de uma empresa |
| DELETE | `/empresas/{id}` | Remove uma empresa do sistema |
## Como Executar
1. Clone o repositório
``` bash
   git clone https://github.com/seu-usuario/spring.boot.estacionamento.git
```
1. Entre na pasta do projeto
``` bash
   cd spring.boot.estacionamento/estacionamento
```
1. Execute a aplicação com Maven
``` bash
   ./mvnw spring-boot:run
```
1. A aplicação estará disponível em: [http://localhost:8080](http://localhost:8080)

## Requisitos
- JDK 17 ou superior
- Maven 3.6 ou superior
