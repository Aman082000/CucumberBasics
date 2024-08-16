package stepdefinitions;

import pageobjectmodel.LoginPageObjectModel;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_POM {

    WebDriver webDriver = new ChromeDriver();
    LoginPageObjectModel loginPage = new LoginPageObjectModel(webDriver);

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

        //Using methods from common class
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

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
        webDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }

    @Then("validate logout")
    public void validate_logout(){
        boolean titleIsVisible = loginPage.signOut();
        if(titleIsVisible) System.out.println("Logout successful");
        else {
            System.out.println("Logout wasn't successful as title isn't visible");
            System.exit(1);
        }
        webDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
    }

}
