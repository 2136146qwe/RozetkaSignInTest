package helpers;

import managers.AppManager;
import pages.PageManager;

public class UserHelper extends PageManager {

    public UserHelper() {
        super(AppManager.getWebDriver());
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

