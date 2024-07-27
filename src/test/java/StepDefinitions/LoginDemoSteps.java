package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps {

    WebDriver webDriver = new ChromeDriver();

    @Given("Browser is open")
    public void browser_is_open() {
        webDriver.get("https://opensource-demo.orangehrmlive.com");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }

    @And("User is on login page")
    public void user_is_on_login_page() {
        if(webDriver.getTitle().equals("OrangeHRM")){
            System.out.println("On login Page");
        }
        else{
            System.out.println("Not on login Page");
            System.exit(1);
        }
        webDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }

    @When("^User enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        webDriver.findElement(By.name("username")).sendKeys(username);
        webDriver.findElement(By.name("password")).sendKeys(password);
        webDriver.findElement(By.cssSelector(".oxd-button")).click();

        webDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }

    @And("User is navigated to login page")
    public void user_is_navigated_to_login_page() {
        boolean elementIsPresent = webDriver.getPageSource().contains("Dashboard");
        if(elementIsPresent) System.out.println("Element is present");
        else {
            System.out.println("Element is not present");
            System.exit(1);
        }
    }

}
