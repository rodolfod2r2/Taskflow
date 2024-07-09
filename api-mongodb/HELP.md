# Taskflow-API-MongoDB Help

## Overview

Taskflow-API-MongoDB is a Java-based RESTful API that allows users to manage tasks with MongoDB as the backend database.

## Getting Started

To get started with the API:

1. Clone the repository.
2. Ensure you have JDK 8+ and MongoDB installed.
3. Configure your MongoDB connection in `application.properties`.
4. Build and run the application using Maven:
   ```bash
   mvn clean install
   java -jar target/taskflow-api-mongodb-1.0.jar
    ```

Access the API at http://localhost:8080. API Endpoints GET /tasks: Retrieve all tasks. GET /tasks/{id}: Retrieve a
specific task by ID. POST /tasks: Create a new task. PUT /tasks/{id}: Update an existing task. DELETE /tasks/{id}:
Delete a task by ID. POST /users/signup: Register a new user. POST /users/login: Authenticate and receive a JWT token.
For detailed API documentation, refer to API Documentation.

Configuration Configure MongoDB connection details in application.properties.

Contributing Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.