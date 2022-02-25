package weatherApplication.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static weatherApplication.actions.ActionsOnSunscreenPage.*;

public class Sunscreens {
   private  WebDriver driver;

    //creating constructor for Sunscreen
    public Sunscreens(WebDriver d) {
        this.driver = d;

    }
    //clicking the least expensive spf-30 cream
     public static int addLowPriceSpf30(WebDriver driver){
        return clickLowPriceSpf30(driver);
     }
    //clicking the least expensive spf-30 cream
    public static int addLowPriceSpf50(WebDriver driver){
       return clickLowPriceSpf50( driver);
    }
    // clicking add to cart button
    public static  Checkout clickAddToCartButton(WebDriver driver){
        ddToCartButton( driver);
        return new Checkout(driver);
    }

    public static String checkSelectedItem1(WebDriver driver){
        int min1 = addLowPriceSpf30(driver);
        WebElement text1 = driver.findElement(By.xpath("//p[contains(text(),('"+ min1 + "'))]//preceding-sibling::p[@class='font-weight-bold top-space-10']"));
        String item1  = text1.getText();
        return item1;
    }
    public static  String checkSelectedItem2(WebDriver driver){
        int min2 = addLowPriceSpf50(driver);
        WebElement text2 = driver.findElement(By.xpath("//p[contains(text(),('"+ min2 + "'))]//preceding-sibling::p[@class='font-weight-bold top-space-10']"));
        String item2  = text2.getText();
        return item2;
    }
  /*  public  static  ArrayList<String> displaySelectedItem(WebDriver driver){
        String item1 = checkSelectedItem1(driver);
        String item2 = checkSelectedItem2(driver);
        ArrayList<String> list= new ArrayList<String>();
        list.add(item1);
        list.add(item2);
        System.out.println("So the items added to the car are :");
        System.out.println(list);
        return list;
    }*/








    }