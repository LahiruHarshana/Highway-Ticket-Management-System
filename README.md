# Highway Ticket Management System

## Overview
The Highway Ticket Management System is a microservice-based backend application designed to manage highway tickets efficiently. The system handles ticket issuance, vehicle registration, user management, and payment processing internally, without relying on external payment gateways. By leveraging Spring Boot and Spring Cloud technologies, this application ensures scalability, resilience, and seamless integration of services.

## Business Scenario
In today's dynamic transportation landscape, managing highway tickets efficiently is crucial for ensuring smooth traffic flow and compliance with regulations. This system streamlines the handling of ticket issuance, vehicle registration, user management, and payment processing.

## Technologies Used
- **Spring Boot**
- **Spring Cloud (Eureka, Config Server, Gateway)**
- **Postman** for API testing

## Components and Implementation

### Service Registry and Discovery (Eureka)
- **Purpose**: Enable microservices to register themselves and discover other services dynamically.
- **Implementation**: Each microservice registers with Eureka upon startup, facilitating communication without hardcoded dependencies.

### Configuration Server (Spring Cloud Config)
- **Purpose**: Centralize configuration management.
- **Implementation**: Microservices fetch configurations from the Config Server, allowing updates without redeployment.

### API Gateway (Spring Cloud Gateway)
- **Purpose**: Serve as a single-entry point for client requests.
- **Implementation**: Routes requests to appropriate microservices based on URI and HTTP method, leveraging Eureka for dynamic service discovery.

### Microservices
- **Ticket Service**
  - **Business Logic**: Manages the ticket lifecycle.
  - **Functions**: Creation, status updates, and retrieval of ticket information.
- **Vehicle Service**
  - **Business Logic**: Handles vehicle operations.
  - **Functions**: Registration, updates, and retrieval of vehicle details.
- **User Service**
  - **Business Logic**: Manages user and owner information.
  - **Functions**: Registration, profile updates, and credential verification.
- **Payment Service**
  - **Business Logic**: Facilitates secure payment processing internally.
  - **Functions**: Validate payment details, update ticket statuses upon successful payment confirmation.

## Testing Approach
- Use Postman to test all API endpoints.
- Focus exclusively on backend functionality, excluding user interface development.
- Ensure functionality and correctness across microservices.
- Validate error handling and edge cases.

## Submission Guidelines
1. **GitHub Repository**:
   - Push your project to a GitHub repository.
2. **Postman Collection**:
   - Include a Postman collection JSON file in the main directory of your repository.
   - This collection should contain all API endpoints with detailed requests and responses.

## Getting Started

### Prerequisites
- JDK 11+
- Maven
- Postman

### Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd highway-ticket-management-system




# API TESTING DOC

    https://app.getpostman.com/join-team?invite_code=677874c71a1d38c2ad805b5ca5fd0fad&target_code=71c940d2e8d7ba400ec695bcd339f273

