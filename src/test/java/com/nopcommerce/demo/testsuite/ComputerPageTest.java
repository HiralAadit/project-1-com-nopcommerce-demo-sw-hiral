package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerPageTest extends BaseTest {
    ComputerPage computerPage = new ComputerPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        computerPage.desktopLink("Desktops");
        computerPage.getProductsOrderby("Name: Z TO A");
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
        computerPage.getAddToCartButton("");
computerPage.getBuildYourComputerText();
        String expectedMessage = "Build your own computer";
        Assert.assertEquals(computerPage.getErrorMessage(),expectedMessage,"Message not displayed");
computerPage.setSelectProductIntelPentiumDualt("2.2 GHz Intel Pentium Dual-Core E2200");
computerPage.getSelectProduct8GB("2.2 GHz Intel Pentium Dual-Core E2200");
computerPage.getSelectProductHDDRadio("8GB [+$60.00]");
computerPage.getSelectProductRadio("400 GB [+$100.00]");
computerPage.getClickingboxes("Vista Premium [+$60.00]");
        computerPage.getVerifyPrice();
        String expectedMessage1 = "The product has been added to your";
        Assert.assertEquals(computerPage.getErrorMessage(),expectedMessage1,"Message not displayed");
computerPage.getVerifyShoppingCart();
        computerPage.getcClickAddToCard();
        String expectedMessage2 = "shopping cart";
        Assert.assertEquals(computerPage.getVerifyShoppingCart(),expectedMessage2,"Message not displayed");
computerPage.getClickOnGoToCart();
        computerPage.getClickChangeToQty();
       // driver.findElement(By.xpath("//input[@class='qty-input']")).clear();Message not displayed
       // sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
computerPage.getVerifyTotal();
        String expectedMessage3 = "$2,950.00";
        Assert.assertEquals(computerPage.getVerifyTotal(),expectedMessage3,"Message not displayed");
     computerPage.getClickOnTextAgree();
     computerPage.getclickCheckOut();
     computerPage.getVerifyWelcomeText();
        String expectedMessage4 = "Welcome, Please Sign In!";
        Assert.assertEquals(computerPage.getVerifyWelcomeText(),expectedMessage4,"Message not displayed");
        computerPage.getClickOnTextGuest();
        computerPage.getFillFirstName("john");
        computerPage.getFillLastName("white");
        computerPage.getfillEmail("123test@gmail.com");
        computerPage.getfillCountry("United Kingdom");
        computerPage.getfillState("Other");
        computerPage.getFillCity("London");
        computerPage.getFillAddress1("14 crofts Rd");
        computerPage.getFillAddress2("Watford");
        computerPage.getFillZipPostalCode("wd17 2tr");
        computerPage.getFillPhoneNumber("07654327856");
        computerPage.getFillFaxNumber("7654327856");
        computerPage.getClickCountinue();
        computerPage.getRadioButton();
        computerPage.getClickOnContinue();
        computerPage.getClickOnCard();
        computerPage.getClickMasterCard();
        computerPage.getFillCardholderName("john white");
        computerPage.getCardNumber("0795 5666 6667 7777");
        computerPage.getFillCardMonth("05");
        computerPage.getFillCardYear("2005");
        computerPage.getFillCardCoder("567");
        computerPage.getclickOnCountiue1();
        computerPage.getExpectedMethod();
        String expectedMessage5 = "Credit Card";
        Assert.assertEquals(computerPage.getExpectedMethod(),expectedMessage5,"Message not displayed");
        computerPage.getshippingMethod();;
        String expectedMessage6 = "\"Shipping Method” is “Next Day Air\"";
        Assert.assertEquals(computerPage.getshippingMethod(),expectedMessage6,"Message not displayed");
        computerPage.getverifyTotal();
        String expectedMessage7 = "$2,950.00";
        Assert.assertEquals(computerPage.getverifyTotal(),expectedMessage7,"Message not displayed");
       computerPage.getclickOnConfirm2();
computerPage.getVerifyThankYou();
        String expectedMessage8 = "Thank You";
        Assert.assertEquals(computerPage.getVerifyThankYou(),expectedMessage8,"Message not displayed");
        computerPage.getverifyOrderText();
        String expectedMessage9 = "Your order has been successfully processed!";
        Assert.assertEquals(computerPage.getverifyOrderText(),expectedMessage9,"Message not displayed");
        computerPage.getVerifyThankYou();
        computerPage.getclickOnConfirm3();
        computerPage.getVerifyWelcomeText();
        String expectedMessage10 = "Welcome to our store";
        Assert.assertEquals(computerPage.getVerifyWelcomeText1(),expectedMessage10,"Message not displayed");

    }



