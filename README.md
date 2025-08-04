# Employee Management Automation using Selenium

This project automates the employee management workflow on [EAApp](http://eaapp.somee.com) using Selenium WebDriver with Java. It follows the Page Object Model (POM) design pattern for better code structure and maintainability.

## Features

- Login automation using valid credentials
- Navigation to the Employee List page
- Automated creation of a new employee
- Explicit wait handling for dynamic web elements

## Project Structure
src
└── org.example
├── Main.java // Entry point of the automation script
├── HomePage.java // Handles actions on the home page
├── LoginWithselenium.java // Handles the login process
└── EmplyoeePage.java // Handles employee form submission

## Prerequisites

- Java JDK 8 or above
- Chrome browser installed
- ChromeDriver installed and configured in PATH
- Selenium Java library (version 4.x recommended)

## Setup

1. Clone or download the project.
2. Add Selenium dependencies to your build tool.

### Maven

```xml
<dependency>
  <groupId>org.seleniumhq.selenium</groupId>
  <artifactId>selenium-java</artifactId>
  <version>4.21.0</version>
</dependency>
```

How to Run
Ensure ChromeDriver is properly configured.

Open and run Main.java as a Java application.

The automation will:

Launch the browser

Log in with credentials

Navigate to the employee list

Add a new employee

Author
Ravi Kumar Thakur