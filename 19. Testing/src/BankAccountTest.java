import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount account = new BankAccount("Obed", "Adu", 1000, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200, balance, 0);
        assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        BankAccount account = new BankAccount("Obed", "Adu", 1000, BankAccount.CHECKING);
        account.withdraw(400, true);
        assertEquals(600, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount account = new BankAccount("Obed", "Adu", 1000, BankAccount.CHECKING);
        account.deposit(200, true);
        assertEquals(1200, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount account = new BankAccount("Obed", "Adu", 1000, BankAccount.CHECKING);
        account.withdraw(200, true);
        assertEquals(800, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void isChecking_true() {
        BankAccount account = new BankAccount("Obed", "Adu", 1000, BankAccount.CHECKING);
        assertTrue(account.isChecking(), "The account is not a checking account");
    }

    @org.junit.jupiter.api.Test
    public void dummyTest() {
        assertEquals(21, 21);
    }
}