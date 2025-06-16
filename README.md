🧳 Traveller Application - User Login Module (Mini Project Summary)
The Traveller Application provides a secure user authentication system that enables users to register and log in to access personalized travel features.

🔧 Technologies Used:

Backend: Java, Spring Boot

API Design: RESTful Web Services

Persistence: Spring Data JPA, Hibernate

Database: MySQL (or any RDBMS)

✅ Key Features:

User Registration: Users can sign up with unique email and password, stored securely in the database.

User Login: REST API verifies credentials and returns appropriate responses.

Secure Password Handling: Passwords are hashed using BCrypt before storage.

Error Handling: Meaningful responses for invalid login attempts or duplicate registrations.

JPA Integration: Efficient communication with the database using JPA repositories.

📦 REST API Endpoints:

POST /api/auth/register – Register a new user

POST /api/auth/login – Authenticate and login user
