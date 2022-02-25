package weatherApplication.tasks;

import org.openqa.selenium.WebDriver;

import static weatherApplication.actions.ActionsOnSunscreenPage.*;

public class Sunscreens {
   private  WebDriver driver;

    //creating constructor for Sunscreen
    public Sunscreens(WebDriver d) {
        this.driver = d;

    }
    //clicking the least expensive spf-30 cream
     public static void addLowPriceSpf30(WebDriver driver){
         clickLowPriceSpf30(driver);
     }
    //clicking the least expensive spf-30 cream
    public static void addLowPriceSpf50(WebDriver driver){
        clickLowPriceSpf50( driver);
    }
    // clicking add to cart button
    public static  Checkout clickAddToCartButton(WebDriver driver){
        ddToCartButton( driver);
        return new Checkout(driver);
    }







    }