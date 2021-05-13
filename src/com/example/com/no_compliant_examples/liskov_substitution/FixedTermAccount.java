package com.example.com.no_compliant_examples.liskov_substitution;

/**
 * This class is a type of account that does not support withdraws
 */
public class FixedTermAccount extends Account{
    @Override
    public void deposit() {
        System.out.println("Deposit done");
    }

    @Override
    public void withdraw(float amount) {
        throw new UnsupportedOperationException();
    }
}
