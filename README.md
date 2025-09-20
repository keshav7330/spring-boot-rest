# 🌱 Spring Boot REST API – Job Portal (Practice Project)

This is a simple Spring Boot RESTful API that manages job posts. It is a practice project demonstrating a modern web application architecture using **Spring Boot with Spring Data JPA** for persistence.

---

## ✨ Features

* **Get All Jobs**: Fetch all available job posts from the database.
* **Get Job by ID**: Fetch a specific job post using its unique `postId`.
* **Add Job**: Create and save a new job post to the database.
* **Update Job**: Update the details of an existing job post.
* **Delete Job**: Remove a job post by its `postId`.

---

## 📁 Project Structure

Here is an overview of the project's directory structure, now reflecting the use of JPA.

```text
com.keshav.Spring_boot_rest
|-- model/
|   |-- JobPost.java         # @Entity model for the database table
|-- repo/
|   |-- JobRepo.java         # JPA Repository interface for database operations
|-- service/
|   |-- JobService.java      # Service layer containing business logic
|-- JobRestController.java # REST Controller for handling API endpoints
```

---

## 🔑 API Endpoints

The base URL for running the API locally is `http://localhost:8080`.

| Method | Endpoint              | Description                    |
| :----- | :-------------------- | :----------------------------- |
| `GET`  | `/jobPosts`           | Get all job posts              |
| `GET`  | `/jobPost/{postId}`   | Get a job post by ID           |
| `POST` | `/jobPost`            | Add a new job post             |
| `PUT`  | `/jobPost`            | Update an existing job post    |
| `DELETE`| `/jobPost/{postId}`   | Delete a job post by ID        |

---

## ⚙️ Tech Stack

* **Java 17+**
* **Spring Boot**
* **Spring Web** (for REST APIs)
* **Spring Data JPA** (for database persistence)
* **H2 Database** (In-memory database for easy setup and testing)
* **Maven** (for dependency management)

---

## 🎯 How to Run

1.  **Clone the repository.**
2.  **Open the project** in your favorite IDE (e.g., IntelliJ IDEA).
3.  **Check Database Configuration:** The project is configured to use the H2 in-memory database by default. You can view and modify settings in `src/main/resources/application.properties`.
4.  **Run the application** by executing the main class: `SpringBootRestApplication`.
5.  Once running, you can access the **H2 Console** at `http://localhost:8080/h2-console` to view the database tables and data directly.
6.  Use **Postman** or a similar tool to test the API endpoints.

---

## 📝 Project Notes

* This project now uses **Spring Data JPA** for persistent storage, which is a major upgrade from the previous in-memory list.
* The default database is **H2**, which creates the database in memory and is perfect for development and testing. This can be easily swapped out for a production database like PostgreSQL or MySQL by changing the dependencies and `application.properties` file.