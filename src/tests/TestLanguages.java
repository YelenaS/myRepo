package tests;

import core.BrowserFactory;
import org.junit.Assert;
import org.testng.annotations.Test;
import pageObgects.FooterBlock;

/**
 * Created by Администратор on 03.07.2016.
 */
public class TestLanguages extends BrowserFactory {

    @Test
    public void testSwichLanguages (){
        driver.get("https://kismia.com/");

        FooterBlock footerBlock = new FooterBlock();
        footerBlock.clikOnEN();

        boolean result = waitForUrlContains("en.", 10);

        Assert.assertTrue(result);
    }
}

