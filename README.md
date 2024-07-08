# Automated Testing 
This repository features automated tests for a web application using Selenium WebDriver with Java. The tests focus on performing basic checks for the application's login functionality and shopping cart operations.
## Test Scenarios
This repository covers multiple tasks for automated testing.[This website](https://www.saucedemo.com/) is used for Task 1 and Task 2.
## Task 1: Login Page Check and Navigation
### 1. Login Page Check using ID Locator:
 - Locate and verify elements on the login page using ID locators.
### 2. Verify Website Title:
 -	Print and assert the current title of the website using an ID locator.
### 3. Verify Current URL:
 - Check and assert the current URL of the page after login.
## Task 2: Shopping Cart Operations
### 1. Navigate to T-Shirt Product Page:
 - Click on the "T-shirt link" using an absolute path.
### 2. Add Item to Cart:
 - Add an item to the cart by clicking the "Add to Cart" button using an absolute path.
### 3. View Shopping Cart:
 - View items in the cart by clicking on the shopping cart badge using a relative path.
### 4. Continue Shopping:
 - Return to the previous page by clicking the "Continue shopping" button using an absolute path.
## Test Scenario: Form Submission Checks
This repository contains automated tests for a web application using Selenium WebDriver with Java. The tests are designed to perform various form submission checks on the application [Form](https://trytestingthis.netlify.app/) Task 3 and Task 4  was done using that website.
## Task 3: Form Submission Verification
###  1. Fill in First Name and Last Name:
  - Locate and fill the First Name and Last Name fields using ID locators.
###  2. Check Radio Button Selection:
  - Verify and assert the radio button selection using the <code style="color : gray">isSelected()</code> method.
###  3. Verify Drop Down Selection:
  - Locate and verify the selected option from the Drop Down using the <code style="color : gray">selectByVisibleText()</code>, <code style="color : gray">selectByIndex()</code>, <code style="color : gray">selectByValue()</code> method.
###  4. Check Multiple Options:
  - Select and verify multiple options from a list using the name attribute.
###  5. Submit the Form:
  -	Submit the form using a relative path.
## Task 4: Form Submission Verification using TestNG
- Tests implemented using the TestNG framework can be found in the automation4 folder.
- Test cases for form submission functionalities are located in TestAnnotation.
- TestNG reports are automatically generated in the test-output directory.
## Tools Used: 
 - Selenium WebDriver: Automation tool for web browsers.
 -	Java: Programming language used for scripting.
 -	TestNG: Framework for organizing test cases (Task 4).
 - Assertions: Used to validate expected outcomes.
## Setup Instructions
 ### 1. Clone the Repository: (https://github.com/Tihany98/Selenium-Project) 
 ### 2.	Install Dependencies:
 -	Ensure you have Java Development Kit (JDK) installed.
 - Use Maven or Gradle for managing dependencies.
 ### 3. Configure WebDriver:
 - Download the appropriate WebDriver executable (EdgeDriver, ChromeDriver, etc.) and place it in the /drivers directory.
 ### 4. Run Tests:
 - Use Maven or Gradle to run the tests, or directly execute the test classes using your IDE.
 ### 5. Review Test Results:
 - Review the console output for test results and any assertions that failed.

