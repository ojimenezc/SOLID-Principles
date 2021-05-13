package com.example.com.compliant_examples.interface_segregation;

public class PremiumUser implements Premium {
    @Override
    public Object getUserDetails() {
        //TODO Get user details frm source and return it
        return "Get User details";
    }

    @Override
    public void requestSupportCall() {

    }

    @Override
    public void otherPremiumFeature() {

    }
}
