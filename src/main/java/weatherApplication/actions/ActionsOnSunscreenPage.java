package weatherApplication.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static weatherApplication.Locators.*;

public class ActionsOnSunscreenPage {

    //Method of getting price value of the least expensive cream
    private static int minValue(int[] arr) {
        int min = arr[0];
        for (int ktr = 1; ktr < arr.length; ktr++) {
            if (arr[ktr] < min) {
                min = arr[ktr];
            }
        }
        return min;
    }
    //Method of clicking the least expensive spf-30 cream
    public static  void clickLowPriceSpf30(WebDriver driver) {
        ArrayList<WebElement> list  = listOfSpf30Creams(driver);
        int[] intArray = new int[0];
        for (WebElement lists : list) {
            String textList = lists.getText();
            String str = textList.replaceAll("[^0-9]", "");
            int prices = Integer.parseInt(str);
            intArray = new int[]{prices};
        }
        int minimum;
        minimum = minValue(intArray);
        lowPricebutton(minimum,driver).click();

    }
    //Method of clicking the least expensive spf-50 cream
    public static void clickLowPriceSpf50(WebDriver driver) {
        ArrayList<WebElement> list  = listOfSpf50Creams( driver);
        int[] intArray = new int[0];
        for (WebElement lists : list) {
            String textList = lists.getText();
            String str = textList.replaceAll("[^0-9]", "");
            int prices = Integer.parseInt(str);
            intArray = new int[]{prices};
        }
        int minimum;
        minimum = minValue(intArray);
        lowPricebutton(minimum,driver).click();


    }
    //Method of clicking add to cart button
    public static void ddToCartButton(WebDriver driver){
        addToCart(driver).click();
    }

}
