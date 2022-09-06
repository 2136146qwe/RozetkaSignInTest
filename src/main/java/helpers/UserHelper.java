package helpers;

import managers.AppManager;
import org.openqa.selenium.WebElement;
import pages.PageManager;

    public class UserHelper extends PageManager {

        public UserHelper() {
            super(AppManager.getWebDriver());
        }

        public void userSignIn(String userName,String userPassword,String userSurname,String userNumber,
                               String userEmail){
            homePage.clickOnTheSignInButton();
            signInPage.fillUserNameField(userName);
            signInPage.fillUserPasswordField(userPassword);
            signInPage.fillUserSurnameField(userSurname);
            signInPage.fillUserNumberField(userNumber);
            signInPage.fillUserEmailField(userEmail);
            signInPage.clickOnSignInButton();
        }


        public WebElement getViewUserMenuElem(){
            return homePage.getViewProfileMenuButton();
        }

       // public String getHeadFromUserMenu(){
       //     homePage.clickOnTheViewProfileMenuButton();
        //    return homePage.getSignedInNotifyElement().getText();
       // }

       // public String getSignInErrorMessageText(){
         //   return signInPage.getErrorMessage();
        //}

       // public void userSignOut(){
        //    getDriver().navigate().refresh();
         //   homePage.clickOnTheViewProfileMenuButton();
         //   homePage.clickOnTheSignOutButton();
       // }

    }

