# Tendable Assignment

This is a Basic Framework build over _Maven, TestNG and Selenium_. 

* The Framework consists of Some Wrappers over existing selenium methods to support dynamic waits with all the actions.
* Page Object Pattern is being followed for better Maintainability and Readability
* DataProvider approach is being followed wherever required to avoid repetition of TestLogic.


It consists of following 3 testcases

* **TestCase 1 (TC_Home_001_ValidateAccessibility_HeaderLinks)** - To Check accessibility of all header Links


* **TestCase 2 (TC_Home_002_VerifyVisibility_RequestADemoButton)** - To Check Request a Demo Button is present and active on all of all header Links


* **TestCase 3 (TC_ContactUs_001_Validate_ErrorMessage_MissingMessageField_FillContactUsForm)** - To Check Request a Demo Button is present and active on all of all header Links

## Steps for Execution

**1. Through IDE -** Simply import the project in any IDE and on the left click the play button to run any testcase.

**2. Through Maven -** Open the Terminal and run the following command `mvn clean test`
