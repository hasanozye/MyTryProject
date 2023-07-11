package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    protected WebDriver driver;

    /**
     * Bu method overload metodu kullanarak default chrome driver return etmeli
     *
     * @return webdriver return etmeli
     */
    public WebDriver getDriver() {
        return getDriver("");
    }

    /**
     * browser parametresi ile gelen driver'i create etmeli
     *
     * @param browser chrome, firefox, edge, ... olmali
     * @return webdriver return etmeli
     */
    public WebDriver getDriver(String browser) {
        switch (browser.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                driver.manage().window().maximize();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.manage().window().maximize();
        }
        return driver;
    }

    /**
     * driver'i quit eden metod
     */
    public void quitDriver() {
        driver.quit();
    }


}
