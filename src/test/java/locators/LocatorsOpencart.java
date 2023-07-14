package locators;

import org.openqa.selenium.By;

public interface LocatorsOpencart {

    By lMyAccountO = By.xpath("//a[@title='My Account']");
    By lRegisterO= By.xpath("//*[text()='Register']");
    By lFirstNameO = By.cssSelector("#input-firstname");
    By lLastNameO = By.cssSelector("#input-lastname");
    By lEMailO = By.cssSelector("#input-email");
    By lTelephoneO = By.cssSelector("#input-telephone");
    By lPasswordO = By.cssSelector("#input-password");
    By lPasswordConfirmO = By.cssSelector("#input-confirm");
    By lPrivPolicyO = By.xpath("//*[@name='agree']");
    By lContinueBtnO = By.xpath("//*[@value='Continue']");
    By lCongratsPageO = By.xpath("//*[text()='Congratulations! Your new account has been successfully created!']");
    By lLogOutO = By.xpath("//li//a[text()='Logout']");
    By lLogoutPage0 = By.xpath("//*[text()='You have been logged off your account. It is now safe to leave the computer.']");




}
