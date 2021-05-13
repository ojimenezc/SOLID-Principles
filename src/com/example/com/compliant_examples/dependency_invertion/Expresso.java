package com.example.com.compliant_examples.dependency_invertion;

public class Expresso implements Coffe {

    public void makeExpresso() {
        putCoffe();
        grind();
        startMaking();
    }

    public void putCoffe() {
        //TODO Add some coffe
    }

    public void grind() {
        //TODO:Grind the coffee
    }

    public void startMaking() {
        //TODO: Start making the coffee
    }

    @Override
    public void brew() {
        makeExpresso();
    }
}
