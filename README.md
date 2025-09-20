🌱 Spring Boot REST API – Job Portal (Practice Project)

This is a simple Spring Boot RESTful API that manages Job Posts.
It is a practice project demonstrating the use of Controller → Service → Repository layers in Spring Boot.



- Features

Get All Jobs – Fetch all available job posts.

Get Job by ID – Fetch a specific job post using postId.

Add Job – Add a new job post.

Update Job – Update details of an existing job post.

Delete Job – Delete a job post by postId.



- Project Structure
  
com.keshav.Spring_boot_rest
│
├── model/
│   └── JobPost.java          # Entity/model representing a job post
│
├── repo/
│   └── JobRepo.java          # Repository layer (in-memory storage)
│
├── service/
│   └── JobService.java       # Service layer (business logic)
│
└── JobRestController.java    # REST Controller (API endpoints)



🔑 API Endpoints

Base URL: http://localhost:8080

Method	         Endpoint	           Description
GET	             /jobPosts	          Get all job posts
GET	             /jobPost/{postId}	  Get a job post by ID
POST	           /jobPost            	Add a new job post
PUT	             /jobPost           	Update an existing job
DELETE	         /jobPost/{postId}	  Delete a job post by ID



📦 Example Request Body (JobPost JSON)
{
  "postId": 2,
  "postProfile": "Backend Developer",
  "postDesc": "Experience with Spring Boot & SQL",
  "reqExperience": 2,
  "postTechStack": ["Java", "Spring Boot", "SQL"]
}



⚙️ Tech Stack

Java 17+
Spring Boot
Spring Web (REST API)
Maven



🎯 How to Run

Clone the repository
Open in IntelliJ IDEA or any IDE.
Run the main class:
SpringBootRestApplication



Test APIs using Postman.

🔗 Frontend Support

The API is configured with:
@CrossOrigin(origins = "http://localhost:3000") - chnage it as per required.


👉 This allows your React app (running on port 3000) to consume the API without CORS issues.

📝 Notes

Currently uses in-memory storage (JobRepo) instead of a database.

Can be extended with Spring Data JPA + MySQL/PostgreSQL in the future.
