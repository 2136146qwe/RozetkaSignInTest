package pages.rozetka_com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import randomNumber.RandomNumber;

public class RozetkaHomePage extends BasePage implements RandomNumber {
    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    //поиск элементов
    private final By userBtn = By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header" +
            "/header/div/div/ul/li[3]/rz-user/button");
    private final By signInBtn = By.xpath("/html/body/app-root/rz-single-modal-window/div[3]/div[2]/rz-user-identification" +
            "/rz-auth/div/form/fieldset/div[5]/button[2]");

//кнопка поиска элементов на хоумПэйдж
  //  private final By findBtn = By.xpath("/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/div/form/button");
    
    
    //методы с этими элементами

    //метод для кнопки найти
   // public RozetkaHomePage clickToFind() {
   //     WebElement btnFind = driver.findElement(findBtn);
    //    waitElementIsVisible(btnFind).click();
      //  return this;
   // }


    //кнопка для входа в кабинет
    public RozetkaHomePage enterSignUp() {
        driver.findElement(userBtn).click();
        driver.findElement(signInBtn).click();
        return this;
    }

    public void pressSignInBtn() {
    }
}

