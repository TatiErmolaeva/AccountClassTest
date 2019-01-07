
package accounttest;

public class AccountTest {

    public static void main(String[] args) {
    Account account = new Account(1122, 20000);
    account.setAnnualInterestRate(4.5);
    
    account.withdraw(2500);
    account.deposit(3000);
    
    System.out.println("Balance is " + account.getBalance());
    System.out.println("Monthly interest is " +
      account.getMonthlyInterest());
    System.out.println("This account was created at " +
      account.getDateCreated());
  }
}

class Account {

private int id = 0;
private double balance = 0;
private double annualInterestRate = 0;
private java.util.Date dateCreated;

// no-arg constructor for the default account
Account() {

}

// constructor with specified id and balance
Account(int newId, double newBalance) {
    id = newId;
    balance = newBalance;
}

// accessor and mutator methods for id, balance, annualInterestRate
public int getId() {
    return id;
}
public double getBalance() {
    return balance;
}
public double getAnnualInterestRate () {
    return annualInterestRate;
}

public void setId(int newId) {
    id = newId;
}

public void setBalance(double newBalance) {
    balance = newBalance;
}
        
public void setAnnualInterestRate(double newAnnualInterestRate) {
   annualInterestRate = newAnnualInterestRate;
}

// accessor method for dateCreated
public String getDateCreated() {
    dateCreated = new java.util.Date();
    return dateCreated.toString();
}

//method to get monthly interest rate
public double getMonthlyInterestRate() { 
    double monthlyInterestRate = annualInterestRate / 1200;
     return monthlyInterestRate;
}

public double getMonthlyInterest() {
    return balance * getMonthlyInterestRate();
}

// withdraw and deposit methods
public double withdraw(double amount) {
    
    balance -= amount;
    return balance;
}

public double deposit(double amount) {
    
    balance += amount;
    return balance;
} 
}