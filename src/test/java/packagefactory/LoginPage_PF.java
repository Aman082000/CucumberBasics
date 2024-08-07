package packagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage_PF {

    /*
    Page Factory :
    1. Use FindBy Annotations
    2. Change element types from By to WebElement
    3. Initialized elements using PageFactory.initElements
     */


    WebDriver webDriver = new ChromeDriver();

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password ;

    @FindBy(css = ".oxd-button")
    WebElement login;

    @FindBy(className = "oxd-userdropdown-tab")
    WebElement signoutmenu;

    @FindBy(css = "//a[normalize-space()='Logout']")
    WebElement logout;


    public void enterUsername(String usernameValue){
        username.sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue){
        password.sendKeys(passwordValue);
    }

    public void clickLogin(){
        login.click();
    }

    public boolean signOut(){
        signoutmenu.click();
        logout.click();
        return webDriver.getPageSource().contains("Login");
    }
}
