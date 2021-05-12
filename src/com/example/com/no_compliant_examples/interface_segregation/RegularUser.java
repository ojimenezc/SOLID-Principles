package com.example.com.no_compliant_examples.interface_segregation;

public class RegularUser implements User {
    @Override
    public Object getUserDetails() {
        //TODO: Get user details from persistent source and return it
        return "User Details";
    }

    @Override
    public void requestSupportCall() {
        throw new UnsupportedOperationException("Regular users cannot request support calls");
    }
}
