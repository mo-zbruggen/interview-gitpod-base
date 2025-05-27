# Tasks

Task 1: Create GET and DELETE endpoints for LearningResource

Task 2A: Update the `docker-compose` to include a Postgres-16 image

Task 2B: Update the `application.resources` to migrate from the H2 database to PostgreSQL from docker-compose


# Optional

Task 3: Start a unit test for both the Service and Controller Layers

Task 4: Setup basic Swagger/OpenAPI documentation using SpringDoc

Task 5: Setup Spring Security to include basic auth on all DELETE endpoints



# Learning Resource Tracker

A simple backend REST API for tracking learning resources such as articles, tutorials, videos, and more.

## 🚀 Tech Stack

### Intended Stack (Production)
- **Java 17**
- **Spring Boot 3**
- **PostgreSQL** (Relational database)
- **JPA / Hibernate**
- **Docker + Docker Compose**
- **JUnit 5** for testing

### Current Stack (Development)
- **Java 17**
- **Spring Boot 3**
- **H2 (in-memory database)** for local development
- **JPA / Hibernate**

---

## 📦 Features

- CRUD API for managing learning resources
- Search by status or tags
- RESTful architecture
- H2 console enabled for quick inspection during development

---

## 🔧 Setup Instructions

### Run with H2 (Default)

No database setup required.

```bash
mvn spring-boot:run
```

The app will start with an in-memory H2 database.

Access H2 console at: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: (leave blank)


## 📬 API Endpoints

| Method | Endpoint                | Description               |
| ------ | ----------------------- | -----------------------   |
| GET    | `/`        | List all resources        |
| POST   | `/`        | Create a new resource     |
| GET    | `/id}`   | Get resource by ID (TODO) |
| DELETE | `/id}`   | Delete resource           |
| DELETE | `/id}`   | Delete resource (TODO)    |
| GET    | `/search` | Search by status or tag   |
