package pages;

import com.google.common.eventbus.SubscriberExceptionContext;
import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;

    public HomePage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "#menu-item-1311 > a:nth-child(1)")
    private WebElement signInButton;
    @FindBy(css = "menu-item-1310")
    private WebElement shopButton;
    @FindBy(css = "#menu-item-1314")
    private WebElement username;

    public void clickSignIn(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();
    }

    public void clickShopButton(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(shopButton));
        shopButton.click();
    }

    public String getUsername(){
        return username.getText();
    }


}
