# AlertDemo

A simple Java Selenium project to demonstrate handling of JavaScript alerts, confirm boxes, and prompt boxes using WebDriver.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Test Cases](#test-cases)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project demonstrates how to use Selenium WebDriver to handle different types of JavaScript pop-ups on a web page, specifically:

1. Alert Boxes
2. Confirm Boxes
3. Prompt Boxes

## Prerequisites

Before you begin, ensure you have met the following requirements:

- You have installed Java (JDK 11 or later).
- You have installed Maven.
- You have a web browser (Firefox).
- You have installed GeckoDriver for Firefox.
- You have installed an IDE such as IntelliJ IDEA or Eclipse.

## Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Abdul-Firoz-Khan/AlertDemo.git
    ```
2. Navigate to the project directory:
    ```sh
    cd AlertDemo
    ```
3. Build the project using Maven:
    ```sh
    mvn clean install
    ```

## Usage

To run the test cases, use the following command:
```sh
mvn test

Ensure that the GeckoDriver is in your system PATH. If not, specify the path to the GeckoDriver executable in your code or as a system property.

Test Cases
The following test cases are included in the project:

AlertBox Test
Description: Tests the handling of a simple alert box.
Steps:
Navigate to the test page.
Click the button to trigger the alert box.
Wait for the alert to be present.
Retrieve and print the alert text.
Accept the alert.
ConfirmBox Test
Description: Tests the handling of a confirm box.
Steps:
Navigate to the test page.
Click the button to trigger the confirm box.
Wait for the confirm box to be present.
Retrieve and print the confirm box text.
Accept the confirm box.
PromptBox Test
Description: Tests the handling of a prompt box.
Steps:
Navigate to the test page.
Click the button to trigger the prompt box.
Wait for the prompt box to be present.
Enter text into the prompt box.
Accept the prompt box.
Print the result from the page.
Contributing
Contributions are welcome! Please open an issue or submit a pull request for any changes.

License
This project is licensed under the MIT License. See the LICENSE file for details.
