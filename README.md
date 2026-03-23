# 📚 Library Book Search System

A **Java Full Stack Web Application** developed using **Spring Boot, Thymeleaf, Bootstrap, and MySQL** to manage library books efficiently.

This system allows users to **add, search, sort, view, and delete books** through a clean and professional dashboard interface.

---

## 🎯 Project Objective

The goal of this project is to implement **real-world full stack development concepts** such as:

- MVC Architecture using Spring Boot  
- Backend business logic implementation  
- Database integration using JPA & Hibernate  
- Dynamic UI rendering using Thymeleaf  
- Professional responsive UI design  

---

## ✨ Features

### 📖 Book Management

- ➕ Add new books to the library  
- ❌ Prevent duplicate books (same title & author validation)  
- 📋 Display all books dynamically  
- 🗑 Delete books from database  

### 🔍 Search Functionality

- 🔎 Search books by **title**  
- 🔎 Search books by **author**  
- 📊 Display filtered search results  

### 🔤 Sorting

- 🔠 Sort books alphabetically  
- 📚 Organized book listing  

### 💬 User Experience

- ✅ Success message when book is added  
- ⚠ Error message for duplicate entries  
- 🎨 Clean responsive UI using Bootstrap  

---

## 🛠 Tech Stack

### 💻 Backend
- Java  
- Spring Boot  
- Spring MVC  
- Spring Data JPA  
- Hibernate  

### 🎨 Frontend
- HTML  
- CSS  
- Bootstrap  
- Thymeleaf  

### 🗄 Database
- MySQL  

### ⚙ Build Tool
- Maven  

---

## 🏗 System Architecture
Thymeleaf UI
↓
Spring Boot Controller
↓
Service Layer (Business Logic)
↓
Repository Layer (JPA)
↓
MySQL Database

---

## 📂 Project Structure
library-book-search-system
│
├── controller
│ LibraryController.java
│
├── service
│ LibraryService.java
│
├── repository
│ BookRepository.java
│
├── model
│ Book.java
│
├── templates
│ index.html
│ result.html
│
├── application.properties
└── pom.xml

---

⚙️ How to Run the Project
1️⃣ Backend Setup

Navigate to project folder:

cd library-book-search-system

Build and run the application:

mvn clean install
mvn spring-boot:run

Application runs on:

👉 http://localhost:8085

2️⃣ Database Setup

Create MySQL database:

CREATE DATABASE librarydb;

Update database configuration inside:

src/main/resources/application.properties

Example configuration:

spring.datasource.url=jdbc:mysql://localhost:3306/librarydb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
🌐 Application Workflow
User opens homepage
System loads existing books from database
User can add a new book
Duplicate validation is performed
User can search books by title or author
User can sort books alphabetically
All operations update UI dynamically
🎯 Learning Outcomes
Implementation of Spring Boot MVC layered architecture
Integration of MySQL database using JPA
Development of dynamic server-side rendered UI using Thymeleaf
Designing clean placement-ready full stack project
Understanding real-time debugging and validation handling


🌐 Application URLs
Library Home Page → http://localhost:8085/
Add New Book → /addBook
Search Books → /searchBook
Sort Books → /sortBooks
🔹 Home Page
<img width="1895" height="913" alt="image" src="https://github.com/user-attachments/assets/30929bcf-1452-417a-98d5-5222c42928c4" />
🔹 Search Books
<img width="1893" height="915" alt="image" src="https://github.com/user-attachments/assets/28c4de1c-bc58-4870-ba0f-4d0c2c26a14e" />
🔹 Sort All Books
<img width="1908" height="892" alt="image" src="https://github.com/user-attachments/assets/3033db07-9ea2-4765-b4df-365020a8d054" />
🔹 Add Book
<img width="734" height="428" alt="image" src="https://github.com/user-attachments/assets/5d458c20-003d-4877-96c9-c4a78d2a185a" />

🔮 Future Improvements
Update book details feature
Login & authentication module
Pagination for large datasets
REST API development for React frontend
Deployment on cloud platform
