package org.example;

import org.apache.commons.logging.Log;
import org.example.patterns.strategy.CreditCardPayment;
import org.example.patterns.strategy.PaypalPayment;
import org.example.patterns.strategy.ShoppingCart;
import org.example.patterns.singleton.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;


import static java.util.logging.FileHandler.*;
import static java.util.logging.Logger.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Logger logger = Logger.getInstance();
        logger.log("start");

        ShoppingCart cart = new ShoppingCart(new CreditCardPayment("234-324","ho van han"));
        cart.checkout(200);

        cart.setPaymentStrategy(new PaypalPayment("han@gmail.com"));;
        cart.checkout(150);

        cart.setPaymentStrategy(new CreditCardPayment("123-123","nam"));
        cart.checkout(340);

    }
}