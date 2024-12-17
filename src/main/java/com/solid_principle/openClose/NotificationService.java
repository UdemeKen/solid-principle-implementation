package com.solid_principle.openClose;

public interface NotificationService {
    public void sendOTP(String medium);
    public void sendTransactionReport(String medium);
}
