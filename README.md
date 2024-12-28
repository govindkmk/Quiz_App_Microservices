# Quiz Application - Microservices Architecture

### Overview
This Quiz Application is built using **Microservices Architecture** to ensure scalability, modularity, and high performance. It demonstrates seamless integration of services, ensuring efficient operation and future scalability.

### Features
- **Question Service**
  - Manages a comprehensive question database.
  - Full CRUD functionality for questions.
- **Quiz Service**
  - Dynamically creates and manages quizzes.
  - Supports user participation and result processing.
- **Service Registry**
  - Built with **Netflix Eureka** for seamless service discovery and management.
- **API Gateway**
  - Centralized routing and load balancing.
  - Handles secure communication between microservices.

### Tech Stack
- **Backend**: Java 17, Spring Boot, Spring Cloud
- **Service Discovery**: Netflix Eureka
- **API Gateway**: Spring Cloud Gateway MVC
- **Build Tool**: Maven

### Architecture Diagram
```
Question Service <--> API Gateway <--> Quiz Service
        \                          /
         \------------------------/
                  Service Registry
```

### Prerequisites
1. **Java 17** installed.
2. **Maven** for dependency management.
3. Docker (Optional, for containerized deployment).

### Running the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/quiz-app-microservices.git
   cd quiz-app-microservices
   ```
2. Build and run individual services:
   ```bash
   mvn spring-boot:run -pl question-service
   mvn spring-boot:run -pl quiz-service
   mvn spring-boot:run -pl service-registry
   mvn spring-boot:run -pl api-gateway
   ```
3. Access the API Gateway (default port: 8765).

### Key Highlights
- Microservices communicate with each other through the API Gateway.
- Each service is independently deployable and maintainable.
- Service discovery simplifies adding or removing services dynamically.

### Future Enhancements
- Add user authentication and authorization.
- Enhance quiz reporting and analytics.
- Introduce containerization with Docker for deployment.

### Acknowledgments
- Inspired by modern software development practices in Microservices.

Feel free to fork, explore, and contribute! 🚀

**Here's Screenshots of API's:**

![Eureka](https://github.com/user-attachments/assets/44541650-f592-4e2b-8fbb-dd25c3b7ed35)
![Get All Questions](https://github.com/user-attachments/assets/66434c3b-bb30-4df5-940d-a5cc293f60ce)
![Get Questions By Category](https://github.com/user-attachments/assets/9bfbf778-88d7-4a84-bd1e-e4688619aa82)
![Generate Quiz](https://github.com/user-attachments/assets/56635563-6365-441b-a5b4-720971a06e4a)
![Get Quiz By Id](https://github.com/user-attachments/assets/973fbd6f-7b04-4189-bd73-5389fef31bd0)
![Quiz Score](https://github.com/user-attachments/assets/9b948ba1-ba02-48fa-be04-825a6b7efa52)
![Eureka Server](https://github.com/user-attachments/assets/65622047-dd3b-445a-be68-5b2234bdc610)


