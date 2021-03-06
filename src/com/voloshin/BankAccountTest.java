package com.voloshin;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount account = new BankAccount("Tim", "buchalka", 1000.00, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdrawal() {
        fail("this test has yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() {
        BankAccount account = new BankAccount("Tim", "buchalka", 1000.00, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdrawal() {
        BankAccount account = new BankAccount("Tim", "buchalka", 1000.00, BankAccount.CHECKING);
        account.withdrawal(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true() {
        BankAccount account = new BankAccount("Tim", "buchalka", 1000.00, BankAccount.CHECKING);
        assertTrue("The account is NOT a checking account",account.isChecking());
    }
}