package com.solid_principle.singleResponsibility;

public class NotificationService {

    public void sendOTP(String medium) {
        if (medium.equals("email")) {
//            write email related topic
//            use javaMailSenderAPI
        }
        if (medium.equals("mobile")) {
//            write logic using twilio API
        }
    }
}
