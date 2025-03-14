package org.example.day11;

import org.example.day11.auth.LoginController;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
    public void fillUsername() {
        System.out.println("Fill username...");
    }

    public void fillPassword() {
        System.out.println("Fill password...");
    }

    public void clickButtonLogin() {
        System.out.println("Click button login...");
    }

    @Test
    public void redirectToDashboard() {
        fillUsername();
        fillPassword();
        clickButtonLogin();

        String expectedTitleHeading = "Welcome to Dashboard";
        String actualTitleHeading = "Welcome to Dashboard";
        Assert.assertEquals(actualTitleHeading, expectedTitleHeading);
    }

    @Test(priority = -1, groups = {"high", "auth"})
    public void loginPositive(){
        LoginController loginController = new LoginController();
        loginController.setUsername("Bebek");
        loginController.setPassword("123qwe");
        boolean actual = loginController.login();
        Assert.assertTrue(actual);
    }

    @Test(groups = {"high", "auth"})
    public void loginNegative(){
        LoginController loginController = new LoginController();
        loginController.setUsername("");
        loginController.setPassword("");
        boolean actual = loginController.login();
        Assert.assertFalse(actual);
    }
}
