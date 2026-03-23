📚 Library Book Search System

A full-stack web application developed using Spring Boot, MySQL, Thymeleaf, HTML, CSS, and Bootstrap to manage library books efficiently.

The system allows users to add books, search books, sort books, view available books, and delete records from the database through a simple and professional user interface.

✨ Features
📖 1. Book Management
Add new books into the library database
Prevent duplicate entries based on book title and author
Display all existing books dynamically on homepage
Delete books directly from database
🔎 2. Search Functionality
Search books by title
Search books by author
Display filtered search results instantly
🔤 3. Sorting
Sort all books alphabetically by title
Helps in better book organization
💬 4. User Feedback Messages
Success message when a book is added
Error message when duplicate book is entered
Clean UI alerts for better user experience
🎨 5. User Interface
Responsive layout using Bootstrap
Professional dashboard-like design
Two-panel layout showing existing books and actions panel
🗄️ Database Design

The system uses a relational database with a single main table:

Book Table

Field	Description
id	Unique book identifier
title	Name of the book
author	Author of the book

Data is persisted using Spring Data JPA and Hibernate ORM mapping.

🛠️ Tech Stack
Backend
Java
Spring Boot
Spring MVC
Spring Data JPA
Hibernate
Frontend
HTML
CSS
Bootstrap
Thymeleaf Template Engine
Database
MySQL
Build Tool
Maven
Development Tool
VS Code
📁 Project Structure
library-book-search-system
│
├── controller
│   └── LibraryController.java
│
├── service
│   └── LibraryService.java
│
├── repository
│   └── BookRepository.java
│
├── model
│   └── Book.java
│
├── templates
│   ├── index.html
│   └── result.html
│
├── application.properties
└── pom.xml
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
🔮 Future Improvements
Update book details feature
Login & authentication module
Pagination for large datasets
REST API development for React frontend
Deployment on cloud platform
👩‍💻 Author

Roshitha Naga Bhavani Singam
Final Year B.Tech – Computer Science Engineering
Aspiring Java Full Stack Developer
