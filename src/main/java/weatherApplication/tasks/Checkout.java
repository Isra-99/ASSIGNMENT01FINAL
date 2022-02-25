package weatherApplication.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

import static weatherApplication.actions.ActionsOnCheckoutPage.*;
import static weatherApplication.tasks.Sunscreens.displaySelectedItem;

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
        driver.findElement(By.id("email")).sendKeys(text); ;
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


    public ArrayList<String> checkItems() {

        ArrayList<WebElement> items = (ArrayList<WebElement>) driver.findElements(By.xpath("//td[ contains (text(),'SPF') or contains (text(),'spf')]"));
        ArrayList<String> list = new ArrayList<>();
        System.out.println("the final list is");
        for (WebElement i : items) {
            String str= i.getText();
            list.add(str);
        }
        System.out.println(list);
        return list;
    }



    public void checkIfPopulatedCorrectly(WebDriver driver)
    {
        ArrayList<String> s1 = checkItems();
        ArrayList<String> s2 = displaySelectedItem( driver);
        boolean boolval = s1.equals(s2); //returns true because lists are equal
        System.out.println("Cart is populated correctly so " + boolval);



    }



}
