<h1 align="center">🎓 Student Management System</h1>

<p align="center">
  A <b>Spring Boot CRUD application</b> for managing student records.<br>
  Easily <b>add, update, view, and delete students</b> using a simple web interface.
</p>

<hr>

<h2>🚀 Tech Stack</h2>

<ul>
  <li>🧠 <b>Backend:</b> Spring Boot</li>
  <li>🎨 <b>Frontend (View):</b> Thymeleaf</li>
  <li>🗄️ <b>Database:</b> PostgreSQL</li>
  <li>🔄 <b>ORM:</b> Spring Data JPA (Hibernate)</li>
  <li>🐳 <b>Containerization:</b> Docker</li>
  <li>⚙️ <b>Build Tool:</b> Maven</li>
  <li>🌐 <b>Server Port:</b> 8081</li>
</ul>

<hr>

<h2>⚙️ Configuration (Environment Variables)</h2>

<p>This project uses <b>environment variables</b> for database configuration.</p>

<h3>🔐 Required Environment Variables</h3>

<pre><code>
DB_URL=jdbc:postgresql://localhost:5432/sms
DB_USERNAME=postgres
DB_PASSWORD=your_password
</code></pre>

<h3>📄 application.properties</h3>

<pre><code>
spring.application.name=student-management-system
server.port=8081

spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
</code></pre>

<hr>

<h2>📚 Application Endpoints</h2>

<table>
  <tr>
    <th>HTTP Method</th>
    <th>Endpoint</th>
    <th>Description</th>
    <th>View / Redirect</th>
  </tr>
  <tr>
    <td><b>GET</b></td>
    <td>/students</td>
    <td>Display all students</td>
    <td>students.html</td>
  </tr>
  <tr>
    <td><b>GET</b></td>
    <td>/students/new</td>
    <td>Show form to add a new student</td>
    <td>create_student.html</td>
  </tr>
  <tr>
    <td><b>POST</b></td>
    <td>/students</td>
    <td>Save a new student</td>
    <td>Redirect → /students</td>
  </tr>
  <tr>
    <td><b>GET</b></td>
    <td>/students/edit/{id}</td>
    <td>Edit student by ID</td>
    <td>edit_student.html</td>
  </tr>
  <tr>
    <td><b>POST</b></td>
    <td>/students/{id}</td>
    <td>Update student details</td>
    <td>Redirect → /students</td>
  </tr>
  <tr>
    <td><b>GET</b></td>
    <td>/students/{id}</td>
    <td>Delete student</td>
    <td>Redirect → /students</td>
  </tr>
</table>

<hr>

<h2>🗂️ Project Structure</h2>

<pre><code>
src/
 └── main/
     ├── java/com/suvam/sms/
     │   ├── controller/StudentController.java
     │   ├── entity/Student.java
     │   ├── repository/StudentRepository.java
     │   └── service/StudentService.java
     └── resources/
         ├── templates/
         │   ├── students.html
         │   ├── create_student.html
         │   └── edit_student.html
         └── application.properties
Dockerfile
</code></pre>

<hr>

<h2>🐳 Docker Support</h2>

<h3>📄 Dockerfile</h3>

<pre><code>
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/student-management-system.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
</code></pre>

<hr>

<h2>🏁 Features</h2>

<ul>
  <li>✅ List all students</li>
  <li>✅ Add new student</li>
  <li>✅ Update student details</li>
  <li>✅ Delete student</li>
  <li>✅ PostgreSQL integration</li>
  <li>✅ Environment variable based configuration</li>
  <li>✅ Dockerized application</li>
</ul>


