package com.cbfacademy.accounts;

public class Account {
    
    int accountNumber;
    double balance;
    
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance; 

    }
    
    public double getBalance() {
        return this.balance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double deposit(double amount) {
        return this.balance + amount;
    }

    public double withdraw(double requested) {
        if (this.balance > requested && this.balance > 0 && requested > 0) {
            this.balance -= requested;
            return requested;
        } else {
            return 0;
        }
    }
}
