# spring-boot-postgresql

<!-- ABOUT THE PROJECT -->
## About The Project

This is an example app on how to use postgreSQL with spring boot and docker.

### Built With

* **Programming Language:** Java 17
* **FrameWork:** Spring Boot
* **Build Tool:** Maven
* **Database:** PostgreSQL
* **Containerization:** Docker
* **ORM:** Spring Data JPA

<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

* Java 17
* Docker

### Installation

1. Run docker using the docker-compose.yml file
2. Install the packages.
 ```sh
  mvn clean install
 ```
3. Run the spring boot application.
4. You can access users endpoints at
 ```sh
  localhost:8081/users
 ```
5. You can open adminer to check database values at:
```sh
localhost:8080
 ```
Using credentials:
* System: PostgreSQL
* Server: postgres
* Username: test
* Password: pass
* Database: mydb