import helpers.NavigationHelper;
import helpers.UserHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import java.io.File;
import java.time.Duration;

public class TestBase {

      private static WebDriver driver;

UserHelper userHelper;
NavigationHelper navigationHelper;

    @BeforeMethod
    public void beforeMethod() {
    }

    @BeforeClass
    public void beforeClass() {
    }

      @BeforeSuite
    public void beforeSuite() {
          File chromeDriver = new File("C:\\Users\\21361\\IdeaProjects\\PageObject\\src\\main\\resources" +
                  "\\chromedriver.exe");
          ChromeDriverService chromeDriverService = new ChromeDriverService.Builder()
                  .usingDriverExecutable(chromeDriver)
                  .usingAnyFreePort()
                  .build();
          ChromeOptions chromeOptions = new ChromeOptions()
                  .addArguments("--start-maximized");
          driver = new ChromeDriver(chromeDriverService, chromeOptions);
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        userHelper=new UserHelper(driver);
        navigationHelper=new NavigationHelper(driver);
    }


    @AfterMethod
    public void afterMethod() {
    }

    @AfterClass
    public void afterClass() {
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }

    public UserHelper getUserHelper() {
        return userHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
