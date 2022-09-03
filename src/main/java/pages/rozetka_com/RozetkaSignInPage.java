package pages.rozetka_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import randomNumber.RandomNumber;

public class RozetkaSignInPage extends BasePage implements RandomNumber {
    public RozetkaSignInPage(WebDriver driver) {
        super(driver);
    }

    private final By userBtn = By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header" +
            "/header/div/div/ul/li[3]/rz-user/button");
    private final By signInBtn = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]" +
            "/rz-user-identification/rz-auth/div/form/fieldset/div[5]/button[2]");
    private final By userNameString = By.id("registerUserName");
    private final By userSurnameString = By.id("registerUserSurname");
    private final By userPhoneNumberString = By.id("registerUserPhone");
    private final By userEmailString = By.id("registerUserEmail");
    private final By userPassString = By.id("registerUserPassword");
    private final By signInFinishBtn = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]" +
            "/rz-user-identification/rz-register/div/form/fieldset/div[8]/button[1]");


    public RozetkaSignInPage pressSignInBtn() {
        driver.findElement(userBtn).click();
        driver.findElement(signInBtn).click();
        driver.findElement(userNameString).sendKeys("ИмяПользователя");
        driver.findElement(userSurnameString).sendKeys("ФамилияПользователя");
        driver.findElement(userPhoneNumberString).sendKeys("630474841");
        driver.findElement(userEmailString).sendKeys("ФамилияПользователя" + n + "@gmail.com");
        driver.findElement(userPassString).sendKeys("Qweasdzxc789" + n);
        driver.findElement(signInFinishBtn).click();
        return this;

    }
}
