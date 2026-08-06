# 🎓 College Placement Management System

A Full Stack College Placement Management System developed using Java Spring Boot, React, and MySQL. The application helps manage students, companies, and placements through a simple dashboard.

## 🚀 Features

- Student Management
  - Add Student
  - View All Students
  - Update Student
  - Delete Student

- Company Management
  - Add Company
  - View All Companies

- Placement Management
  - Add Placement
  - View All Placements

- Dashboard
  - Total Students
  - Total Companies
  - Total Placements

## 🛠️ Tech Stack

### Backend
- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

### Frontend
- React.js
- Axios
- HTML
- CSS
- JavaScript

### Database
- MySQL

### Tools
- VS Code
- MySQL Workbench
- Postman
- Git
- GitHub

---

## 📂 Project Structure

```
college-placement-management-system
│
├── frontend
│   ├── src
│   ├── public
│   └── package.json
│
├── src
│   └── main
│       ├── java
│       │   └── com
│       │       └── aswani
│       │           └── placement_system
│       │               ├── controller
│       │               ├── entity
│       │               ├── repository
│       │               └── service
│       └── resources
│           └── application.properties
│
├── pom.xml
└── README.md
```

---

## ⚙️ Backend Setup

1. Clone the repository

```bash
git clone https://github.com/Aswani333/college-placement-management-system.git
```

2. Open the backend project.

3. Create a MySQL database.

```sql
CREATE DATABASE placement_db;
```

4. Configure the database in `application.properties`.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/placement_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
```

5. Run the Spring Boot application.

```bash
.\mvnw.cmd spring-boot:run
```

Backend runs on:

```
http://localhost:8080
```

---

## 💻 Frontend Setup

Go to the frontend folder.

```bash
cd frontend
```

Install dependencies.

```bash
npm install
```

Run React.

```bash
npm start
```

Frontend runs on:

```
http://localhost:3000
```

---

## 📡 REST APIs

### Student APIs

| Method | Endpoint |
|---------|----------|
| GET | /students |
| GET | /students/{id} |
| POST | /students |
| PUT | /students/{id} |
| DELETE | /students/{id} |

### Company APIs

| Method | Endpoint |
|---------|----------|
| GET | /companies |
| POST | /companies |

### Placement APIs

| Method | Endpoint |
|---------|----------|
| GET | /placements |
| POST | /placements |

---

## 📷 Screenshots

- Dashboard
- Student Management
- Company Management
- Placement Management

---

## 👨‍💻 Author

**Aswani Tekuri**

GitHub:
https://github.com/Aswani333

---

## 📄 License

This project is created for learning purposes.
