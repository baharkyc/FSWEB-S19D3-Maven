# Java Spring REST API with Security

This project is designed to implement a secure REST API for a banking system using **Spring Boot** and **Spring Security**.

## Features
- **Secure REST API**: Implemented using Spring Boot and Spring Security.
- **JDBC Authentication**: User authentication via database using Spring Security.
- **Role-based Authorization**: Users can have different roles such as ADMIN or USER.

## Technologies Used
- **Spring Boot**: For building the REST API.
- **Spring Security**: For securing the application with roles and authentication.
- **Maven**: For dependency management.

## Getting Started

1. **Clone the repository**:
   ```bash
   git clone https://github.com/baharkyc/FSWEB-S19D3-Maven.git
   ```

2. **Open in IntelliJ IDEA** (or any other IDE of your choice).

3. **Install dependencies** using Maven:
   ```bash
   mvn install
   ```

4. **Run the application**:
   The application will run on port 9000 by default.

## Configuration

- **Database Schema**: A schema named `bank` should be created, where all database tables will be defined.

## Project Structure
- `controller`: Contains the API endpoints.
- `config`: Security configuration and other settings.
- `entity`: Contains the data models (e.g., `Member`, `Role`, `Account`).
- `dao`: Repository interfaces for data access.
- `service`: Business logic for handling data operations.

## Tasks

1. Set up Spring Security and configure role-based access.
2. Implement JDBC Authentication for the user (`Member` class).
3. Create repositories for user management.
4. Implement DTOs for registration (`RegisterResponse` and `RegistrationMember`).
