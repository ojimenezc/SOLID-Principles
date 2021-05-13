package com.example.com.compliant_examples.dependency_invertion;

public class FilterCoffe implements Coffe {

    public void makeFilterCoffe() {
        setUpFilter();
        putCoffee();
        startMaking();
    }

    protected void setUpFilter() {
        //TODO: Position the filter
    }

    protected void putCoffee() {
        //TODO: Fill the filter with coffee
    }

    protected void startMaking() {
        //TODO:Start making coffe
    }

    @Override
    public void brew() {
        makeFilterCoffe();
    }
}
