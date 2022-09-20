import org.testng.Assert;
import org.testng.annotations.Test;
import util.PropertyLoader;

import java.util.Random;
import java.util.logging.Logger;

public class RozetkaTest extends TestBase {

    private static final Logger log = Logger.getLogger(String.valueOf(RozetkaTest.class));

    @Test
    public void incorrectLoginTest() {

        app.getNavigationHelper().goToLink(PropertyLoader.loadProperty("url"));
        app.getUserHelper().userSignIn(PropertyLoader.loadProperty("user.name"),
                PropertyLoader.loadProperty("user.password"), PropertyLoader.loadProperty("user.surname"),
                new Random().nextInt(2560000) + "", PropertyLoader.loadProperty("user.email"));
        Assert.assertEquals(app.getUserHelper().getNumberOfInvalidFields(), 5);
    }

    @Test
    public void incorrectLoginTest2() {

        app.getNavigationHelper().goToLink(PropertyLoader.loadProperty("url"));
        app.getUserHelper().userSignIn(PropertyLoader.loadProperty("user.name"),
                PropertyLoader.loadProperty("user.password"), PropertyLoader.loadProperty("user.surname"),
                new Random().nextInt(2560000) + "", PropertyLoader.loadProperty("user.email"));
        Assert.assertEquals(app.getUserHelper().getNumberOfInvalidFields(), 5);
    }
}