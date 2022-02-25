package weatherApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import weatherApplication.tasks.Checkout;
import weatherApplication.tasks.MainPage;
import weatherApplication.tasks.Sunscreens;
public class TemperatureTests {
    private WebDriver driver;
    @BeforeTest
    public void launchBrowser() {
        /// Launching Chrome Browser and opening the website
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://weathershopper.pythonanywhere.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void startTest(){

        //// now testing from main page
        MainPage mainPage  = new MainPage(driver);
        /// By calling decision either sunscreen page or moisture page will be opened depending on the temperature
        mainPage.decision(driver);
        /// If it is Sunscreen page then
       Sunscreens sunscreens = new Sunscreens(driver);
        //// Adding low price spf 30 cream
        sunscreens.addLowPriceSpf30(driver);
        //// Adding low price spf 30 cream
        sunscreens.addLowPriceSpf50(driver);
        /// Adding selected items to the cart
        sunscreens.clickAddToCartButton(driver);
        Checkout checkout = new Checkout(driver);
        Checkout.clickPayButton(driver);
        checkout.enterEmail("icheetah1999@gmail.com",driver);
        checkout.enterCardNumber("4242",driver);
        checkout.enterCardNumber("4242",driver);
        checkout.enterCardNumber("4242",driver);
        checkout.enterCardNumber("4242",driver);
        checkout.enterMonth("05",driver);
        checkout.enterMonth("22",driver);
        checkout.enterCVC("333",driver);
        checkout.enterZipcode("35004",driver);
        checkout.clickSubmitButton(driver);

    }
    @AfterTest
    public void terminateBrowser(){
        driver.close();
    }

    public static void main(String arg[]){
        // creating instant of TemperatureTest
        TemperatureTests testing = new TemperatureTests();
        testing.launchBrowser();
        testing.startTest();

    }


}
