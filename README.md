# Employee Management System

A secure, backend-focused Employee Management System developed using **Java, Spring Boot, and PostgreSQL**. The application provides RESTful APIs and GraphQL operations for employee management, authentication, auditing, and notifications.

## 🚀 Technologies Used

- **Language:** Java
- **Framework:** Spring Boot
- **Database:** PostgreSQL
- **Security:** Spring Security, JWT
- **ORM:** Spring Data JPA, Hibernate
- **API:** RESTful APIs, GraphQL
- **Data Storage:** PostgreSQL JSONB
- **Email:** SMTP, JavaMailSender
- **Tools:** IntelliJ IDEA, Postman, GitLab, GitHub

## ✨ Features

### Authentication & Security

- User registration and login
- JWT-based authentication and authorization
- Secured employee endpoints

### Employee Management

- Create, retrieve, update, and soft-delete employees
- Restore soft-deleted employee records
- Search employees by name or email
- Filter employees by department
- Pagination and sorting

### Data Management

- Automatic JPA auditing using `createdAt`, `updatedAt`, `createdBy`, and `updatedBy`
- PostgreSQL JSONB for additional employee information
- Native SQL queries for dynamic filtering and searching
- Duplicate email validation

### API & Notifications

- GraphQL queries and mutations
- SMTP email notifications
- WebSocket-based real-time updates
- Global exception handling and request validation

## 🏗️ Project Architecture

The application follows a layered architecture:

```text
Client
    ↓
Controller
    ↓
Service
    ↓
Repository
    ↓
PostgreSQL Database
```

Additional components include:

- **Entity:** Database table mapping
- **DTO:** Structured request and response objects
- **Security:** JWT authentication and authorization
- **Exception:** Centralized error handling
- **Config:** Application and integration configuration

## ⚙️ Installation & Setup

### Prerequisites

- Java 21 or compatible project JDK
- Maven
- PostgreSQL
- Git

### 1. Clone the repository

```bash
git clone https://github.com/Aravindh-tech/Employee-Management-System.git
```

### 2. Configure the database

Create a PostgreSQL database and configure the following environment variables:

```text
DB_URL=jdbc:postgresql://localhost:5432/employee_db
DB_USERNAME=your_database_username
DB_PASSWORD=your_database_password
JWT_SECRET=your_generated_jwt_secret
MAIL_USERNAME=your_email@gmail.com
MAIL_PASSWORD=your_gmail_app_password
```

### 3. Run the application

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

The application runs locally at:

```text
http://localhost:8080
```

## 📡 API Endpoints

| Method | Endpoint                                  | Description                   |
| ------ | ----------------------------------------- | ----------------------------- |
| POST   | `/api/auth/register`                      | Register a user               |
| POST   | `/api/auth/login`                         | Authenticate and generate JWT |
| POST   | `/api/employees`                          | Create employee               |
| GET    | `/api/employees`                          | Retrieve employees            |
| GET    | `/api/employees/{id}`                     | Retrieve employee by ID       |
| PUT    | `/api/employees/{id}`                     | Update employee               |
| DELETE | `/api/employees/{id}`                     | Soft-delete employee          |
| GET    | `/api/employees/search?keyword={keyword}` | Search employees              |
| GET    | `/api/employees/department/{department}`  | Filter by department          |
| GET    | `/api/employees/{id}/audit-logs`          | Retrieve audit history        |
| PATCH  | `/api/employees/{id}/restore`             | Restore employee              |
| GET    | `/api/employees/{id}/additional-details`  | Retrieve JSONB details        |
| PATCH  | `/api/employees/{id}/additional-details`  | Update JSONB details          |
|        |                                           |                               |

## 🧪 API Testing

API endpoints can be tested using Postman.

The project supports testing of:

- Authentication and JWT authorization
- Employee CRUD operations
- Search, filtering, pagination, and sorting
- Auditing and soft deletion
- JSONB data operations
- GraphQL queries and mutations
- Email notifications

## 👨‍💻 Author

**Aravindhan P**

Java Developer | Spring Boot Developer

[GitHub Profile](https://github.com/Aravindh-tech)

---

⭐ If you find this project useful, consider giving it a star!
