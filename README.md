# Test-Automation-for-Swag-Labs 
### 🛠 Automated testing for Swag Labs web with test cases and bug reports

📢 This repository contains an automated testing project for Swag Labs using Java, Cucumber, BDD, Selenium, Gherkin, ChromeDriver, JUnit 4, Maven, and Eclipse IDE. The tests are designed to cover various scenarios on the Sauce Demo website (https://www.saucedemo.com).

## Table of Contents

- [Introduction](#introduction)
- [Scope](#scope)
- [Features](#features)
- [Tools and Technologies Used](#tools-and-technologies-used)
- [Test Cases](#test-cases)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Test automation is the process of using software tools and frameworks to automate test execution, compare actual outcomes to expected outcomes, and generate test reports. This helps to increase efficiency, accuracy, and repeatability of testing processes, as well as reducing the time and costs associated with manual testing. <br><br>In here we are going to test SWAG Labs (Sauce Demo - https://www.saucedemo.com). We are going to use tools and frameworks like Cucumber BDD (Behavior-driven development) with Selenium for the automation. This project focuses on automating tests for the Swag Labs website using Cucumber BDD and Selenium.

## Scope

The project covers the following areas of the Swag Labs website:

- Login page for all accepted users and error scenarios.
- Product page, including sorting features and product detailed view.
- Your cart page for all accepted users.

## Features

- Utilizes Cucumber for behavior-driven development (BDD) to write tests in a human-readable format.
- Uses Selenium for interacting with web elements and performing automated actions.
- Organizes test scenarios using Gherkin syntax.
- Includes a wide range of test cases covering login, product features, cart functionality, and more.
- Provides easy-to-understand bug reports and test outcomes.


## Tools and Technologies Used

This test automation project for Swag Labs utilizes a variety of tools and technologies to streamline the testing process and ensure efficient and accurate results.

- **Java**: The primary programming language used for writing the test automation code.

- **Cucumber**: A Behavior-Driven Development (BDD) tool that allows writing test scenarios in a human-readable format.

- **Selenium**: A popular open-source framework for automating web browser interactions and testing.

- **Gherkin**: A plain-text language that uses keywords to define test scenarios in a structured way, making them easy to read and understand.

- **ChromeDriver**: The WebDriver implementation for Google Chrome, enabling Selenium to automate Chrome browser actions.

- **JUnit 4**: A widely-used testing framework for Java applications, used to run and manage test cases.

- **Maven**: A build and dependency management tool that simplifies project setup and maintenance.

- **Eclipse IDE**: An integrated development environment for Java that provides a workspace for coding, testing, and debugging.

These technologies are combined to create an effective testing framework that automates test cases, performs comparisons between expected and actual outcomes, and generates detailed test reports.


## Test Cases

The test cases are written in the Gherkin syntax, which offers a clear representation of the test scenarios including over 100 test cases. Each test case covers various aspects of the Swag Labs website, ensuring comprehensive coverage.

## Installation

Ensure that you have the following tools and technologies installed on your machine:

- [Java](https://www.java.com/en/download/)
- [Maven](https://maven.apache.org/install.html)
- [Eclipse IDE](https://www.eclipse.org/downloads/)
- [Cucumber](https://cucumber.io/)
- [Chrome driver](https://chromedriver.chromium.org)
  <br>Note: Make sure to download the relavent Chrome driver version for your chrome browser match, and put it to the ChromeDriver folder, and set the relavent path in the `Base.java` file.

## Usage

1. Open the project in Eclipse or your preferred IDE.
2. Navigate to the `src/test/java` directory.
3. Locate the test files with the `.feature` extension.
4. Run the test files using JUnit to execute the automated test scenarios.

## Contributing

Contributions to this project are welcome! If you identify any issues or wish to enhance the existing test suite, please feel free to create pull requests.

## License

This project is licensed under the [MIT License](LICENSE).

