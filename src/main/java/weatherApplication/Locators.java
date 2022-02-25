package weatherApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Locators {

    private  WebDriver driver;
    public  Locators (WebDriver d){
        this.driver = d;
    }

    //WEB ELEMENT OF CURRENT TEMPERATURE
    public static WebElement currentTemperature(WebDriver driver) {
        By currentTemp = By.id("temperature");
        return driver.findElement(currentTemp);
    }

    //WEB ELEMENT OF  MOISTURE BUTTON
    public static WebElement moistureButton(WebDriver driver) {
        return driver.findElement(By.linkText("Buy moisturizers"));
    }

    // WEB ELEMENT OF SUNSCREEN BUTTON
    public static WebElement sunscreenButton(WebDriver driver) {
        return driver.findElement(By.linkText("Buy sunscreens"));

    }

    // LIST OF WEB ELEMENTS HAVING SPF-30 TEXT IN COMMON
    public static ArrayList<WebElement> listOfSpf30Creams(WebDriver driver) {
        return (ArrayList<WebElement>) driver.findElements(By.xpath(" //p[contains(text(),('SPF-30')) or contains(text(),('spf-30')) ]//following-sibling::p[contains(text(),('Price')) ]"));
    }
    // LIST OF WEB ELEMENTS HAVING SPF-30 TEXT IN COMMON

    public static ArrayList<WebElement> listOfSpf50Creams(WebDriver driver) {
        return (ArrayList<WebElement>) driver.findElements(By.xpath(" //p[contains(text(),('SPF-50')) or contains(text(),('spf-50')) ]//following-sibling::p[contains(text(),('Price')) ]"));

    }

    /// WEB ELEMENT OF BUTTON WITH MINIMUM PRICE
    public static WebElement lowPricebutton(int value,WebDriver driver) {

        WebElement element = driver.findElement(By.xpath("//p[contains(text(),('" + value + "'))]" + "//following-sibling::button[@class='btn btn-primary']"));
        return element;
    }

    /// WEB ELEMENT OF ADD TO CART BUTTON
    public static WebElement addToCart(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='thin-text nav-link']"));

    }
    //  WEB ELEMENT OF EMAIL
    public static WebElement email(WebDriver driver){
        return    driver.findElement(By.id("email"));

    }
    /// WEB ELEMENT OF CARD NUMBER
    public static WebElement cardNumber(WebDriver driver){
        return         driver.findElement(By.id("card_number"));

    }
    /// WEB ELEMENT OF MONTH AND YEAR
    public static WebElement monthAndYear(WebDriver driver){
        return         driver.findElement(By.id("cc-exp"));

    }
    /// WEB ELEMENT OF CVC
    public static WebElement cvc(WebDriver driver){
        return         driver.findElement(By.id("cc-csc"));    }



    /// WEB ELEMENT OF ZIPCODE
    public static WebElement zipCode(WebDriver driver){
        return   driver.findElement(By.id("billing-zip"));

    }
    ///WEB ELEMENT OF PAY BUTTON
    public static WebElement payButton(WebDriver driver){
       return    driver.findElement(By.xpath("//button[@class='stripe-button-el']"));


    }

    // WEB ELEMENT OF SUBMIT BUTTON
    public static WebElement submitButton(WebDriver driver){
        return   driver.findElement(By.xpath("//button[@class='stripe-button-el']"));

    }

    /// WEB ELEMENT OF IFRAME
    public static String  iframeNameAttribute(){
        return "stripe_checkout_app";

    }


}
