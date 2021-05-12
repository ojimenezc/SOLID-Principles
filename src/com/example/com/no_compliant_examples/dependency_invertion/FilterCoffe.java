package com.example.com.no_compliant_examples.dependency_invertion;

public class FilterCoffe {

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
}
