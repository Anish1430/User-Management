# Read Me First
Hello I am Anish Kumar Sharma,This project is a User Management System developed using SpringBoot with the help of INTELLIJ IDEA.

# Getting Started

* The original package name 'com.Anish.User Management' is invalid and this project uses 'com.Anish.User.Management' instead.

# USER MANAGEMENT SYSTEM:-

This project is a User Management System developed using Spring Boot.

## User Attributes
* UserId.
* Name.
* UserName.
* Address.
* Phone Number.

# Endpoints
### 1.Add User 
* Endpoint: `/addUser`
* Method: `POST`
* Description: Add a new user to the system.

### 2.Get User by ID

* Endpoint: `/getUser/{userId}`
* Method: `GET`
* Description: Retrieve user details by their unique UserId.

###  3.Get All Users

* Endpoint: `/getAllUsers`
* Method: `GET`
* Description: Retrieve details of all users in the system.

### 4.Update User Information

* Endpoint: `/updateUserInfo/{userId}`
* Method: `PUT`
* Description: Update user information based on their UserId.

### 5.Delete User

* Endpoint: `/deleteUser/{userId}`
* Method: `DELETE`
* Description: Delete a user from the system.

# Steps to Complete the Project:-

## Step 1: Set Up a New Spring Boot Project

* 1.Open IntelliJ IDEA and create a new Spring Boot project.
* 2.Add the necessary dependencies: Spring Web, Spring Data JPA, and H2 Database (or any preferred database).
* 3.Generate the project and import it into your IDE.

## Step 2: Define the User Entity
* Create a `User` class with attributes (UserId, Name, UserName, Address, Phone Number).
* Add JPA annotations to mark it as an Entity.

## Step 3: Create a UserRepository
*Create a `UserRepository` interface that extends `JpaRepository<User, Long>.`

## Step 4: Implement UserService
* Create a `User` class to handle business logic. Autowired the `UserRepository`.

## Step 5: Implement UserController
* Create a `UserController` to handle HTTP requests. Autowired the `User`.

## Step 6: Implement the Endpoints
* In the `UserController`, implement methods for `addUser`, `getUserById`, `getAllUsers`, `updateUserInfo`, and `deleteUser` using appropriate annotations.

## Step 7: Test Your Endpoints
* Run your Spring Boot application.
* Use a tool like `Postman` to send requests to the provided endpoints

### Reference Documentation
For further reference, please consider the following sections:

* [GitHub Link](https://github.com/Anish1430/User-Management)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.3/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

