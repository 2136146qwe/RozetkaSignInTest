package helpers;

import managers.AppManager;
import org.openqa.selenium.WebDriver;

public class UserHelper extends AppManager {
    private WebDriver driver;

    public UserHelper(WebDriver driver){
        super(driver);
        this.driver=driver;
        System.out.println("Initialization of UserHelper");
    }

    public void userSignIn(String userName, String userPassword, String userSurname, String userNumber,
                           String userEmail) {
        homePage.clickOnUserMenuButton();
        homePage.clickOnSignInButton();
        signInPage.fillUserNameField(userName);
        signInPage.fillUserPasswordField(userPassword);
        signInPage.fillUserSurnameField(userSurname);
        signInPage.fillUserNumberField(userNumber);
        signInPage.fillUserEmailField(userEmail);
        // signInPage.clickOnSignInButton();
    }

    public int getNumberOfInvalidFields() {
        return signInPage.getInvalidFields().size();

    }

}

