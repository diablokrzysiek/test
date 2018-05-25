package pl.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Unit test for simple App.
 */
public class Logowanie extends PageObject
{
    public Logowanie (WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//input[@name='login']")
    WebElement login;

    @FindBy(xpath = "//input[@name='haslo']")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement zaloguj;


    public void logowanie(String login, String password){

        this.login.sendKeys(login);
        this.password.sendKeys(password);
        this.zaloguj.click();
    }

}