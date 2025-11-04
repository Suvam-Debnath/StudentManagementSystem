# 🎓 Student Management System

This is a **Spring Boot CRUD application** for managing student records.  
It allows users to **add, update, view, and delete students** easily through a web interface.

---

## 🚀 Tech Stack

- **Backend:** Spring Boot  
- **Frontend (View):** Thymeleaf  
- **Database:** MySQL  
- **ORM:** Spring Data JPA (Hibernate)  
- **Server Port:** 8081  

---

## ⚙️ Configuration

Add the following to your `application.properties` file:

```properties
spring.application.name=Student-management-system
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/sms
spring.datasource.username=root
spring.datasource.password=Suvam@123

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

logging.level.org.hibernate.SQL=DEBUG


