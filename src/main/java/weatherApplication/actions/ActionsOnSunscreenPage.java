package weatherApplication.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static weatherApplication.Locators.*;

public class ActionsOnSunscreenPage {

    //Method of getting price value of the least expensive cream
    private static int minValue( ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int ktr = 1; ktr < arr.size(); ktr++) {
            if (arr.get(ktr) < min) {
                min = arr.get(ktr);
            }
        }
        return min;
    }
    //Method of clicking the least expensive spf-30 cream
    public static  int clickLowPriceSpf30(WebDriver driver) {
        ArrayList<WebElement> list = listOfSpf30Creams(driver);
        ArrayList<Integer> intArray = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String textList = list.get(i).getText();
            String str = textList.replaceAll("[^0-9]", "");
            int prices = Integer.parseInt(str);
            intArray.add(prices);
        }
        int minimum;
        minimum = minValue(intArray);
        lowPricebutton(minimum, driver).click();
        return minimum;

    }
    //Method of clicking the least expensive spf-50 cream
    public static int clickLowPriceSpf50(WebDriver driver) {
        ArrayList<WebElement> list  = listOfSpf50Creams( driver);
        ArrayList<Integer> intArray = new ArrayList<>();
        for (WebElement lists : list) {
            String textList = lists.getText();
            String str = textList.replaceAll("[^0-9]", "");
            int prices = Integer.parseInt(str);
            intArray.add(prices);
        }
        int minimum;
        minimum = minValue(intArray);
        lowPricebutton(minimum,driver).click();
        return  minimum;


    }
    //Method of clicking add to cart button
    public static void ddToCartButton(WebDriver driver){
        addToCart(driver).click();
    }

}
