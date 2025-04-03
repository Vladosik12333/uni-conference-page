# Blog Service Java

The Java simple MVC application that serves for announcement of the academic conference for
university. Also, the application includes functionality such as localization and adaptation for 
different devices.

## Screenshots

![Image 1](images/img.png)
![Image 2](images/img_1.png)
![Image 3](images/img_2.png)

## Installation

1. Clone repository `git clone https://github.com/Vladosik12333/uni-conference-page`
2. Build project `mvn package`
3. Build image `docker build -t uni-conference-page .`
4. Start container `docker run -d -p 80:80 uni-conference-page`
5. Open [localhost](http://localhost:80/)

## Technologies

<p align="left">
<img src="https://img.shields.io/badge/Language-Java 17-orange.svg" alt="Language - Java 17">
<img src="https://img.shields.io/badge/Framework-Spring Boot 3.4.1-green.svg" alt="Framework - 
Spring Boot 3.4.1">
<img src="https://img.shields.io/badge/Spring Module-Web-green.svg" alt="Spring Module - Web">
<img src="https://img.shields.io/badge/Spring Module-Thymeleaf-green.svg" alt="Spring Module - Thymeleaf">
<img src="https://img.shields.io/badge/Library-Lombok-blue.svg" alt="Library - Lombok">
</p>

## Deployment

The application was deployed using AWS services:
- Elastic Container Service
- Elastic Container Registry
- VPC
- Route 53
- Balancer
- Certificate Manager
- IAM

## Authors

[Vladyslav Babiak - Developer](https://github.com/Vladosik12333)

## Copyright & Licensing Information

[MIT License](LICENSE)