package com.example.com.compliant_examples.liskov_substitution;

public class SavingsAccounts extends WithdrawableAccount {
    @Override
    public void deposit() {
        System.out.println("Deposit done");
    }

    @Override
    public void withdraw(float amount) {
    System.out.println("Amount withdrawed");
    }
}
