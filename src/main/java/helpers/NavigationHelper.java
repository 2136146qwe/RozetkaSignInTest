package helpers;

import managers.AppManager;
import org.openqa.selenium.WebDriver;


public class NavigationHelper extends AppManager{
    private WebDriver driver;

    public  NavigationHelper(WebDriver driver){
        super(driver);
        this.driver = driver;
        System.out.println("Initialization of  NavigationHelper");
    }

    public void goToLink(String http) {
        driver.get(http);
    }
}
