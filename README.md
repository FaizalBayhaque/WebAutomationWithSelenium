# Web Automation With Selenium


This repo is about my last project making web automation using selenium. Website that I do for automation testing is https://id.HnM.com. Feature that I test in this case is Registration, Login, Adding item to the cart without doing register. 

# Test Cases

Positive Test

* User register with correct credentials

* User login with correct credentials

* User add item to cart without doing register or login

Negative Test

* User login with incorrect email and incorrect password

* User login with correct mail but with incorrect password

* User login with incorrect email but with correct password

* User login with both email and password form empty

* User register with valid credentials but with incorrect password format

* User register with invalid credentials but with correc password format

## Getting Started

To check or run each task on /src there are 2 folders. main/java and test/java/webautomation

on main/java folder you can access :

* HardWaitUtils

on test/java/web automation folder you can access :

* Add To Cart Without Register Test
* Base Web Test
* Base Web Test Headless
* Login Negative Test
* Login Positive Test
* Registration Negative Test
* Registration Positive Test

## Prerequisite

To run this repo, make sure you have maven, selenium, testNg has installed in your machine. This repo works best in Eclipse IDE

## Running the tests
to run the test here are the steps :

* go to test/java/HnM web automation folder

* click the package that you want to choose. (ex: Login Positive Test)

* click right on the class LoginPositiveTest,java

* choose Run As

* click TestNG Test

# Diclaimer

To run this test all in one time you can click right on the class testsuite.xml and choose RUn As then click TestNG Test

## Built With
* Maven(https://maven.apache.org/) - Dependency Management

* Selenium(https://www.selenium.dev/) - Used to automate web testing

* TestNGhttps://testng.org/) - Test Management

## Authors

* Faizal Bayhaque Al Adhanie


