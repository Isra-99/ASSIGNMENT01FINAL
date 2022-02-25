package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import weatherApplication.tasks.Checkout;
import weatherApplication.tasks.FinalReceipt;
import weatherApplication.tasks.MainPage;
import weatherApplication.tasks.Sunscreens;

public class Steps {
    private WebDriver driver;
    @Given("User launches the browser and opens the application")
    public void user_launches_the_browser_and_opens_the_application() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://weathershopper.pythonanywhere.com/");
        driver.manage().window().maximize();
    }

    @When("User read the temperature value")
    public void user_read_the_temperature_value() {
        MainPage mainPage  = new MainPage(driver);
        mainPage.readTemperature();
    }

    @Then("User buys either moisturizers or Sunscreens on the basis of temperature")
    public void user_buys_either_moisturizers_or_sunscreens_on_the_basis_of_temperature() {
        MainPage mainPage  = new MainPage(driver);
        mainPage.decision(driver);
        Sunscreens sunscreens = new Sunscreens(driver);
        sunscreens.addLowPriceSpf30(driver);
        sunscreens.addLowPriceSpf50(driver);
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
        FinalReceipt finalReceipt = new FinalReceipt(driver);
        finalReceipt.display();

    }
}
