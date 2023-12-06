package driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver" , "src/main/resources/geckodriver");
        WebDriver driver = new FirefoxDriver();

        return driver;
    }
}
