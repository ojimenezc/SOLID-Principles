package com.example.com.compliant_examples.interface_segregation;

public class RegularUser implements Regular {
    @Override
    public Object getUserDetails() {
        //TODO: Get user details from persistent source and return it
        return "User Details";
    }

    @Override
    public void onlyRegularUserFeature() {

    }
}
