import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.PopUp;
import pages.SignInPage;
import utils.FrameworkProperties;

public class Main {
    public static void main(String[] args) {

        FrameworkProperties frameworkProperties = new FrameworkProperties();
        DriverSingleton.getInstance(frameworkProperties.getProperty("driver"));
        WebDriver driver = DriverSingleton.getDriver();
        driver.get("https://bitheap.tech");

        PopUp popUp = new PopUp();
        HomePage homePage = new HomePage();
        SignInPage signInPage = new SignInPage();

        popUp.clickPopUpButton();
        homePage.clickSignIn();
        signInPage.login("fabriziotrupia1995@gmail.com" , "");

        if (homePage.getUsername().equals("Hello, Fabrizio"))
            System.out.println("Test Passato");
        else
            System.out.println("Test Non Passato");

        DriverSingleton.closeObjectInstance();



    }
}
