package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;


public class HomePage extends Page {

    private static final Logger log = Logger.getLogger(String.valueOf(HomePage.class));

    public HomePage(PageManager pages) {
        super(pages);
    }


    @FindBy(xpath = "//button[@class='header__button ng-star-inserted']")
    WebElement userMenuButton;

    @FindBy(xpath = "//button[@class='auth-modal__register-link button button--link ng-star-inserted']")
    WebElement signInButton;


    public void clickOnUserMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(userMenuButton)).click();
    }

    public void clickOnTheSignInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

}