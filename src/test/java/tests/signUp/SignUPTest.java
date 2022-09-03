package tests.signUp;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.ROZETKA_HOME_PAGE;


@Test
public class SignUPTest extends BaseTest {
    public void checkIsRedirectToEnterPage() {
        basePage.open(ROZETKA_HOME_PAGE);
        rozetkaHomePage
                .enterSignUp();
    }
}

