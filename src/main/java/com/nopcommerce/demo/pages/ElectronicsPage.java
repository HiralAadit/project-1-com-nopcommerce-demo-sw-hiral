package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.awt.SystemColor.text;

public class ElectronicsPage extends Utility {
    //2.1

    By clickOnElectronics = By.xpath("//ul[@class='top-menu notmobile']/li[2]");

    public void getclickOnElectronics() {
        mouseHoverToElementAndclick(clickOnElectronics);
    }

    //2.2
    By clickCellPhone = By.xpath("//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a");

    public void getclickCellPhone() {
        mouseHoverToElementAndclick(clickCellPhone);
    }

    //2.3
    By verifyTextCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");

    public String getverifyTextCellPhones() {
        return getTextFromElement(verifyTextCellPhones);
    }

    //2.4
    By clickOnListTab = By.xpath("//a[contains(text(),'List')]");

    public void getclickOnListTab() {
        clickOnElement(clickOnListTab);
    }
    //2.5

    //
    By clickOnProduct = By.xpath("//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]");

    public void getclickOnProduct() {
        clickOnElement(clickCellPhone);
    }

    //2.6
    By verifyTextCellPhones1 = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    public String getverifyTextCellPhones1() {
        return getTextFromElement(verifyTextCellPhones1);
    }

    By verifyPrice = By.xpath("//span[@id='price-value-20']");

    public String getverifyPrice() {
        return getTextFromElement(verifyPrice);
    }

    By qtyUpdated = By.xpath("//input[@id='product_enteredQuantity_20']");

   /* public void getqtyUpdated() {
        WebELement Quantity = driver.findElement(qty);
        Quantity.clear();
        Quantity.sendKeys(2);
        clickOnElement(qtyUpdated);
    }

    */

    By clickOnADDTOCART = By.xpath("//button[@id='add-to-cart-button-20']");

    public void getclickOnADDTOCART() {
        clickOnElement(clickOnADDTOCART);
    }

    By verifyText = By.xpath("//div[@id='bar-notification']/div/p");

    public String getverifyText() {
        return getTextFromElement(verifyText);
    }

    By click1 = By.xpath("//span[@class='close']");

    public void getclick1() {
        clickOnElement(click1);
    }

    By hoverShoppingcart = By.xpath("//span[contains(text(),'Shopping cart')]");

    public void gethoverShoppingcart() {
        mouseHoverToElement(hoverShoppingcart);
    }

    By click2 = By.xpath("//button[contains(text(),'Go to cart')]");

    public void getclick2() {
        clickOnElement(click2);
    }

    By verifyText2 = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String geyverifyText2() {
        return getTextFromElement(verifyText2);
    }

    /*//2.13 Verify the quantity is 2
   By qtyUpqte2=By.xpath("//input[@class=\"qty-input\"]");
     WebElement quantity1 = driver.findElement;
     String qty = text.getAttribute("value");
         Assert.assertEquals("no value", "2", qty);
     */
    // 2.14 Verify the Total $698.00
    By verifyPrice2 = By.xpath("//span[@class='product-subtotal']");

    public String getverifyPrice2() {
        return getTextFromElement(verifyPrice2);
    }

    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");

    public void getclickOnCheckbox() {
        clickOnElement(clickOnCheckbox);
    }

    //2.16 Click on “CHECKOUT”
    By clickOnCHECKOUT = By.xpath("//button[@id='checkout']");

    public void getclickOnCHECKOUT() {
        clickOnElement(clickOnCHECKOUT);
    }

    //  2.17 Verify the Text “Welcome, Please Sign In!”
    By verifyText2 = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public String getverifyText2() {
        return getTextFromElement(verifyText2);
    }

    By clickOnREGISTER = By.xpath("//button[@onclick='location.href=\"https://demo.nopcommerce.com/register?returnUrl=%2Fcart\"']");

    public void getclickOnREGISTER() {
        clickOnElement(clickOnREGISTER);
    }

    By verifyText3 = By.xpath("//button[@onclick='location.href=\"https://demo.nopcommerce.com/register?returnUrl=%2Fcart\"']");

    public String getverifyText3() {
        return getTextFromElement(verifyText3);
    }

    By fillFirstName = By.id("FirstName");

    public void getFillFirstName(String FirstName) {
        sendTextToElement(fillFirstName, FirstName);
    }

    By fillLastName = By.id("LastName");

    public void getFillLastName(String LastName) {
        sendTextToElement(fillLastName, LastName);
    }

    By fillemail = By.id("Email");

    public void getfillEmail(String text) {
        sendTextToElement(fillemail, text);
    }

    By fillPassword = By.id("Password");

    public void getFillPassword(String text) {
        sendTextToElement(fillPassword, text);
    }

    By fillconfirmPassword = By.id("ConfirmPassword");

    public void getfillConfirmPassword(String text) {
        sendTextToElement(fillconfirmPassword, text);
    }

    By registerID = By.id("register-button");

    public void getregisterID(String text) {
        sendTextToElement(registerID, text);
    }
    //2.22
    By verifYourRegistrationCompleted = By.xpath("//div[text()='Your registration completed']");

    public String getverifYourRegistrationCompleted() {
        return getTextFromElement(verifYourRegistrationCompleted);
    }
    By clickOncontinueButton2 = By.xpath("//a[@class='button-1 register-continue-button']");

