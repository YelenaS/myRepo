package pageObgects;

import core.FactoryMethods;
import org.openqa.selenium.By;

/**
 * Created by Администратор on 03.07.2016.
 */
public class MainPage  extends FactoryMethods {
    By emailFild = By.id("user-email");
    By passFild = By.id("user-password");
    By Sabmit = By.xpath(".//*[@id='sign-in-form']/button");


    public void setEmail(String email) {
        driver.findElement(emailFild).clear();
        driver.findElement(emailFild).sendKeys(email);
    }

    public void setPass(String pass){
        driver.findElement(passFild).clear();
        driver.findElement(passFild).sendKeys(pass);
    }

    public void clikOnSabmit (){
        driver.findElement(Sabmit).click();
    }
}
