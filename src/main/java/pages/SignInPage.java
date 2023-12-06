package pages;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    private WebDriver driver;

    public SignInPage(){
        driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver , this);
    }

    @FindBy(css = ".xoo-el-username_cont > div:nth-child(1) > input:nth-child(2)")
    private WebElement signInEmail;
    @FindBy(css = "div.xoo-aff-cont-password:nth-child(2) > div:nth-child(1) > input:nth-child(2)")
    private WebElement password;
    @FindBy(css = ".xoo-el-login-btn")
    private WebElement signInButton;

    public void login(String email , String password){
        signInEmail.sendKeys(email);
        this.password.sendKeys(password);
        signInButton.click();
    }

}