    public void getclickOncontinueButton2 () {
        clickOnElement(clickOncontinueButton2 );
    }
By verifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");
    public void getVerifyShoppingCart(){
        clickOnElement(verifyShoppingCart);
    }
    By clickOnCheckBox=By.id("termsofservice");
    public void getlickOnCheckBox(){
        clickOnElement(clickOnCheckBox);
    }
    public String registrationCompleted() {
        return getTextFromElement(textMessageYourRegistrationCompleted);
    }

    //2.23 Click on “CONTINUE” tab
    By continueButton2 = By.xpath("//a[@class='button-1 register-continue-button']");

    public void continueB() {
        clickOnElement(continueButton2);
    }

    //2.24 Verify the text “Shopping card”
    By getVerifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");

    public String shoppingCart1() {
        return getTextFromElement(getVerifyShoppingCart);
    }

    //2.25 click on checkbox “I agree with the terms of service”
    By checkBox1 = By.id("termsofservice");

    public void setCheckBox2() {
        clickOnElement(checkBox1);
    }

    //2.26 Click on “CHECKOUT”
    By Checkout = By.id("termsofservice");

    public void checkout3() {
        clickOnElement(Checkout);
    }
    //2.27 Fill the Mandatory fields*****


    By country = By.id("BillingNewAddress_CountryId");

    public void enterCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
    }

    By city = By.id("BillingNewAddress_City");

    public void enterCity(String text) {
        sendTextToElement(city, text);

    }

    By address1 = By.id("BillingNewAddress_Address1");

    public void enterAddress1(String text) {
        sendTextToElement(address1, text);

    }

    By zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");

    public void enterZipPostalCode(String text) {
        sendTextToElement(zipPostalCode, text);

    }

    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");

    public void enterPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);

    }

    //2.28 Click on “CONTINUE”
    By continueButton3 = By.xpath("//button[text() = 'Continue']");

    public void continue3() {
        clickOnElement(continueButton3);
    }

    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    By radiobutton1 = By.id("shippingoption_2");

    public void setRadiobutton1() {
        clickOnElement(radiobutton1);
    }

    // 2.30 Click on “CONTINUE”
    By continueButton4 = By.xpath("//div[@id='shipping-method-buttons-container']/button");

    public void continue4() {
        clickOnElement(continueButton4);
    }

    // 2.31 Select Radio Button “Credit Card”
    By clickOnRadioButton2 = By.xpath("//input[@id='paymentmethod_1']");
    By clickOnContinue4 = By.xpath("//div[@id='checkout-step-payment-method']/div/button");

    public void setClickOnRadioButton2() {
        clickOnElement(clickOnRadioButton2);
        clickOnElement(clickOnContinue4);
    }

    // 2.32 Select “Visa” From Select credit card dropdown
    By selectVisa = By.id("CreditCardType");

    public void selectVisa(String text) {
        selectByVisibleTextFromDropDown(selectVisa, text);
    }
    //2.33 Fill all the details

    By cardholderName = By.xpath("//input[@data-val-required='Enter cardholder name']");

    public void setCardholderName(String text) {
        sendTextToElement(cardholderName, text);
    }

    By cardNumber = By.id("CardNumber");

    public void setCardNumber(String text) {
        sendTextToElement(cardNumber, text);

    }

    By ExpireMonth = By.id("ExpireMonth");

    public void getExpireMonth(String text) {
        sendTextToElement(ExpireMonth, text);

    }

    By ExpireYear = By.id("ExpireYear");

    public void getExpireYear(String text) {
        sendTextToElement(ExpireYear, text);

    }

    By CardCode = By.xpath("//input[@id='CardCode']");

    public void getcardCode(String text) {
        sendTextToElement(CardCode, text);

    }

    //2.34 Click on “CONTINUE”
    By getContinueButton5 = By.xpath("//div[@id='payment-info-buttons-container']/button");

    public void setGetContinueButton5() {
        clickOnElement(getContinueButton5);

    }

    //2.35 Verify “Payment Method” is “Credit Card”
    By PaymentMethod1 = By.xpath("//li[@class='payment-method']/span[2]");

    public String paymentMethod() {
        return getTextFromElement(PaymentMethod1);
    }

    //2.36 Verify “Shipping Method” is “2nd Day Air”
    By shippingMethod = By.xpath("//li[@class='shipping-method']/span[2]");

    public String shippingMethod1() {
        return getTextFromElement(shippingMethod);
    }

    //2.37 Verify Total is “$698.00”
    By total$698 = By.xpath("//td[@class='subtotal']/span");

    public String gettotal$698() {
        return getTextFromElement(total$698);
    }

    // 2.38 Click on “CONFIRM”
    By confirmButton5 = By.xpath("//button[text()='Confirm']");

    public void getconfirm5() {
        clickOnElement(confirmButton5);
    }

    // 2.39 Verify the Text “Thank You”
    By thankYouMessage = By.xpath("//h1[contains(text(),'Thank you')]");

    public String thankYou() {
        return getTextFromElement(thankYouMessage);
    }

    // 2.40 Verify the message “Your order has been successfully processed!”
    By orderSuccessfullyProcessed = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    public String orderProcessed() {
        return getTextFromElement(orderSuccessfullyProcessed);
    }

    //2.41 Click on “CONTINUE”
    By ContinueButton6 = By.xpath("//button[contains(text(),'Continue')]");

    public void getcontinueButton6() {
        clickOnElement(ContinueButton6);

    }

    //2.42 Verify the text “Welcome to our store”
    By welcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    public String message5() {
        return getTextFromElement(message5());
    }

    //2.43 Click on “Logout” link
    By logout1 = By.xpath("//a[contains(text(),'Log out')]");

    public void getlogout1() {
        clickOnElement(logout1);

    }



}































