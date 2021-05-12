package com.example.com.no_compliant_examples.dependency_invertion;


public class CoffeMachine {

    private FilterCoffe filterCoffe = new FilterCoffe();
    private Expresso expresso = new Expresso();

    public void brew(String type) {

        switch (type.toLowerCase()) {

            case "expresso":
                expresso.makeExpresso();
                break;

            case "filter":
                filterCoffe.makeFilterCoffe();
                break;
        }
    }
}
