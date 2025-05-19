package org.example.tests;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class LoginTest {

    @Test
    public void testLogin() {
        // Simulate login test
        System.out.println("Login Test executed by: " + Thread.currentThread().getId());

    }

    @Test
    public void testLogout() {
        // Simulate logout test
        System.out.println("Logout Test executed by: " + Thread.currentThread().getId());
    }

    @Test
    public void testHomePage() {
        // Simulate home page test
        Assert.assertTrue(false);
        System.out.println("HomePage Test executed by: " + Thread.currentThread().getId());
    }
}
