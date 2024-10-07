# Ramothopo ATM

This is a basic Java application that simulates an ATM system using a graphical user interface (GUI) built with `JOptionPane`. Users can perform deposits, withdrawals, and view their account balance.

## Features

- **Deposit Money:** Users can input the amount they want to deposit and receive confirmation of the transaction.
- **Withdraw Money:** Users can input the amount they want to withdraw, and the system will confirm the withdrawal.
- **View Balance:** Users can check their current account balance.

## Requirements

- Java Development Kit (JDK)
- IDE like NetBeans, IntelliJ IDEA, or Eclipse
- No external libraries required (built-in Java `javax.swing.JOptionPane` is used for GUI dialogs).

## How to Run


1. Open the project in your preferred IDE.
2. Compile and run the `RamothopoAtm.java` file.

## How it Works

1. The application starts by asking the user to insert their card (simulated by a dialog box).
2. The user is then prompted to choose between three options:
   - Deposit
   - Withdraw
   - View Balance
3. After selecting the option, the relevant method is executed:
   - **Deposit:** Adds the entered amount to the available balance.
   - **Withdraw:** Subtracts the entered amount from the available balance.
   - **View Balance:** Displays the current available balance.

## Example

Here is an example of how the application operates:

- The starting balance is initialized to `R 200`.
- If the user deposits `R 100`, the balance becomes `R 300`.
- If the user withdraws `R 50`, the balance becomes `R 250`.

## Known Issues

- Currently, the program does not handle invalid input gracefully (e.g., entering non-numeric values for amounts).
- Negative balances are not restricted when withdrawing more than the available amount.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more details.
