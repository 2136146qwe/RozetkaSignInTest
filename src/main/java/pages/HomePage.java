package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;


public class HomePage extends Page {

    private static final Logger log = Logger.getLogger(String.valueOf(HomePage.class));

    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[@class='header__button ng-star-inserted']")
    WebElement userMenuButton;

    @FindBy(xpath = "//button[contains (@class,'register-link')]")
    WebElement signInButton;


    public void clickOnUserMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(userMenuButton)).click();
    }

    public void clickOnSignInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

}