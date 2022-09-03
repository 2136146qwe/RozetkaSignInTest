package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {
            case "win_chrome":
                System.setProperty("webDriver.chrome.driver", "C:/Users/21361/Desktop/Testing/chromedriver.exe");
                driver = new ChromeDriver();
                break;

            //можно написать сколько угодно кейсов на разные браузеры, а через конфиг передавать с чем конкретно работаем
            //дефолтное поведение на случай проблем, которые будут говорить об ошибке
            default:
                Assert.fail("Incorrect platform or browser name" + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}