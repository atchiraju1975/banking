package academy.learnprogramming;

public class BankAccount {

    private String firstname;
    private String lastname;
    private double balance;
    public static final int CHECKING = 1;
    public static final int SAVINGS = 2;
    private int accountType;

    public BankAccount(String firstname, String lastname, double balance, int typeOfAccount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
        this.accountType = typeOfAccount;
    }

    public double deposit(double amount, boolean branch){

        balance += amount;

        return balance;
    }

    public double withdraw(double amount, boolean branch){

        if((amount>500) && !branch){
            throw new IllegalArgumentException("Error");
        }
        balance -= amount;

        return balance;
    }

    public double getBalance(){
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECKING;
    }

}
