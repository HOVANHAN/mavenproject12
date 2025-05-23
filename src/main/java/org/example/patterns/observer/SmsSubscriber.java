package org.example.patterns.observer;

public class SmsSubscriber implements Observer{
    private String phoneNumber;

    public SmsSubscriber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String news) {
        System.out.println("SMS sent to " + phoneNumber + ": " + news);
    }
}
