package weatherApplication.actions;

import org.openqa.selenium.WebDriver;
import weatherApplication.Locators;



public class clickingOnMainPage {
    private static WebDriver driver;
    //Method of clicking Moisture button
    public static void clickMoistureButton (WebDriver driver) {
        Locators button1 = new Locators(driver);
        button1.moistureButton(driver).click();
    }
    //Method of clicking Sunscreen button
    public static void clickSunscreenButton(WebDriver driver){
        Locators button2 = new Locators(driver);
        button2.sunscreenButton(driver).click();

    }

}
