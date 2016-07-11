package pageObgects;

import core.FactoryMethods;
import org.openqa.selenium.By;

/**
 * Created by Администратор on 03.07.2016.
 */
public class FooterBlock extends FactoryMethods {

    By about = By.xpath("//*[@href='/info/partners']");
    By support = By.xpath("//*[@href='/info/support']");
    By help = By.xpath("//*[@href='/info/tips']");
    By story = By.xpath("//*[@href='/info/stories']");
    By contacts = By.xpath("//*[@href='/info/contacts']");
    By rullsOFsubcribe = By.xpath("//*[@href='/info/mterms']");
    By privacy = By.xpath("//*[@href='/info/privacy']");
    By partners = By.xpath("//*[@href='/info/partners']");

    By ru = By.xpath("//ul[@class='languages']/li[1]/a");
    By en = By.xpath("//ul[@class='languages']/li[2]/a");
    By port = By.xpath("//ul[@class='languages']/li[3]/a");
    By espa = By.xpath("//ul[@class='languages']/li[4]/a");

    public void clikOnAbout() {
        driver.findElement(about).click();
    }
    public void clikOnSupport() {
        driver.findElement(support).click();
    }
    public void clikOnHelp() {
        driver.findElement(help).click();
    }
    public void clikOnStory() {
        driver.findElement(story).click();
    }
    public void clikOnContacts() {
        driver.findElement(contacts).click();
    }
    public void clikOnRullsOFsubcribe() {
        driver.findElement(rullsOFsubcribe).click();
    }
    public void clikOnPrivancy() {
        driver.findElement(privacy).click();
    }
    public void clikOnParters() {
        driver.findElement(partners).click();
    }

    public void clikOnRU() {
        driver.findElement(ru).click();
    }
    public void clikOnEN() {
        driver.findElement(en).click();
    }
    public void clikOnPort() {
        driver.findElement(port).click();
    }
    public void clikOnEspa() {
        driver.findElement(espa).click();
    }


}
