import java.time.LocalDate;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated; // Stores date when the Object was Created

    Account () {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = LocalDate.now();
    }

    // Getter for ID
    public int getID() {
        return this.id;
    }

    // Setter for ID
    public void setID(int newID) {
        this.id = newID;
    }

    // Getter for Balance
    public double getBalance() {
        return this.balance;
    }

    // Setter for Balance
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    // Getter for annualInterestRate
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    // Setter for AnnualInterestRate
    public void setAnnualInterestRate(double newAnnualInterestRate) {
        this.annualInterestRate = newAnnualInterestRate;
    }

    // Getter for Local Date
    public LocalDate getDate() {
        return this.dateCreated;
    }

    // Monthly Interest Rate
    public double getMonthlyInterestRate() {
        return  (this.annualInterestRate/100) / 12;
    }

    // Monthly Interest
    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate();
    }

    // Withdraw Cash from an account
    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance = this.balance - amount;
            System.out.println("You have successfully withdrawal " + amount + ". You current balance is "+this.balance);
        } else{
            System.out.println("You have insufficient balance to withdraw " + amount);
        }
    }

    // Deposit Cash to an Account
    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("You have successfully deposited cash. Your current balance is " + this.balance);
    }

}
