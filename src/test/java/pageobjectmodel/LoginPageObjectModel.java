package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjectModel {

    WebDriver webDriver;

    By username = By.name("username");
    By password = By.name("password");
    By login = By.cssSelector(".oxd-button");
    By signOutMenu = By.className("oxd-userdropdown-tab");
    By logout = By.cssSelector("//a[normalize-space()='Logout']");

    public LoginPageObjectModel(WebDriver webDriver){
        this.webDriver = webDriver;
    }

    public void enterUsername(String usernameValue){
        webDriver.findElement(username).sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue){
        webDriver.findElement(password).sendKeys(passwordValue);
    }

    public void clickLogin(){
        webDriver.findElement(login).click();
    }

    public boolean signOut(){
        webDriver.findElement(signOutMenu).click();
        webDriver.findElement(logout).click();
        return webDriver.getPageSource().contains("Login");
    }

}