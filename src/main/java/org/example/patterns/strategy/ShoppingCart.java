package org.example.patterns.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public  ShoppingCart(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount){
        System.out.println("Initiating checkout...");
        paymentStrategy.pay(amount);
        System.out.println("Checkout complete.");
    }
}
