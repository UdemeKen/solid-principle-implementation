package com.solid_principle.dependencyInversion;

public class ShoppingMall {

    private final BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCd = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCd);
        shoppingMall.doPurchaseSomething(5000);
    }
}
