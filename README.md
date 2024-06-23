# Basic ATM Machine Project

This project is a basic ATM machine simulation developed in Java, utilizing the concepts of Object-Oriented Programming (OOP) such as classes and objects. The application allows users to perform typical ATM operations such as checking balance, depositing money, and withdrawing money.

## Features

- **Check Balance**: Allows users to check their current account balance.
- **Deposit Money**: Allows users to deposit money into their account.
- **Withdraw Money**: Allows users to withdraw money from their account.
- **Security PIN**: Ensures that only authenticated users can access their accounts.

## Project Structure

The project consists of the following key classes:

1. **ATM**: Main class that provides the interface for the user to interact with the ATM.
2. **Account**: Represents a user's account with attributes such as account number, full name, email, balance, and security pin.
3. **User**: Represents the user with attributes such as full name, email, and password.

## Class Descriptions

### ATM

- **Methods**:
  - `checkBalance()`: Displays the current balance.
  - `depositMoney(double amount)`: Deposits the specified amount into the account.
  - `withdrawMoney(double amount)`: Withdraws the specified amount from the account if sufficient balance is available.
  - `authenticateUser(String email, String pin)`: Authenticates the user using their email and security pin.

### Account

- **Attributes**:
  - `int accountNumber`
  - `String fullName`
  - `String email`
  - `double balance`
  - `String securityPin`
- **Methods**:
  - `getAccountNumber()`: Returns the account number.
  - `getFullName()`: Returns the full name of the account holder.
  - `getEmail()`: Returns the email associated with the account.
  - `getBalance()`: Returns the current balance.
  - `getSecurityPin()`: Returns the security pin.
  - `setBalance(double balance)`: Sets the account balance.

### User

- **Attributes**:
  - `String fullName`
  - `String email`
  - `String password`
- **Methods**:
  - `getFullName()`: Returns the full name of the user.
  - `getEmail()`: Returns the user's email.
  - `getPassword()`: Returns the user's password.

## Installation and Setup

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/yourusername/atm-machine-project.git
    cd atm-machine-project
    ```

2. **Compile the Java files**:
    ```sh
    javac src/*.java
    ```

3. **Run the Application**:
    ```sh
    java src.ATM
    ```

## Contributing

1. Fork the repository.
2. Create your feature branch (`git checkout -b feature/AmazingFeature`).
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4. Push to the branch (`git push origin feature/AmazingFeature`).
5. Open a pull request.


Thank you for using this ATM machine simulation project! We hope it serves as a useful tool for understanding OOP concepts in Java.
