# CucumberFramework

CucumberFramework is an open-source automation framework built using Cucumber, Selenium, and Java for functional testing of web applications.

## Features

- Allows writing tests in plain English using Gherkin syntax
- Supports different browsers for test execution
- Provides a configurable test runner to execute tests
- Generates test reports in multiple formats (HTML, JSON, and XML)
- Implements Page Object Model (POM) design pattern for test maintenance and scalability
- Handles test data using properties files

## Prerequisites

- JDK 8 or later
- Maven

## Installation

- Clone the repository using `git clone https://github.com/sau-rav-singh/CucumberFramework.git`
- Navigate to the project directory using `cd CucumberFramework`
- Run `mvn clean install` to install the dependencies and build the project

## Usage

- The feature files are located under the `src/test/resources/features` directory
- The step definitions are located under the `src/test/java/stepdefinitions` directory
- The page objects are located under the `src/test/java/pageobjects` directory
- The test runner class is located under the `src/test/java/TestRunner.java` file
- Execute tests using `mvn test`

## Reporting

- Test reports are generated under the `target/cucumber-reports` directory in HTML, JSON, and XML formats
- Open the `target/cucumber-reports/index.html` file in a browser to view the HTML report

## Contributing

- Fork the repository
- Create a new branch for your feature or bug fix
- Commit your changes and push to the branch
- Submit a pull request

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.
