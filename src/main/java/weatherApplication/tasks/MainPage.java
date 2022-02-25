package weatherApplication.tasks;

import org.openqa.selenium.WebDriver;
import weatherApplication.Locators;
import weatherApplication.actions.clickingOnMainPage;



public class MainPage {
    private  WebDriver driver;
    ///Creating constructor
    public MainPage (WebDriver driver){
        this.driver = driver;
    }

    ////on the basis of temperature the Sunscreens or Moisture button will be clicked for that we will create method named decsion
    public void decision(WebDriver driver){
        ////Getting the actual text of temperature
        String temperature_text =  Locators.currentTemperature(driver).getText();
        ///// Saving the string into new string for spearating integers and characters
        String str = temperature_text.replaceAll("[^0-9]","");
        //converting the string into integer andin this way we get actual integer value of the temperature
        int stats = Integer.parseInt(str);
        stats = 70;
        if (stats <= 19) {
            moisturePage(driver);
        }
        else if (stats >= 34) {
            sunscreenPage(driver);
        }
        else{
            System.out.println("invalid");
        }


    }
    public static Moistures moisturePage(WebDriver driver){
        clickingOnMainPage.clickMoistureButton(driver);
        return new Moistures(driver);
    }
    public static Moistures sunscreenPage(WebDriver driver){

        clickingOnMainPage.clickSunscreenButton(driver);
        return new Moistures(driver);
    }


}
