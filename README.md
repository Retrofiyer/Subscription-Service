<div>
    <h1>Subscription Microservice</h1>
</div>

## About The Project

This microservice is responsible for managing user subscriptions within the streaming application. It handles the creation, renewal, and cancellation of subscriptions while ensuring that all user statuses are verified. 
The service communicates with the user service via RabbitMQ to confirm user eligibility and manages subscription plans, payment processing, and related notifications. Robust validation and security measures are 
implemented to protect user data and ensure smooth subscription management.

## Table of Contents

<ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#overview">Overview</a></li>
        <li><a href="#features">Features</a></li>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
        <li><a href="#configuration">Configuration</a></li>
        <li><a href="#running-the-service">Running the service</a></li>
      </ul>
    </li>
    <li>
      <a href="#contributing">Contributing</a>
    </li>
 </ol>

## Overview

The subscription service is a critical component of the streaming application's backend architecture, designed to manage user subscriptions efficiently. It facilitates the full lifecycle of a subscription, 
including creation, renewal, and cancellation, while integrating with the user service to verify eligibility and status. 

## Features

<div>
  <ul>
      <li> <b>Subscription Management:</b> Handle the full lifecycle of user subscriptions, including creation, renewal, and cancellation.</li>
      <li> <b>User Verification:</b> Integrate with the user service via RabbitMQ to verify user eligibility and ensure that only enabled users can subscribe.</li>
      <li> <b>Subscription Plans:</b> Offer and manage multiple subscription tiers, allowing users to choose the plan that best fits their needs.</li>
    <li> <b>Security and Validation:</b>  Implement robust validation and security measures to protect user data and ensure the integrity of subscription operations.</li>
  </ul>
</div>


## Built With

[![Spring Boot][springboot.com]][springboot-url]
[![PostgreSQL][postgresql.com]][postgresql-url]
[![RabbitMQ][rabbitmq.com]][rabbitmq-url]
[![Swagger][swagger.com]][swagger-url] [![Docker][docker.com]][docker-url]

<!-- GETTING STARTED -->
## Getting Started

## Prerequisites

Before you begin, make sure you have the following tools installed on your machine:

- **Java 17 or higher** - [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
- **Spring Boot 3.3.2** - [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- **Maven** - [Maven](https://maven.apache.org/install.html)

If you don't have any of these tools installed, follow the provided links to install them.


## Installation

1.- Clone the repository
   ```sh
   git clone https://github.com/Retrofiyer/Subscription-Service.git
   cd Subscription-Service
   ```
2.- Build project using maven
 ```sh
   mvn clean install
   ```

## Configuration

The configuration for the User Service is located in `src/main/resources/application.properties`. Below is an example configuration:

 ```sh
spring.datasource.url=jdbc:postgress://host-DB4/name-DB
spring.datasource.username=username-db
spring.datasource.password=password-db
   ```

## Running the service

  ```sh
    mvn spring-boot:run
   ```

## Contributing

I would like you to contribute to this project. Whether it's fixing a bug, adding a new feature or improving the documentation, your help is always welcome. Please email me at `sebitas5225@gmail.com` with all the details for improvement.

<!-- LINKS & IMAGES -->

[docker.com]: https://img.shields.io/badge/Docker-black?style=for-the-badge&logo=docker&logoColor=white
[docker-url]: https://www.docker.com/
[springboot.com]: https://img.shields.io/badge/SpringBoot-black?style=for-the-badge&logo=springboot&logoColor=white
[springboot-url]: https://spring.io/projects/spring-boot
[java.com]: https://img.shields.io/badge/Java-black?style=for-the-badge&logo=java&logoColor=white
[java-url]: https://www.oracle.com/java/
[rabbitmq.com]: https://img.shields.io/badge/RabbitMQ-black?style=for-the-badge&logo=rabbitmq&logoColor=white
[rabbitmq-url]: https://www.rabbitmq.com/
[swagger.com]: https://img.shields.io/badge/Swagger-black?style=for-the-badge&logo=swagger&logoColor=white
[swagger-url]: https://swagger.io/
[postgresql.com]: https://img.shields.io/badge/PostgreSQL-black?style=for-the-badge&logo=postgresql&logoColor=white
[postgresql-url]: https://www.postgresql.org/
