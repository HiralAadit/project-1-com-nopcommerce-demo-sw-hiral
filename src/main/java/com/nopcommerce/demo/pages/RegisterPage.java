package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By RegisterLink = By.linkText("Register");
    By errorMessage = By.xpath("//h1[text()='Signing up is easy!']");
By firstNameField = By.name("customer.firstName");
By lastNameField = By.name("customer.lastName");
By AddressField = By.name("customer.address.street");
By CityField = By.name("customer.address.street");
By zipCodeField = By.name("customer.address.zipCode");
By phoneField = By.name("customer.phone");
By ssnField = By.name("customer.ssn");
By usernameField = By.id("customer.username");
By passwordField = By.id("password");
By comfirmPasswordField = By.id("repeatedPassword");



     /*   clickOnElement(By.xpath("//input[@value='Register']"));
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        String actualMessage = getTextFromElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));
        Assert.assertEquals("Your account was created successfully. You are now logged in.", expectedMessage, actualMessage);

    */
}




