package org.example;

import org.apache.commons.logging.Log;
import org.example.patterns.observer.EmailSubscriber;
import org.example.patterns.observer.NewsAgency;
import org.example.patterns.observer.Observer;
import org.example.patterns.observer.SmsSubscriber;
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

        NewsAgency agency = new NewsAgency();

        Observer emailSubscriber = new EmailSubscriber("user@example.com");
        Observer smsSubscriber = new SmsSubscriber("123-456-7890");

        agency.addObserver(emailSubscriber);
        agency.addObserver(smsSubscriber);

        agency.setNews("Breaking News: Design Patterns are awesome!");
    }
}