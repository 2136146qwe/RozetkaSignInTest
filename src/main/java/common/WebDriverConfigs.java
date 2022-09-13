package common;

import org.openqa.selenium.WebDriver;
import java.util.Properties;


public class WebDriverConfigs {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        Properties properties = new Properties();


        final String PLATFORM_AND_BROWSER = "win_chrome";
        /**
         * Clear browser cookies each iteration
         * if true - clear cookies
         */
        final Boolean CLEAR_COOKIES_AND_STORAGE = true;
        /**
         * if true - browser close
         */
        final Boolean HOLD_BROWSER_OPEN = true;


        driver.manage().window().maximize();
        return driver;
    }
}