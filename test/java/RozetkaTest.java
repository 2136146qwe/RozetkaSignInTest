import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import util.PropertyLoader;

import java.util.logging.Logger;

public class RozetkaTest extends TestBase {

    private static final Logger log = Logger.getLogger(String.valueOf(RozetkaTest.class));

    @Test
    public void correctLoginTest(){
      log.info("navigate to ");
        app.getNavigationHelper().goToLink("https://rozetka.com.ua/ua/");
       log.info("login as existing user");
       app.getUserHelper().userSignIn(PropertyLoader.loadProperty("user.name"),
                PropertyLoader.loadProperty("user.password"), PropertyLoader.loadProperty("user.surname"),
               PropertyLoader.loadProperty("user.number"), PropertyLoader.loadProperty("user.email"));
        log.info("Verify that user signed is successfully");
     //   Assert.assertTrue(app.getUserHelper().getHeadFromUserMenu().contains("Signed in as"));
     //   app.getUserHelper().userSignOut();
    }


   // @Test
    //public void unsuccessfulSignInWithInvalidEmailTest()
    //{
    //    log.info("rozetka.");
    //    app.getNavigationHelper().goToLink("https://rozetka.com.ua/ua/");
     //   log.info("login with invalid email");
     //   app.getUserHelper().userSignIn("withoutDoggmail.com",
     //           PropertyLoader.loadProperty("user.password"));
    //    log.info("Verify that user isn`t signed in and error message is appear");
      //  Assert.assertEquals(app.getUserHelper().getSignInErrorMessageText(),"Incorrect username or password.");
   // }

   // @Test
  //  public void unsuccessfulSignInWithInvalidPasswordTest()
   // {
   //     log.info("rozetka.");
    //    app.getNavigationHelper().goToLink("https://rozetka.com.ua/ua/");
     //   log.info("login with invalid password");
     //  app.getUserHelper().userSignIn(PropertyLoader.loadProperty("user.email"),"invalid password");
     //   log.info("Verify that user isn`t signed in and error message is appear");
     //   Assert.assertEquals(app.getUserHelper().getSignInErrorMessageText(),"Incorrect username or password.");
   // }
}