package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage {
    private WebDriver driver;

    public ShopPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = "li.product:nth-child(2) > a:nth-child(2)")
    private WebElement addToCartButton;


}
