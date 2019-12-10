package BbcWebsite;

import BbcWebsite.bbcPages.BbcHomePage;
import BbcWebsite.bbcPages.BbcSignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BbcSite {

    WebDriver driver;
    BbcHomePage bbcHomePage;
    BbcSignInPage bbcSignInPage;

    public BbcSite() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        bbcHomePage = new BbcHomePage(driver);
        bbcSignInPage = new BbcSignInPage(driver);
    }

    //Helper Method
    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    public void quit(){
        driver.quit();
    }

    // Pages
    public BbcHomePage bbcHomePage(){
        return bbcHomePage;
    }

    public BbcSignInPage bbcSignInPage() {
        return bbcSignInPage;
    }


}
