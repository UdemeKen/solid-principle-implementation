package com.solid_principle.dependencyInversion;

public class CreditCard implements BankCard{

    @Override
    public void doTransaction(long amount) {
        System.out.println("Payment using credit card");
    }
}
