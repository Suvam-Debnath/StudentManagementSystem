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


![1](https://github.com/user-attachments/assets/0c6b30aa-0726-4942-8861-b17bc7a34229)
![2](https://github.com/user-attachments/assets/12cb3dde-0897-43e8-83e0-55fed0bc22f1)
