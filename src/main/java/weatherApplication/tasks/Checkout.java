package weatherApplication.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static weatherApplication.Locators.iframeNameAttribute;
import static weatherApplication.actions.ActionsOnCheckoutPage.*;

public class Checkout {
    private  WebDriver driver;
    //creating checkout constructor
    public Checkout(WebDriver d){
        this.driver = d;
    }

    // Clicking the pay button
    public static void clickPayButton(WebDriver driver){
        driver.findElement(By.xpath("//button[@class='stripe-button-el']")).click();
    }

    ///New window on the same page pops up in which we have to enter credentials before purchasing

    /// creating method of entering email
    private void switchtoEditArea() {
        driver.switchTo().frame("stripe_checkout_app");
    }
    private void switchtoMainArea() {
        driver.switchTo().parentFrame();
    }

    public void enterEmail(String text,WebDriver driver) {
        switchtoEditArea();
        typeEmail( text, driver);
        switchtoMainArea();
    }






    /// creating method of entering mail
    public void enterCardNumber(String text,WebDriver driver) {
        switchtoEditArea();
        typeCardNumber( text, driver);
        switchtoMainArea();
    }



    /// creating method of entering month and year
    public void enterMonth(String text,WebDriver driver) {
        switchtoEditArea();
        typeMonthAndYear( text, driver);
        switchtoMainArea();
    }
    /// creating method of entering cvc
    public void enterCVC (String text,WebDriver driver){
        switchtoEditArea();
        typeCVC(text, driver);
        switchtoMainArea();

    }
    /// creating the method of entering the zipCode
    public void enterZipcode(String text,WebDriver driver) {
        switchtoEditArea();
        typeZipCode( text, driver);
        switchtoMainArea();
    }




    /// creating the method of submitting the credentials
    public FinalReceipt clickSubmitButton(WebDriver driver) {
        switchtoEditArea();
        driver.findElement(By.id("submitButton")).click();
        switchtoMainArea();
        return new FinalReceipt(driver);

    }






}
