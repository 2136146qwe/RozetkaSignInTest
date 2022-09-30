package managers;

import helpers.NavigationHelper;
import helpers.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.SignInPage;

import java.io.File;
import java.time.Duration;
import java.util.logging.Logger;

public class AppManager {

    private static final Logger log = Logger.getLogger(String.valueOf(AppManager.class));

     private static WebDriver driver;
    public HomePage homePage;
    public SignInPage signInPage;


    public AppManager(WebDriver driver) {
        signInPage = new SignInPage(driver);
        homePage =new HomePage(driver);

    }
    }

