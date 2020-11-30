package academy.learnprogramming;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account ;

    @org.junit.jupiter.api.BeforeEach
    void setup(){
     account = new BankAccount("Srinivasa","Chakka",1000.00, BankAccount.CHECKING);
        System.out.println("Running Test....");

    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200.00,true);
        assertEquals(1200.00,balance,0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() throws Exception{
        double balance = account.withdraw(600.00,true);
        assertEquals(400.00,balance);
    }

    @org.junit.jupiter.api.Test
    void withdraw_notbranch() throws Exception{
        assertThrows(IllegalArgumentException.class,() -> account.withdraw(600.00,false));
      //  Exception exception = assertThrows(IllegalArgumentException.class,() -> account.withdraw(600.00,false));
      //  assertEquals("Error",exception.getMessage());
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        double balance = account.deposit(200.00,true);
        balance = account.getBalance();
        assertEquals(1200.00,balance,0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        double balance = account.withdraw(200.00,true);
        balance = account.getBalance();
        assertEquals(800.00,balance,0);
    }

    @org.junit.jupiter.api.Test
    void isChecking_True() {
        assertTrue(account.isChecking());
    }
}