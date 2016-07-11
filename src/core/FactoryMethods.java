package core;

import org.openqa.selenium.WebDriver;

/**
 * Created by Администратор on 03.07.2016.
 */
public class FactoryMethods {
    public static WebDriver driver;


    public boolean waitForUrlContains(String text, int sec){
        for(int i = 0; i<=sec*10; i++){
            if(driver.getCurrentUrl().contains(text)) {
                return true;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
