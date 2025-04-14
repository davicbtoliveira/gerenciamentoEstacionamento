# Sistema de Gerenciamento de Estacionamento
Este projeto implementa um sistema para gerenciamento de estacionamento usando Spring Boot e Jakarta EE.
## Descrição
O Sistema de Gerenciamento de Estacionamento é uma aplicação que permite controlar e administrar veículos em um estacionamento. Com ele, é possível cadastrar, consultar, atualizar e remover informações sobre os veículos estacionados.
## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Jakarta EE
- Maven

## Recursos
- Cadastro de veículos
- Consulta de veículos (individual ou paginada)
- Atualização de informações dos veículos
- Remoção de veículos

## Estrutura do Projeto
O projeto segue a arquitetura MVC (Model-View-Controller) com as seguintes camadas:
- **Controllers**: Recebem as requisições HTTP e direcionam para os serviços apropriados
- **Services**: Contêm a lógica de negócio da aplicação
- **Repositories**: Responsáveis pela persistência dos dados
- **DTOs**: Objetos de transferência de dados entre camadas
- **Entities**: Representações das tabelas do banco de dados

## API REST
A aplicação expõe uma API REST para gerenciamento de veículos com os seguintes endpoints:

| Método HTTP | Endpoint | Descrição |
| --- | --- | --- |
| GET | `/veiculos/{id}` | Busca um veículo pelo ID |
| GET | `/veiculos` | Lista todos os veículos (com suporte a paginação) |
| POST | `/veiculos` | Cadastra um novo veículo |
| PUT | `/veiculos/{id}` | Atualiza as informações de um veículo |
| DELETE | `/veiculos/{id}` | Remove um veículo do sistema |
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

## Exemplos de Uso
### Cadastrar um novo veículo
``` bash
curl -X POST http://localhost:8080/veiculos \
  -H "Content-Type: application/json" \
  -d '{
    "marca": "Volkswagem",
    "modelo": "Gol",
    "cor": "Preto",
    "placa": "REZ0E98",
    "tipo": "Carro"
    }'
```
### Consultar todos os veículos (com paginação)
``` bash
curl -X GET "http://localhost:8080/veiculos?page=0&size=10&sort=id,desc"
```
### Consultar um veículo específico
``` bash
curl -X GET http://localhost:8080/veiculos/1
```
