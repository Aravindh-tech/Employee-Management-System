# Employee Management System

A backend-focused Employee Management System developed using **Java 17, Spring Boot, and PostgreSQL**. The application provides RESTful APIs and GraphQL operations for employee, user, company, and department management, with JWT authentication, auditing, and notifications.

## 🚀 Live Deployment

**Base URL:**
[https://employee-management-system-1-f3t0.onrender.com](https://employee-management-system-1-f3t0.onrender.com)

The application is deployed on **Render** with a PostgreSQL database.

> Note: The free Render instance may spin down after inactivity, so the first request after a period of inactivity may take longer to respond.

## 🛠️ Technologies Used

| Category     | Technologies                        |
| ------------ | ----------------------------------- |
| Language     | Java 17                             |
| Framework    | Spring Boot                         |
| Database     | PostgreSQL                          |
| Security     | Spring Security, JWT                |
| ORM          | Spring Data JPA, Hibernate          |
| API          | RESTful APIs, GraphQL               |
| Data Storage | PostgreSQL JSONB                    |
| Email        | SMTP, JavaMailSender                |
|              |                                     |
| Deployment   | Render                              |
| Tools        | IntelliJ IDEA, Postman, Git, GitHub |

## ✨ Features

### Authentication & Security

- User registration and login
- JWT-based authentication and authorization
- Secured employee endpoints
- Password encryption using a password encoder

### Employee Management

- Create, retrieve, and update employee records
- Soft-delete employee records
- Restore soft-deleted employees
- Search employees by partial name or email
- Filter employees by department
- Pagination and sorting

### Company, User & Department Management

- User management
- Company creation and retrieval
- Department-based employee filtering
- Customized user details retrieval using related company and department data

### Data Management

- PostgreSQL JSONB fields for additional employee information
- DTO-based request and response structures
- Request validation
- Global exception handling

### Auditing & Notifications

- Automatic creation and modification auditing
- Track the user who created or last modified a record
- SMTP email notifications
- WebSocket-based real-time updates

### GraphQL

- GraphQL queries and mutations for supported operations

## 🔐 Authentication & JPA Auditing

The application uses Spring Security and JWT to authenticate users and secure protected endpoints.

JPA Auditing automatically tracks employee creation and modification details:

| Annotation          | Purpose                                         |
| ------------------- | ----------------------------------------------- |
| `@CreatedDate`      | Records when an employee was created            |
| `@LastModifiedDate` | Records the latest modification time            |
| `@CreatedBy`        | Records the user who created the employee       |
| `@LastModifiedBy`   | Records the user who last modified the employee |

The `AuditorAware` implementation retrieves the authenticated user's ID from the Spring Security context.

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

## 📡 API Endpoints

The following are representative endpoints. Refer to the Postman collection and the application’s controller mappings for the complete, current API list.

| Method | Endpoint                         | Description                                             |
| ------ | -------------------------------- | ------------------------------------------------------- |
| POST   | `/api/auth/login`                | Authenticate user and generate JWT                      |
| POST   | `/api/users/add-user`            | Register or create a user                               |
| POST   | `/api/company/add`               | Create a company                                        |
| GET    | `/api/company`                   | Retrieve companies                                      |
| POST   | `/api/employees/data`            | Create an employee                                      |
| GET    | `/api/employees`                 | Retrieve employees with pagination, sorting, and search |
| GET    | `/api/employees/{id}`            | Retrieve employee by ID                                 |
| PUT    | `/api/employees/update/{id}`     | Update employee                                         |
| DELETE | `/api/employees/delete/{id}`     | Delete employee                                         |
| DELETE | `/api/employees/softDelete/{id}` | Soft-delete employee                                    |

Additional endpoints support department filtering, employee restoration, GraphQL operations, email notifications, and other implemented features.

## 🧪 API Testing

The API can be tested using Postman.

Testing includes:

- User registration and login
- JWT authentication and authorization
- Company and employee operations
- Employee search and department filtering
- Pagination and sorting
- Auditing and soft deletion
- JSONB data operations
- GraphQL queries and mutations
- Email notifications

### Postman Collection

Import the Postman collection to test the API:

[Download Postman Collection](./jwt.postman_collection.json)

## ⚙️ Installation & Setup

### Prerequisites

- Java 17
- Maven
- PostgreSQL
- Git

### 1. Clone the repository

```bash
git clone https://github.com/Aravindh-tech/Employee-Management-System.git
cd Employee-Management-System
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

Configure these variables in your local environment or IDE run configuration.

### 3. Run the application

For macOS/Linux:

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

## 📸 Screenshots

Add screenshots of the Postman responses to a `screenshots/` folder and reference them here.

Example:

```markdown
![Employee API Response](screenshots/employee-response.png)
```


## 👨‍💻 Author

**Aravindhan P**
Java Developer | Spring Boot Developer

[GitHub Profile](https://github.com/Aravindh-tech)

[Project Repository](https://github.com/Aravindh-tech/Employee-Management-System)

---

⭐ If you find this project useful, consider giving it a star!
