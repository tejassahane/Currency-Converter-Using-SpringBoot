# Employee Management System

A simple and modern **Employee Management System** built using **Spring Boot** with a clean and interactive frontend.  
This project demonstrates a full **CRUD application** (Create, Read, Update, Delete) for managing employee records.

---

## 🌟 Features

✔ Add new employees  
✔ View all employees  
✔ Update existing employee  
✔ Delete employee  
✔ Clean modern UI with JavaScript frontend  
✔ REST API built with Spring Boot  
✔ Uses Fetch API to connect frontend with backend

---

## 🛠 Technologies Used

| Layer | Technology |
|-------|------------|
| Backend | Java, Spring Boot |
| Frontend | HTML, CSS, JavaScript |
| Database | MySQL (or any JDBC-compatible DB) |
| Tools | Maven, IDE (IntelliJ / Eclipse), Git, GitHub |

---

## 🧠 Architecture

Frontend (static HTML + JS)
↑
Fetch API Calls
↓
Backend (Spring Boot REST Controllers)
↓
Service Layer → Repository → Database

yaml
Copy code

---

## 🚀 What You Get

✔ `GET /empapi/employees` — Get all employees  
✔ `GET /empapi/employee/{id}` — Get employee by ID  
✔ `POST /empapi/employee` — Add new employee  
✔ `PUT /empapi/employee` — Update existing employee  
✔ `DELETE /empapi/employee/{id}` — Delete employee by ID

---

## 📦 Project Structure

EmployeeManagementSystem/
│
├── src/
│ ├── main/
│ │ ├── java/… (Backend Code)
│ │ └── resources/
│ │ └── static/
│ │ └── employee.html ← Frontend UI
│ └── test/
├── .gitignore
├── pom.xml
└── README.md
