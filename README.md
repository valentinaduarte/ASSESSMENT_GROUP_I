# ASSESSMENT_GROUP_I

## GROUP MEMBERS:

* Mateo Alvarez SCRUM MASTER

* David Pineda PRODUCT OWNER
  
* Carlos Andres Aguiar DEVELOPER

* Valentina Duarte DEVELOPER

# Coupon Management and Redemption System
### Problem Description:
Riwi is currently developing an e-commerce project to sell its products online. However, a development team is needed to manage and redeem coupons. For this reason, your team is asked to develop a system that allows users to manage and redeem discount coupons. The API should offer the following functionalities:

### User Management:
## User registration.
### Coupon Management:
* Creation and listing of coupons.
* Modification and deletion of coupons as long as they have not been used.
* Verification of the validity of coupons (expiration date, status).
### Coupon Redemption:
* Allow users to redeem coupons on purchases.
* Consult the coupon redemption history per user.
### Product Management:
* Listing of products.
  
## General Business Rules:
* A registered user can only redeem a coupon once. Therefore, when a user attempts to redeem a coupon, it must be validated that it is not in their redeemed coupons history.
* A coupon must have at least a unique code, expiration date, and discount percentage.
* When redeeming a coupon, the user identifier and product identifier must be requested. If the redemption rules are met, the redeemed coupon information and the new product price must be returned, and the coupon should be saved in the user's redeemed coupons history.
* From the moment the application starts, there must be at least 10 products loaded in the database.


# Executed solution

To solve the problem proposed in the assessment, we decided to use hexagonal architecture within the context of the Java language and the Spring framework, along with the application of SOLID principles. This decision was made after a conversation with the team leader, who informed us that this project is a microservice for Riwi Market/Local Storage and that these projects were already using this architecture. This architecture provides us with very good code readability and scalability for the project in the future.

# Step-by-Step Guide to Initialize a the Spring Boot Project
### 1. Extract the Project .zip File
Extract the provided .zip file to your desired directory.
### 2. Open the Project in an IDE
Open your favorite IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
Import the extracted folder as a Maven project.

### 3. Run the Project
Run the project using your IDE’s run configuration for a Spring Boot application.
Alternatively, you can use the command line to navigate to the project directory and execute:
```
mvn spring-boot:run
```
### 4. Verify Swagger Documentation
Once the application is running, open your web browser and navigate to http://localhost:8080/swagger-ui/ to view the Swagger UI.
### 5. Testing the Application
Ensure the application starts without errors.
Test the endpoints and verify that they interact correctly with the database on Clever Cloud.




# Managment Board:
https://app.clickup.com/9013368573/v/b/li/901304813947


# UML MODEL:
![image](https://github.com/user-attachments/assets/3c7c341d-5dff-47e7-9dab-15a395c09e83)


# Arquitecture Diagram:
![Architecture diagram_ Rest API Campus Connect](https://github.com/user-attachments/assets/00168e2b-83d1-490e-959a-a363e740d982)
