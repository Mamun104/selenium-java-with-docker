package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LoginPage {

    @FindBy(name= "username")
    WebElement txtUsername;
    @FindBy(name= "password")
    WebElement txtPassword;
    @FindBy(className= "button")
    WebElement btnLogin;

    public WebDriver driver;
    public LoginPage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password){
        txtUsername.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }

}
