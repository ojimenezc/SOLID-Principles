package com.example.com.no_compliant_examples.interface_segregation;

public class PremiumUser implements User{
    @Override
    public Object getUserDetails() {
        //TODO Get user details frm source and return it
        return "Get User details";
    }

    @Override
    public void requestSupportCall() {
        //TODO: Submit support call request
    }
}
