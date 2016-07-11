package tests;

import core.BrowserFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObgects.MainPage;

/**
 * Created by Администратор on 03.07.2016.
 */
public class TestLogin extends BrowserFactory {
    @Test
    public void testLoginpage (){
        driver.get("https://kismia.com/");
        MainPage mainPage = new MainPage();

        mainPage.setEmail("blabla@mfsa.ru");
        mainPage.setPass("Defect1206");
        mainPage.clikOnSabmit();

        boolean result = waitForUrlContains("kismia.com/u", 10);

        Assert.assertTrue(result);


    }
}
