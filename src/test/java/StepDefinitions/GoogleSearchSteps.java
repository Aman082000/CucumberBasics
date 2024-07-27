package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver webDriver = new ChromeDriver();

    @Given("browser is open")
    public void browser_is_open() {

        System.out.println("browser_is_open");
        webDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/");
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("user_is_on_google_search_page");
        webDriver.findElement(By.name("q")).sendKeys("Automation Step By Step");
    }

    @When("user enters a text")
    public void user_enters_a_text() {
        System.out.println("user_enters_a_text");
        webDriver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("user_is_navigated_to_search_results");
        webDriver.getPageSource().contains("Online Courses");

        webDriver.quit();
    }
}
