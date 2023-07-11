package locators;

import org.openqa.selenium.By;

public interface LocatorsSauceDemo {

    By lUsername = By.cssSelector("#user-name");
    By lPassword = By.cssSelector("#password");
    By lLoginButton = By.id("login-button");
    By lItemTitle = By.xpath("//*[text()='Sauce Labs Backpack']");
    By lItemPrice =By.xpath("//div[text()='29.99']");
    By lItemReviewTitle =By.xpath("//*[text()='Sauce Labs Backpack']");
    By lAddToCart = By.xpath("//*[text()='ADD TO CART']");
    By lShoppingCardSymbol = By.xpath("//*[@data-icon='shopping-cart']");
    By lCardItemPrice = By.xpath("//*[text()='29.99']");
    By lCheckout =By.xpath("//*[text()='CHECKOUT']");
    By lFirstName = By.id("first-name");
    By lLastName = By.id("last-name");
    By lPostalCode = By.id("postal-code");
    By lContinue = By.xpath("//input[@value='CONTINUE']");
    By lCheckoutProductTitle = By.xpath("//*[text()='Sauce Labs Backpack']");
    By lCheckoutProductPrice = By.xpath("//div[@class='cart_item_label']//div[text()='29.99']");
    By lFinishButton = By.xpath("//*[text()='FINISH']");
    By lThanksPage = By.xpath("//*[text()='THANK YOU FOR YOUR ORDER']");






}
