# UrlShortener
URL shortener is a URL shortening service built with Spring Boot 3.3.1 and Java 21. The project uses Gradle for dependency management and includes a Docker Compose file for running a PostgreSQL 15 database. This application allows users to shorten URLs and retrieve shortened URLs.

## Features
* Shorten URLs
* Retrieve shortened URLs
* Dockerized PostgreSQL database
* Swagger UI for easy interaction with the API endpoints
## Requirements
* Java 21
* Gradle
* Docker and Docker Compose
## Getting Started
Clone the Repository

```bash
git clone https://github.com/yourusername/UrlShortener.git
cd UrlShortener
```


## Build the Project
bash
Copy code
./gradlew build

## Run the Application
Using Docker Compose
To run the application with the PostgreSQL database using Docker Compose:

```bash
docker-compose up
```
This command will start the application and the PostgreSQL database.

## Access the Application
Once the application is running, you can access it at http://localhost:8080.

## Using Swagger
Swagger UI is available to interact with the API endpoints easily. You can access Swagger UI at `http://localhost:8080/swagger-ui.html` once the application is running.
