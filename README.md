# Selenium Automation Project
This project demonstrates automated testing of the SauceDemo website using Selenium WebDriver with Java and TestNG.
## Getting Started
To run this project locally, follow these instructions:
### Prerequisites

- Java Development Kit (JDK) installed
- Maven build tool installed
- Chrome WebDriver installed (ensure it matches your Chrome browser version)
### Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/MariamAdham1/SumergeAutomationTask.git

### Running Tests

You can run the tests using Maven or your IDE:

- **Using Maven:**
  ```bash
  mvn test

## Project Structure

The project structure is organized as follows:

- `Task.java`: Contains the main test cases using TestNG annotations (`@BeforeTest`, `@BeforeMethod`, `@Test`).
- `pom.xml`: Maven configuration file that includes dependencies and build settings.
# Test Cases

### 1. Valid Login (`validLogin`)

Verifies successful login with valid credentials.

### 2. Invalid Login (`invalidLogin`)

Verifies error message display on login with invalid credentials.

### 3. Empty Username (`emptyUsername`)

Verifies error message display when username field is empty.

### 4. Empty Password (`emptyPassword`)

Verifies error message display when password field is empty.

## Technologies Used

- Selenium WebDriver
- Java
- TestNG

## Authors

- Mariam (GitHub: [MariamAdham1](https://github.com/MariamAdham1/SumergeAutomationTask.git))

