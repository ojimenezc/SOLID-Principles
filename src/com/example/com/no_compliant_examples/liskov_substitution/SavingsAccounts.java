package com.example.com.no_compliant_examples.liskov_substitution;

public class SavingsAccounts extends Account{
    @Override
    public void deposit() {
        System.out.println("Deposit done");
    }

    @Override
    public void withdraw(float amount) {
    System.out.println("Amount withdrawed");
    }
}
