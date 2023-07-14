package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static locators.Locators.*;

public class Scenarios extends BaseTest {

    /*
    BaseTest calssini extend etmeli
    BaseTest içindeki fields(variables) ve attribute'lar (methodlar) kullanilmali
    consturtorunda driver ve wait tanimlanmmali
    scenariolar asagidaki metodlar içine yazılmalı
     */

    @Test
    public void Scenario1Saucedemo(){
        open("https://www.saucedemo.com/v1/");
        click(lUsername);

        sendKeys(lUsername,"standard_user");
        click(lPassword);

        sendKeys(lPassword,"secret_sauce");
        click(lLoginButton);

        click(lItemTitle);
        WebElement eItemTitle = driver.findElement(lItemTitle);
        WebElement eItemReviewTitle = driver.findElement(lItemReviewTitle);
        Assert.assertEquals(eItemTitle.getText(),eItemReviewTitle.getText());

        WebElement eAddToCart = driver.findElement(lAddToCart);
        click(lAddToCart);
        Assert.assertEquals(eAddToCart.getText(),"REMOVE");

        click(lShoppingCardSymbol);
        WebElement eItemPrice = driver.findElement(lItemPrice);
        WebElement eCardItemPrice = driver.findElement(lCardItemPrice);
        Assert.assertEquals(eItemPrice.getText(),eCardItemPrice.getText());

        click(lCheckout);
        click(lFirstName);
        sendKeys(lFirstName,faker.name().firstName());
        click(lLastName);
        sendKeys(lLastName,faker.name().lastName());
        click(lPostalCode);
        sendKeys(lPostalCode,faker.address().secondaryAddress());
        click(lContinue);

        WebElement eCheckoutProductTitle = driver.findElement(lCheckoutProductTitle);
        WebElement eCheckoutProductPrice = driver.findElement(lCheckoutProductPrice);
        Assert.assertEquals(eCheckoutProductTitle.getText(),"Sauce Labs Backpack");
        Assert.assertEquals(eCheckoutProductPrice.getText(),"$29.99");

        scrollIntoView(lFinishButton);
        click(lFinishButton);

        WebElement eThanksPage = driver.findElement(lThanksPage);
        Assert.assertEquals(eThanksPage.getText(),"THANK YOU FOR YOUR ORDER");
        driver.quit();

    }

    @Test
    public void Scenario2Opencart(){
        String password = faker.internet().password();

        open("http://opencart.abstracta.us/");
        click(lMyAccountO);
        click(lRegisterO);
        scrollBy(300);

        sendKeys(lFirstNameO,faker.name().firstName());
        sendKeys(lLastNameO,faker.name().lastName());
        sendKeys(lEMailO,faker.internet().emailAddress());
        sendKeys(lTelephoneO,faker.phoneNumber().cellPhone());
        sendKeys(lPasswordO,password);
        sendKeys(lPasswordConfirmO,password);
        click(lPrivPolicyO);
        click(lContinueBtnO);

        WebElement eCongratsPageO = driver.findElement(lCongratsPageO);
        Assert.assertTrue(eCongratsPageO.getText().contains("Congratulations!"));

        click(lMyAccountO);
        click(lLogOutO);

        WebElement eLogoutPage0 = driver.findElement(lLogoutPage0);
        Assert.assertTrue(eLogoutPage0.getText().contains("You have been logged off your account."));

    }


    @Test
    public void Scenario3Demoqa(){

    }
}
