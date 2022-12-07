package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest {

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        ElectronicsPage electronicsPage = new ElectronicsPage();
        electronicsPage.getclickOnElectronics();
        electronicsPage.getclickCellPhone();
        electronicsPage.getverifyTextCellPhones();
        electronicsPage.getclickOnListTab();
        String expectedText1="Cell phones";
        Assert.assertEquals(electronicsPage.getverifyTextCellPhones(),expectedText1,"No text Cell phones");
        electronicsPage.getverifyTextCellPhones1();
        String expectedText2="Cell phones";
        Assert.assertEquals(electronicsPage.getverifyTextCellPhones1(),expectedText1,"No Text Cell phones");
        electronicsPage.getverifyPrice();
        String expectedText3="$349.00";
        Assert.assertEquals(electronicsPage.getverifyPrice(),expectedText1,"No Text Cell phones");
electronicsPage.getqtyUpdated();
        electronicsPage.getclickOnADDTOCART();
electronicsPage.getverifyText();
        String expectedText4="The product has been added to your shopping cart";
        Assert.assertEquals(electronicsPage.getverifyPrice(),expectedText4,"No Text found");
        electronicsPage.getclick2();
//electronicsPage.
electronicsPage.getverifyPrice2();
String expectedText5="Total $698.00";
  Assert.assertEquals(electronicsPage.getverifyPrice2(),expectedText5,"Total $698.00");
electronicsPage.getclickOnCheckbox();
electronicsPage.getverifyText2();
        String expectedText6 = "Welcome, Please Sign In!";
        Assert.assertEquals(electronicsPage.getverifyText2(),expectedText6,"Welcome, text not found");
electronicsPage.getverifyText3();
        String expectedText7= "Register";
        Assert.assertEquals(electronicsPage.getverifyText2(Assert.assertEquals(electronicsPage.getverifyPrice2(),expectedText5,"Total $698.00");),expectedText7,"Text not found");
electronicsPage.getregisterID("111");
electronicsPage.getverifYourRegistrationCompleted();
electronicsPage.getclickOncontinueButton2();
electronicsPage.getVerifyShoppingCart();
String expectedtext8 = "Shopping cart";
        Assert.assertEquals(electronicsPage.getVerifyShoppingCart(),expectedtext8,"Shopping cart");
        //Assert.assertEquals(electronicsPage.getVerifyShoppingCart(),expectedtext8,"shoppinh cart");
        electronicsPage.getlickOnCheckBox();
        electronicsPage.getverifYourRegistrationCompleted();
        String expectedtext9 ="Your registration completed";
        Assert.assertEquals(electronicsPage.getverifYourRegistrationCompleted(),expectedtext9,"Your registration completed");
electronicsPage.getclickOncontinueButton2();
electronicsPage.setCheckBox2();
electronicsPage.checkout3();
electronicsPage.enterCountry("United Kingdom");
electronicsPage.enterCity("London");
electronicsPage.enterZipPostalCode("7 hill RD");
electronicsPage.enterPhoneNumber("Wd12 2fd");
electronicsPage.enterPhoneNumber("1212121212");
electronicsPage.continue3();
electronicsPage.setRadiobutton1();
electronicsPage.continue4();
electronicsPage.setClickOnRadioButton2();
electronicsPage.selectVisa(visa);
electronicsPage.setCardholderName("John clark");
electronicsPage.setCardNumber("4917 3000 0000 0008");
electronicsPage.getExpireMonth("05");
electronicsPage.getExpireYear("2025");
electronicsPage.getcardCode("345");
electronicsPage.setGetContinueButton5();
electronicsPage.paymentMethod();
electronicsPage.shippingMethod1();
String expectedText11="2nd Day Air";
        Assert.assertEquals(electronicsPage.shippingMethod1(),expectedText11,"2nd Day Air");
electronicsPage.gettotal$698();
String expected12="total$698()";
Assert.assertEquals(electronicsPage.gettotal$698(),expected12; "text nottotal$698()");

electronicsPage. getconfirm5();
electronicsPage.thankYou();
        String expected13="total$698()";
        Assert.assertEquals(electronicsPage.thankYou(),expected13; "text not displayed");
electronicsPage.orderProcessed();
        String expected14="orderProcessed()";
        Assert.assertEquals(electronicsPage.thankYou(),expected14; "text not displayed");
electronicsPage.getcontinueButton6();
electronicsPage.message5();
        String expected14="message5()";
        Assert.assertEquals(electronicsPage.message5(),expected14; "message5() not found");
        electronicsPage.getlogout1();
    }
}
