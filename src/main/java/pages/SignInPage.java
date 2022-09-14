package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.logging.Logger;

public class SignInPage extends Page {

    private static final Logger log = Logger.getLogger(String.valueOf(SignInPage.class));

    public SignInPage(PageManager pages) {
        super(pages);
    }

    @FindBy(id = "registerUserName")
    WebElement userNameField;

    @FindBy(id = "registerUserSurname")
    WebElement userSurnameField;

    @FindBy(id = "registerUserPassword")
    WebElement userPasswordField;

    @FindBy(id = "registerUserPhone")
    WebElement userNumberField;

    @FindBy(id = "registerUserEmail")
    WebElement userEmailField;

    @FindBy(id = "Sign in")
    WebElement signInButton;


    public void fillUserNameField(String userName) {
        wait.until(ExpectedConditions.visibilityOf(userNameField)).sendKeys(userName);
    }

    public void fillUserSurnameField(String userSurname) {
        wait.until(ExpectedConditions.visibilityOf(userSurnameField)).sendKeys(userSurname);
    }

    public void fillUserNumberField(String userNumber) {
        wait.until(ExpectedConditions.visibilityOf(userNumberField)).sendKeys(userNumber);
    }

    public void fillUserEmailField(String userEmail) {
        wait.until(ExpectedConditions.visibilityOf(userEmailField)).sendKeys(userEmail);
    }

    public void fillUserPasswordField(String userPassword) {
        wait.until(ExpectedConditions.visibilityOf(userPasswordField)).sendKeys(userPassword);
    }

    public void clickOnSignInButton() {
        wait.until(ExpectedConditions.elementToBeClickable(signInButton)).click();

    }
}

