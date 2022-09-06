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

    @FindBy(xpath = "/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification/rz-auth/div/form" +
            "/fieldset/div[5]/button[2]")
    WebElement signInButton;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/ul/li[3]/rz-user/button/svg")
    WebElement viewProfileMenuButton;

    public void clickOnTheSignInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();
    }

    public WebElement getViewProfileMenuButton() {
        return viewProfileMenuButton;
    }

    public void clickOnTheViewProfileMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(viewProfileMenuButton)).click();
    }

//@FindBy(xpath = "//a[contains(text(), 'Signed in as')]")
    //WebElement signedInNotify;

    // @FindBy(xpath = "//button[contains(text(), 'Sign out')] ")
    // WebElement signOutButton;
    //public void clickOnTheSignOutButton(){
    //     wait.until(ExpectedConditions.elementToBeClickable(signOutButton)).click();
    //}
    //public WebElement getSignedInNotifyElement(){
    //    return signedInNotify;
    //}


}