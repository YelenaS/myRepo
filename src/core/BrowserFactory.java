package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Администратор on 03.07.2016.
 */
public class BrowserFactory extends FactoryMethods {

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @AfterTest
    public void quitBrowser() {
        driver.close();
        driver.quit();
    }
}