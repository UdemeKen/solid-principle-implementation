package com.solid_principle.interfaceSegregation;

public class GooglePay  implements UPIPayment, CashBackManager{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBalance() {

    }
}
