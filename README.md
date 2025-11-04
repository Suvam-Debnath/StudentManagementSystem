<h1 align="center">🎓 Student Management System</h1>

<p align="center">
  A <b>Spring Boot CRUD application</b> for managing student records.<br>
  It allows users to <b>add, update, view, and delete students</b> easily through a web interface.
</p>

<hr>

<h2>🚀 Tech Stack</h2>

<ul>
  <li><b>Backend:</b> Spring Boot</li>
  <li><b>Frontend (View):</b> Thymeleaf</li>
  <li><b>Database:</b> MySQL</li>
  <li><b>ORM:</b> Spring Data JPA (Hibernate)</li>
  <li><b>Server Port:</b> 8081</li>
</ul>

<hr>

<h2>⚙️ Configuration</h2>

<p>Add the following to your <code>application.properties</code> file:</p>

<pre>
<code>
spring.application.name=Student-management-system
server.port=8081

spring.datasource.url=jdbc:mysql://localhost:3306/sms
spring.datasource.username=root
spring.datasource.password=Suvam@123

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update

logging.level.org.hibernate.SQL=DEBUG
</code>
</pre>

<hr>

<h2>📚 API Endpoints</h2>

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
    <td>Show form to create a new student</td>
    <td>create_student.html</td>
  </tr>
  <tr>
    <td><b>POST</b></td>
    <td>/students</td>
    <td>Save a new student to the database</td>
    <td>Redirects to /students</td>
  </tr>
  <tr>
    <td><b>GET</b></td>
    <td>/students/edit/{id}</td>
    <td>Show form to edit a specific student</td>
    <td>edit_student.html</td>
  </tr>
  <tr>
    <td><b>POST</b></td>
    <td>/students/{id}</td>
    <td>Update student details by ID</td>
    <td>Redirects to /students</td>
  </tr>
  <tr>
    <td><b>GET</b></td>
    <td>/students/{id}</td>
    <td>Delete a student by ID</td>
    <td>Redirects to /students</td>
  </tr>
</table>

<hr>

<h2>🧩 Example Requests</h2>

<h3>1. View All Students</h3>
<pre><code>GET http://localhost:8081/students</code></pre>

<h3>2. Add a New Student</h3>
<pre><code>
GET http://localhost:8081/students/new
POST http://localhost:8081/students
</code></pre>

<h3>3. Edit an Existing Student</h3>
<pre><code>
GET http://localhost:8081/students/edit/{id}
POST http://localhost:8081/students/{id}
</code></pre>

<h3>4. Delete a Student</h3>
<pre><code>GET http://localhost:8081/students/{id}</code></pre>

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
</code></pre>

<hr>

<h2>💻 Run the Project</h2>

<ol>
  <li>Clone the repository:
    <pre><code>git clone https://github.com/yourusername/student-management-system.git</code></pre>
  </li>
  <li>Open the project in your IDE (IntelliJ / Eclipse / VS Code).</li>
  <li>Update MySQL credentials in <code>application.properties</code>.</li>
  <li>Run the application:
    <pre><code>mvn spring-boot:run</code></pre>
  </li>
  <li>Open your browser and visit:
    <pre><code>http://localhost:8081/students</code></pre>
  </li>
</ol>

<hr>

<h2>🏁 Features</h2>

<ul>
  <li>✅ List all students</li>
  <li>✅ Add new student</li>
  <li>✅ Edit existing student</li>
  <li>✅ Delete student</li>
  <li>✅ Connected with MySQL database</li>
</ul>

<hr>

<h2>📸 (Optional) Screenshots</h2>

<p>You can include your UI screenshots here later for better presentation:</p>

<pre><code>
![Student List Page](screenshots/students-page.png)
![Add Student Page](screenshots/create-student-page.png)
![Edit Student Page](screenshots/edit-student-page.png)
</code></pre>

<hr>

<h2>👨‍💻 Author</h2>

<p>
  <b>Suvam Debnath</b><br>
</p>

<p>
  📧 <b>Email:</b> your-email@example.com <br>
  🌐 <b>GitHub:</b> <a href="https://github.com/yourusername" target="_blank">https://github.com/yourusername</a>
</p>



