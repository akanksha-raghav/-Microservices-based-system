# E-commerce Microservices System

This repository contains a microservices-based e-commerce system built using Spring Boot.

## Services

1. **User Authentication Service**
   - Manages user registration and login.
   - Uses JWT for authentication.

2. **Product Management Service**
   - CRUD operations for products.
   - Implements optimistic locking for concurrent updates.

3. **Order Processing Service**
   - Manages order creation and retrieval.
   - Associates orders with users and products.

## Technology Stack

- Spring Boot 2.x
- Spring Security + JWT
- Spring Data JPA
- MySQL (or PostgreSQL) for data storage

## Setup Instructions

1. **Database Setup**
   - Create a MySQL database named `ecommerce_db`.
   - Configure database connection in `application.properties`.

2. **Running the Application**
   - Each service can be run independently using `mvn spring-boot:run`.
   - Alternatively, build JAR files using `mvn clean package` and run with `java -jar <jar-file-name>`.

3. **Endpoints**

   - **User Authentication Service**
     - `POST /api/register`: Register a new user.
     - `POST /api/login`: Login with username and password.

   - **Product Management Service**
     - `GET /api/products`: Get all products.
     - `GET /api/products/{productId}`: Get product by ID.
     - `POST /api/products`: Create a new product.
     - `PUT /api/products/{productId}`: Update product by ID.
     - `DELETE /api/products/{productId}`: Delete product by ID.

   - **Order Processing Service**
     - `GET /api/orders`: Get all orders.
     - `GET /api/orders/{orderId}`: Get order by ID.
     - `POST /api/orders`: Create a new order.
     - `GET /api/orders/user/{userId}`: Get orders by user ID.

4. **Testing**
   - Unit tests are included for critical components.
   - Use `mvn test` to run tests.

5. **Deployment**
   - Deploy using Docker and Docker Compose for containerized deployment.
   - Provide environment-specific configurations for production deployment.

## Assumptions

- Authentication is mandatory for accessing protected endpoints.
- Optimistic locking is sufficient for managing concurrency in product updates.

## Additional Notes

- Ensure proper error handling and logging in production environment.
- Consider implementing additional features like API rate limiting, caching, and monitoring for enhanced functionality.

