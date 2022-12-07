package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {
    By computerMenuLink = By.linkText("Computers");
    public void clickOnComputer() {
       // clickOnElement(computerMenuLink)
    }
    By desktopLink = By.xpath("//h2//a[@title='Show products in category Desktops']");
        public void desktopLink (String desktops) {
            clickOnElement(desktopLink);
        }

        By productsOrderby = By.id("products-orderby");
        public void getProductsOrderby(){
        }
        //"Name: Z to A");    //  Verify the Product will arrange in Descending order.
        By addToCartButton = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/1/1/1\"),!1']");
       public void getAddToCartButton(){

           clickOnElement(addToCartButton);
       }
       By buildYourOwnComputerText = By.xpath("//h1[text()='Build your own computer']");
        public String getBuildYourComputerText () {
            return getTextFromElement(buildYourOwnComputerText);
        }
        By selectProductIntelPentiumDual = By.id("product_attribute_1");
    public void setSelectProductIntelPentiumDualt(String email){
        clickOnElement(selectProductIntelPentiumDual);
    }
        By selectProduct8GB = By.id("product_attribute_2");
    public void getSelectProduct8GB(){
        clickOnElement(selectProduct8GB);
    }
        By selectProductHDDRadio = By.id("product_attribute_3_7_2");
    public void getSelectProductHDDRadio(){
        clickOnElement(selectProductHDDRadio);
    }
        By selectProductRadio = By.id("product_attribute_4_9");
    public void getSelectProductRadio() {
        clickOnElement(selectProductRadio);
        By selectProductCheckBoxes = By.xpath("//label[@for='product_attribute_5_12']");
    }
    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander[+$5.00]"
    // clickOnElement(By.xpath("//label[@for='product_attribute_5_10']"));
    By clickingboxes=By.xpath("//label[@for='product_attribute_5_12']");
    public void getClickingboxes(){
        clickOnElement(clickingboxes);
    }
    //2.11 Verify the price "$1,475.00"
    By verifyPrice=By.xpath("//span[@text()='$1,475.00']");
    public String getVerifyPrice(){
return getTextFromElement(verifyPrice);
    }


    //2.12 Click on "ADD TO CARD" Button.
    By clickAddToCard= By.xpath("//button[@id='add-to-cart-button-1']");
    public void getcClickAddToCard(){
        clickOnElement(clickAddToCard);
    }
    // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar  After that close the bar clicking on the cross button.
    By verifyAddToCart = By.xpath("//P[@class='content']");
    public String getErrorMessage(){
        return getTextFromElement(verifyAddToCart);
    }
      //  2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 By clickOnGoToCart=By.xpath("//span[@class='cart-label']");
    public void getClickOnGoToCart(){
        mouseHoverToElementAndclick(clickOnGoToCart);
    }
      // 2.15 Verify the message "Shopping cart"
      By verifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");
    public String getVerifyShoppingCart() {
        return getTextFromElement(verifyShoppingCart);
    }
    //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        By clickChangeToQty= By.xpath("//input[@class='qty-input']");
        public void getClickChangeToQty(){
            clickOnElement(clickChangeToQty);
        }
    /*By findElement= By.xpath("//input[@class='qty-input']");
    public void getClickChangeToQty(){
        clickOnElement(clickChangeToQty);
    }
    clickOnElement(By.xpath("//input[@class='qty-input']"));
        driver.findElement(By.xpath("//input[@class='qty-input']")).clear();
    sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
    */

    By clickOnCart =By.name("updatecart");
    public void getclickOnCart(){
        clickOnElement(clickOnCart);
    }
   /*

    clickOnElement(By.xpath("//button[@class='button-2 update-cart-button']"));
       */
    // 2.17 Verify the Total"$2,950.00"
  By verifyTotal = By.xpath("//strong[text()='$2,950.00']");
    public String getVerifyTotal() {
        return getTextFromElement(verifyTotal);
    }
    //2.18 click on checkbox “I agree with the terms of service"
        By clickOnTextAgree= By.xpath("//input[@id='termsofservice']");
        public void getClickOnTextAgree() {
            clickOnElement(clickOnTextAgree);
        }
    // 2.19 Click on “CHECKOUT”
    By clickCheckOut=By.xpath("//button[@class='button-1 checkout-button']");
        public void getclickCheckOut(){
    clickOnElement(clickOnTextAgree);
    }
    //2.20 Verify the Text “Welcome, Please Sign In!”
    By verifyWelcomeText = By.xpath("//h1[text()='Welcome, Please Sign In!']");
    public String getVerifyWelcomeText() {
        return getTextFromElement(verifyWelcomeText);
    }
    //2.21Click on “CHECKOUT AS GUEST”Tab
    By clickOnTextGuest= By.xpath("//button[text()='Checkout as Guest']");
    public void getClickOnTextGuest() {
        clickOnElement(clickOnTextGuest);
    }
    //2.22 Fill the all mandatory field
    By fillFirstName =By.id("BillingNewAddress_FirstName");
    public void getFillFirstName(String BillingNewAddress_FirstName ) {
        sendTextToElement(fillFirstName, BillingNewAddress_FirstName);
    }
    By fillLastName =By.id("BillingNewAddress_LastName");
    public void getFillLastName(String BillingNewAddress_LastName ) {
        sendTextToElement(fillLastName, BillingNewAddress_LastName);
    }

    By fillEmail =By.id("BillingNewAddress_Email");
    public void getfillEmail(String BillingNewAddress_Email ) {
        sendTextToElement(fillEmail, BillingNewAddress_Email);
    }
    By fillCountry =By.id("BillingNewAddress_CountryId");
    public void getfillCountry(String BillingNewAddress_CountryId ) {
        sendTextToElement(fillCountry, BillingNewAddress_CountryId);
    }
    By fillState =By.id("BillingNewAddress_StateProvinceId");
    public void getfillState(String BillingNewAddress_StateProvinceId) {
        sendTextToElement(fillState, BillingNewAddress_StateProvinceId);
    }


    //selectByVisibleTextFromDropDown(By.id("BillingNewAddress_StateProvinceId"), "Other");
    By fillCity =By.id("BillingNewAddress_City");
    public void getFillCity(String BillingNewAddress_City) {
        sendTextToElement(fillCity, BillingNewAddress_City);
    }
    By fillAddress1 =By.id("BillingNewAddress_Address1");
    public void getFillAddress1(String BillingNewAddress_Address1) {
        sendTextToElement(fillCity, BillingNewAddress_Address1);
    }
    By fillAddress2 =By.id("BillingNewAddress_Address2");
    public void getFillAddress2(String BillingNewAddress_Address2) {
        sendTextToElement(fillAddress2, BillingNewAddress_Address2);
    }
    By fillZipPostalCode =By.id("BillingNewAddress_ZipPostalCode");
    public void getFillZipPostalCode(String BillingNewAddress_ZipPostalCode) {
        sendTextToElement(fillZipPostalCode, BillingNewAddress_ZipPostalCode);
    }
    By fillPhoneNumber =By.id("BillingNewAddress_PhoneNumber");
    public void getFillPhoneNumber(String BillingNewAddress_PhoneNumber) {
        sendTextToElement(fillPhoneNumber, BillingNewAddress_PhoneNumber);
    }
    By fillFaxNumber =By.id("BillingNewAddress_FaxNumber");
    public void getFillFaxNumber(String BillingNewAddress_FaxNumber) {
        sendTextToElement(fillFaxNumber, BillingNewAddress_FaxNumber);
    }

    // 2.23 Click on “CONTINUE”
    By clickCountinue =By.xpath("//button[@class='button-1 new-address-next-step-button'and@name='save']");
    public void getClickCountinue() {
        clickOnElement(clickCountinue);
    }
    // 2.24 Click on Radio Button “Next Day Air($0.00)”
    By clickRadioButton =By.id("shippingoption_1");
    public void getRadioButton() {
        clickOnElement(clickRadioButton);
    }
    //2.25 Click on “CONTINUE”
    By clickOnContinue =By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    public void getClickOnContinue() {
        clickOnElement(clickOnContinue);
    }
    // 2.26 Select Radio Button “Credit Card”
    By clickOnCard =By.xpath("//button[@type='button'and@onclick='PaymentMethod.save()']");
    public void getClickOnCard() {
        clickOnElement(clickOnCard);
    }
    // 2.27 Select “Master card” From Select credit card dropdown
    By clickOnMasterCard =By.xpath("//select[@id='CreditCardType']");
    public void getClickMasterCard() {
        clickOnElement(clickOnMasterCard);
    }
    // 2.28 Fill all the details
    By fillCardholderName =By.id("CardholderName");
    public void getFillCardholderName(String text) {
        sendTextToElement(fillCardholderName,text);
    }

    By fillCardNumber =By.id("CardNumber");
    public void getCardNumber(String text) {
        sendTextToElement(fillCardNumber,text);
    }
    By fillCardMonth =By.id("ExpireMonth");
    public void getFillCardMonth(String ExpireMonth) {

        selectByVisibleTextFromDropDown(fillCardMonth,ExpireMonth);
    }
    By fillCardYear =By.id("ExpireYear");
    public void getFillCardYear(String ExpireYear) {

        selectByVisibleTextFromDropDown(fillCardYear,ExpireYear);
    }
   By fillCardCode=By.xpath("//input[@data-val-regex='Wrong card code']");
    public void getFillCardCoder(String text) {
        sendTextToElement(fillCardCode,text);
    }


    // 2.29 Click on “CONTINUE”
   By clickOnCountiue1 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    public void getclickOnCountiue1(){
        clickOnElement(clickOnCountiue1);
    }
    // 2.30 Verify “Payment Method” is “Credit Card”
    By cardText = By.xpath("//label[text()='Credit Card']");
   //String expectedMethod = "Credit Card";
    public String getExpectedMethod() {
        return getTextFromElement(cardText);
    }

    // 2.32 Verify “Shipping Method” is “Next Day Air”
    By shippingMethod = By.xpath("//label[text()='Next Day Air ($0.00)']");
    public String getshippingMethod() {
        return getTextFromElement(shippingMethod);
    }
    //2.33 VerifyTotal  is “$2,950.00”
    By verifyTotal1 = By.xpath("//strong[text()='$2,950.00']");
    public String getverifyTotal() {
        return getTextFromElement(verifyTotal1);
    }
      //2.34 Click on “CONFIRM”
      By clickOnConfirm2 = By.xpath("//button[@onclick='ConfirmOrder.save()']");
    public void getclickOnConfirm2() {
        getTextFromElement(clickOnConfirm2);
    }
    //2.35 Verify the Text “Thank You”
    By verifyThankYou = By.xpath("//h1[text()='Thank you']");
    public String getVerifyThankYou() {
        return getTextFromElement(verifyThankYou);
    }
   //2.36 Verify the message “Your order has been successfully processed!”
   By verifyOrderText = By.xpath("//strong[text()='Your order has been successfully processed!']");
    public String getverifyOrderText() {
        return getTextFromElement(verifyOrderText);
    }
    //2.37 Click on “CONTINUE”
    By clickOnConfirm3 = By.xpath("//button[@onclick='setLocation(\"/\")']");
    public void getclickOnConfirm3() {
        getTextFromElement(clickOnConfirm3);
    }
    //2.37 Verify the text “Welcome to our store”
    By verifyWelcomeText1 = By.xpath("//h2[text()='Welcome to our store']");
    public String getVerifyWelcomeText1() {
        return getTextFromElement(verifyWelcomeText1);
    }
}


