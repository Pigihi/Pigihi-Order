# Order Service

Service for handling all order related operations

### Required External Services:

- Product Service
- Payment Service

### Depends on:

- MongoDB instance

## APIs

| Functionality | REST Endpoint | Parameter | Response |
| --- | --- | --- | --- |
| Create New Order | **POST** `/order` | JSON String | JSON String |

## Configuration

Edit the properties of **Application.yml** file

```yaml
# Eureka properties
eureka:
  client:
    fetch-registry: true
    register-with-eureka: true
    service-url:
      defaultZone: address of the eureka server (Eg: http://localhost:8761/eureka)
  instance:
    hostname: specify the hostname here (Eg: localhost)

# Server properties
server:
  port: port in which the customer service is to run (Eg: 8092)

# Application properties
spring:
  application:
    name: name of the application (Eg: ORDER-SERVICE)
# MongoDB properties
  data:
    mongodb:
      database: mongoDB database name (Eg: testWorkingDB)
      host: name of mongoDB host (Eg: localhost)
      port: port in which mongoDB is being run (Eg: 27017)
```

## Local Deployment
In Linux,

1. Open terminal and run `docker-compose up`
2. The application can be accessed at localhost:8092 (port 8092 is set in docker-compose)
3. MongoDB port is set to 27019
