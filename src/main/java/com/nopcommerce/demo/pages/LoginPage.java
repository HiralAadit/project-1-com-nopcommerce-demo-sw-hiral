package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By usernameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@class='button']");
    // Assert.assertEquals("‘Accounts Overview", expectedMessage, actualMessage);
    By errorMessage = By.xpath("");

    By logOutField = By.xpath("//a[text()='Log Out']");


    public void enterUsername(String username) {
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(usernameField, password);
    }
    public void clickOnLoginbutton() {
        clickOnElement(loginButton);
    }
    public String getErrorMessage() {
            return getTextFromElement(errorMessage);
        }

        public String clickOnLogOut(){
        return getTextFromElement(logOutField);
    }
    }
