# Order Service

Service for handling all order related operations

### Required External Services

- Product Service
- Payment Service

### Depends on

- MongoDB instance

## APIs

| Functionality | REST Endpoint | Parameter | Body | Response |
| --- | --- | --- | --- | --- |
| Create New Order | **POST** `/order` |     | JSON String | JSON String |

## Configuration

Edit the properties of **application.yml** file

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
  port: port in which the order service is to be run (Eg: 8092)

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

Service Registry should be started for successful execution of all queries.

In application.yml file, change the properties

| Property | Value | Example |
| --- | --- | --- |
| eureka_hostname | hostname of eureka server | service-registry |
| mongodb_hostname | hostname of mongodb | order-db |
| mongodb\_database\_name | database name | orderDB |

Create docker bridge network: `docker network create -d bridge pigihi-network`

docker-compose can be used to run the application and the corresponding mongodb instance

1. Go to project folder
2. Open terminal and run `docker-compose up`
3. The application can be accessed at localhost:8092 (port 8092 is set in docker-compose)
4. MongoDB port is set to 27019

To run only the application

1.  Go to project folder
2.  Open terminal and run `docker build .`
3.  Run `docker run -p 8092:8092 docker_image_name`
4.  The application can be accessed at localhost:8092

### Using Gradle

MongoDB should be run seperately and the configurations should be updated in application.yml

1.  Go to project folder
2.  Open terminal and run `./gradlew build`
3.  Run `./gradlew bootRun`

* * *
