package weatherApplication.tasks;

import org.openqa.selenium.WebDriver;

public class FinalReceipt {
    private static WebDriver driver;
    ///Creating FinalReceipt constructor
    public FinalReceipt (WebDriver d){
        this.driver = d;

    }
    public void display() {
        System.out.println("GOT THE RECEIPT!!!!");
    }

}
