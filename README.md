# ASSESSMENT_GROUP_I

## GROUP MEMBERS:

* Carlos Andres Aguiar.

* Mateo Alvarez.

* David Pineda.

* Valentina Duarte.

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



UML MODEL:

Arquitecture Diagram:
![Architecture diagram_ Rest API Campus Connect](https://github.com/user-attachments/assets/00168e2b-83d1-490e-959a-a363e740d982)
