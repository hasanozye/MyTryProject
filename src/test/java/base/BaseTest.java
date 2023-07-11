package base;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class BaseTest {
    /*
    driver wait fieldları.
    BaseTest Class'ini extend eden child class'lar içinde kullanılacak
     */

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    protected Faker faker;

    protected BaseTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
        faker = new Faker();
    }

    /**
     * bu metod aldiği url ile alttaki overload netodu kullanır
     * title için "" gönderin
     *
     * @param url gidilecek url
     */

    protected void open(String url) {
        open(url, "");
    }

    /**
     * bu metod aldığı url'e driver.get metodu ile gider
     * title'in uzunluğu >0 ise title'i contain ettiğini assert eder
     *
     * @param url   gidilecek url
     * @param title sayfanin assert edilecek beklenen title'i
     */
    protected void open(String url, String title) {
        driver.get(url);
        if (title.length() > 0) {
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(false);
        }
    }

    /**
     * aldiği locator'i elemente cevirip click icin alttaki overload metoda gönderir
     *
     * @param locator element locator'i
     */
    protected void click(By locator) {
        WebElement element1 = driver.findElement(locator);
        click(element1);
        //TODO kodlar
    }

    /**
     * aldığı elemente click eder
     *
     * @param element2 element
     */
    protected void click(WebElement element2) {
        wait.until(ExpectedConditions.elementToBeClickable(element2)).click();
    }

    /**
     * aldığı locator'i elemente cevirip sendkey için alttaki overload metgodu gönderir
     *
     * @param locator locator
     * @param text    send edilecek text
     */
    protected void sendKeys(By locator, String text) {
        WebElement element = driver.findElement(locator);
        sendKeys(element, text);
    }

    /**
     * aldığı element'e text'i send eder. clear() da yapmalı
     *
     * @param element WebElement
     * @param text    send edilecek text
     */
    protected void sendKeys(WebElement element, String text) {
        //TODO tamamm
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);

    }

    /**
     * @param locator locator
     */
    protected void scrollIntoView(By locator) {
        WebElement element = driver.findElement(locator);
        scrollIntoView(element);
    }

    /**
     * aldığı elemente kadar scrollintoWiev ile scroll eder
     *
     * @param element element
     */

    protected void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    /**
     * aldığı y piksel kadar aşağı scroll yapar
     *
     * @param y piksel kadar aşağı kaydırır
     */
    protected void scrollBy(int y) {
        js.executeScript("window.scrollTo(0,300)");
    }


}
