This repository contains the basic code to test the login functionality of the Demo OrangeHRM website using Selenium and Cucumber.

## Table of Contents

- [Project Description](#project-description)
- [Installation](#installation)
- [Running Tests](#running-tests)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Project Description

This project demonstrates how to use Selenium WebDriver and Cucumber to automate the testing of the login functionality of the Demo OrangeHRM website. It includes feature files, step definitions, and the necessary setup to run the tests.

## Installation

To get started with this project, follow the instructions below:

1. *Clone the repository:*

    bash
    git clone https://github.com/your-username/CucumberBasics.git
    cd selenium-cucumber-orangehrm
    

2. *Install dependencies:*

    Ensure you have Java and Maven installed on your system. Then, install the project dependencies by running:

    bash
    mvn clean install
    

3. *Set up WebDriver:*

    Download the appropriate WebDriver (e.g., ChromeDriver for Chrome) and ensure it's available in your system PATH.

## Running Tests

To run the tests, use the following Maven command:

bash
mvn test


This will execute the Cucumber feature files using Selenium WebDriver.

## Project Structure

Here's an overview of the project's structure:


CucumberBasics
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── pages
│   │   │               └── LoginPage.java
│   │   └── resources
│   └── test
│       ├── java
│       │   └── com
│       │       └── example
│       │           ├── runners
│       │           │   └── TestRunner.java
│       │           └── stepdefinitions
│       │               └── LoginSteps.java
│       └── resources
│           └── features
│               └── login.feature
│
├── pom.xml
└── README.md


- pages: Contains the Page Object Model (POM) classes.
- runners: Contains the test runner class for executing Cucumber tests.
- stepdefinitions: Contains the step definition classes where the test steps are implemented.
- features: Contains the Cucumber feature files.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please fork the repository and use a feature branch. Pull requests are warmly welcomed.

1. Fork the repository
2. Create your feature branch (git checkout -b feature/AmazingFeature)
3. Commit your changes (git commit -m 'Add some AmazingFeature')
4. Push to the branch (git push origin feature/AmazingFeature)
5. Open a pull request

