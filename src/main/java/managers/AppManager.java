package managers;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SignInPage;

import java.util.logging.Logger;

public class AppManager {

    private static final Logger log = Logger.getLogger(String.valueOf(AppManager.class));

    private static WebDriver driver;
    public HomePage homePage;
    public SignInPage signInPage;


    public AppManager(WebDriver driver) {
        signInPage = new SignInPage(driver);
        homePage = new HomePage(driver);

    }
}

