package pageObgects;

import core.FactoryMethods;
import org.openqa.selenium.By;

/**
 * Created by Администратор on 03.07.2016.
 */
public class Profile extends FactoryMethods {
    By myPage = By.id("main");
    By userName = By.id("content");
    By showAllUserInfo = By.id("showExtInfo");
    By editUserInfo = By.id("user_info_edit");

    By SaveUserInfo = By.id("user_info_save");


    public void goToEditProfile(){
        driver.findElement(editUserInfo).click();
        driver.findElement(showAllUserInfo).click();
    }
}

