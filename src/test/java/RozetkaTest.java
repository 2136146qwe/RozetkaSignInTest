import org.testng.annotations.Test;
import util.PropertyLoader;

import java.util.logging.Logger;

public class RozetkaTest extends TestBase {

    private static final Logger log = Logger.getLogger(String.valueOf(RozetkaTest.class));

    @Test
    public void correctLoginTest() {

        app.getNavigationHelper().goToLink("https://rozetka.com.ua/ua/");
        app.getUserHelper().userSignIn(PropertyLoader.loadProperty("user.name"),
                PropertyLoader.loadProperty("user.password"), PropertyLoader.loadProperty("user.surname"),
                PropertyLoader.loadProperty("user.number"), PropertyLoader.loadProperty("user.email"));
    }
}