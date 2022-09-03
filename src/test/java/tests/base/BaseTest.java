package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pages.base.BasePage;
import pages.rozetka_com.RozetkaHomePage;
import pages.rozetka_com.RozetkaSignInPage;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
    protected RozetkaSignInPage rozetkaSignInPage = new RozetkaSignInPage(driver);



    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) { //создаем его в конфиге
            //очищаем кукис
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            //чистим историю сессии
            javascriptExecutor.executeAsyncScript("window.sessionStorage.clear()");

        }
    }
    @AfterSuite(alwaysRun = true)
public void clear(){
    if (HOLD_BROWSER_OPEN) {
        driver.quit();
    }
}

}
