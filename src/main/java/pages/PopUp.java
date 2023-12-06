package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PopUp {
    private WebDriver driver;

    public PopUp(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = ".fc-cta-consent > p:nth-child(2)")
    private WebElement popUpButton;

    public void clickPopUpButton(){
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(popUpButton));
        popUpButton.click();
    }
}
