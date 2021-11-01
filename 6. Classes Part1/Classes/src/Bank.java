import java.util.Scanner;

public class Bank {

  private String accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private int phoneNumber;

  // getters and setters for account number
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountNumber() {
    return this.accountNumber;
  }

  // getters and setters for balance
  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

  // getters and setters for customer Name
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  // getters and setters for email
  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  // getters and setters for email
  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public int getPhoneNumber() {
    return this.phoneNumber;
  }

  public void fundsDeposit() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter amount to be deposited: ");

    boolean hasNextInt = scanner.hasNextDouble();

    if (hasNextInt) {
      double fund = this.balance;
      fund = scanner.nextDouble();
      scanner.nextLine();

      fund += fund;
      System.out.println("New balance is now: " + fund);

    } else {
      System.out.println("Invalid amount of funds!");
    }

    scanner.close();
  }

  public void fundsWithdraw() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter amount to be withdrawn: ");

    boolean hasNextInt = scanner.hasNextDouble();

    if (hasNextInt) {
      double balanceLeft = this.balance;
      double input = scanner.nextDouble();
      scanner.nextLine();

      if ((balanceLeft -= input) < 4.99) {
        System.out.println("SOrry, balance insufficient!");
      } else {
        balanceLeft -= input;
        System.out.println("New balance is now: " + balanceLeft);
      }
    } else {
      System.out.println("Invalid amount of funds!");
    }

    scanner.close();
  }
}