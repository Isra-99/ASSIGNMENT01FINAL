package weatherApplication.actions;

import org.openqa.selenium.WebDriver;

import static weatherApplication.Locators.*;

public class ActionsOnCheckoutPage {

    public static void payButtonClick(WebDriver driver){
        payButton(driver);
    }
    public static void typeEmail(String text,WebDriver driver){
        email(driver).sendKeys(text);
    }
    public static void typeCardNumber(String text,WebDriver driver){
        cardNumber( driver).sendKeys(text);
    }
    public static void typeMonthAndYear(String text,WebDriver driver){
        monthAndYear(driver).sendKeys(text);
    }
    public static void typeCVC(String text,WebDriver driver){
        cvc( driver).sendKeys(text);
    }
    public static void typeZipCode(String text,WebDriver driver){
        zipCode( driver).sendKeys(text);
    }
    public static void submitButtonClick(WebDriver driver){
        submitButton( driver).click();
    }
}
