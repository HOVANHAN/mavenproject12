package org.example.patterns.strategy;

import java.net.Socket;

public  class CreditCardPayment implements PaymentStrategy{
    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    private String cardNumber;
    private String cardHolder;

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card [" + cardNumber + "] - Holder: " + cardHolder);

    }
}
