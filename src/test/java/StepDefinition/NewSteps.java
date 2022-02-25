package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import weatherApplication.tasks.Checkout;
import weatherApplication.tasks.MainPage;
import weatherApplication.tasks.Sunscreens;

public class NewSteps {
    private WebDriver driver;
    @Given("User is on the weather app")
    public void user_is_on_the_weather_app() {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://weathershopper.pythonanywhere.com/");
        driver.manage().window().maximize();
    }

    @When("User reads the temperature and decides what to shop")
    public void user_reads_the_temperature_and_decides_what_to_shop() {
        MainPage mainPage  = new MainPage(driver);
        mainPage.readTemperature();
        mainPage.decision(driver);
    }

    @When("User adds cheapest products into the cart")
    public void user_adds_cheapest_products_into_the_cart() {
        Sunscreens sunscreens = new Sunscreens(driver);
        sunscreens.addLowPriceSpf30(driver);
        sunscreens.addLowPriceSpf50(driver);
        sunscreens.clickAddToCartButton(driver);
    }

    @Then("Cart should be populated correctly")
    public void cart_should_be_populated_correctly() {
        Sunscreens sunscreens = new Sunscreens(driver);
        sunscreens.addLowPriceSpf30(driver);
        //// Adding low price spf 30 cream
        sunscreens.addLowPriceSpf50(driver);
        /// Adding selected items to the cart
        sunscreens.clickAddToCartButton(driver);
        //Checkout checkout = new Checkout(driver);
       // checkout.checkIfPopulatedCorrectly(driver);
    }

    @Then("Checkout should be successful")
    public void checkout_should_be_successful() {
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
}
