import managers.AppManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class TestBase {

    public AppManager app;
    private WebDriver driver;


    @BeforeMethod
    public void beforeMethod() {
    }

    @BeforeClass
    public void beforeClass() {
    }

    @BeforeSuite
    public void beforeSuite() {
        app = new AppManager();
        driver = AppManager.getWebDriver();
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

}