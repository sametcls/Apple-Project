package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ConfigReader;
import utils.Driver;

public class LoginPage {

    private WebElement username = Driver.getDriver () .findElement(By.name("uname")) ;

    private WebElement password = Driver.getDriver ().findElement (By.name ("pw"));

    private WebElement button = Driver.getDriver() .findElement (By.xpath ("//input[@type='submit']"));

    public void enterUsername (String username) {
        this.username.sendKeys(username);
    }

    public void enterPassword (String password) {
        this.password.sendKeys(password);
    }

    public void clickLoginButton() {
        button.click();
    }

    public void login() {
        this.username.sendKeys(ConfigReader.getProperty("username"));
        this.password.sendKeys(ConfigReader.getProperty("password"));
        this.button.click();
    }

//    public String logOutLink = Driver.getDriver().findElement(By.xpath("/html/body/p[1]/font")).getText();
}
