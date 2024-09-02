package Entities;

public class BankManager {
    private String BankName;
    private String BankNumber;
    private double InitialDeposit;

    public String getBankName() {
        return BankName;
    }

    public String getBankNumber() {
        return BankNumber;
    }

    public double getInitialDeposit() {
        return InitialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        InitialDeposit = initialDeposit;
    }

    public void setBankNumber(String bankNumber) {
        BankNumber = bankNumber;
    }


    public BankManager(String accountName, String accountNumber, double initial){
        this.BankName = accountName;
        this.BankNumber = accountNumber;
        this.InitialDeposit = initial;
    }
    //Opcional
    public BankManager(String accountName, String accountNumber){
        this.BankName = accountName;
        this.BankNumber = accountNumber;
    }

    public void addDeposit(double newBalance){
        this.InitialDeposit += newBalance;
    }
    public void withdrawMoney(double removeBalance){
        this.InitialDeposit -= (removeBalance - 5.0);
    }
    public String toString() {
        return "Account Name: " + this.getBankName() + ", Account Number: " + this.getBankNumber() + ", Initial Deposit: " + this.getInitialDeposit();
    }
}
