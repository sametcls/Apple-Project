package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Java;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.util.List;

public class LoginTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void positiveLogin() {


        logger.info("Navigating to Login Page");
        LoginPage loginPage = new LoginPage();
        logger .info("Entering th username");
        loginPage.enterUsername (ConfigReader. getProperty ("username"));
        logger.info ( "Entering the password");
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        logger. info("Clicking login button");
        loginPage.clickLoginButton();

        String LoginSucces = Driver.getDriver().findElement(By.xpath("/html/body/div[3]")).getText();

        //System.out.println(LoginSucces);
        Assert.assertEquals(LoginSucces,"Welcome to Codingbat. See help for the latest.");
    }

    @Test
    public void negativeLogin1(){


        loginPage.enterUsername ("dsds");
        loginPage.enterPassword("dssd");
        loginPage.clickLoginButton();

//        Assert.assertEquals(loginPage.logOutLink,"Failed to login -- bad username or password");
    }

    @Test
    public void negativeLogin2(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();

        String logOutLink = Driver.getDriver().findElement(By.xpath("/html/body/p[1]/font")).getText();

        Assert.assertEquals(logOutLink,"Failed to login -- bad username or password");

    }
    @Test
    public void negativeLogin3(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("sdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsdsdfsdfsdfsdfsdfsdfsd");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();

        String logOutLink = Driver.getDriver().findElement(By.xpath("/html/body/p[1]/font")).getText();

        Assert.assertEquals(logOutLink,"Failed to login -- bad username or password");

    }
    @Test
    public void negativeLogin4(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("");
        loginPage.enterPassword("tmbtmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45hortmoimtmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45h4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45htmbortmoim4o5im45im4oi5mh445h45h");
        loginPage.clickLoginButton();

//        String logOutLink = Driver.getDriver().findElement(By.xpath("/html/body/p[1]/font")).getText();

//        Assert.assertEquals(logOutLink,"Failed to login -- bad username or password");

    }
    @Test
    public void negativeLogin5(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername(ConfigReader. getProperty ("username"));
        loginPage.enterPassword("");
        loginPage.clickLoginButton();

        String logOutLink = Driver.getDriver().findElement(By.xpath("/html/body/p[1]/font")).getText();

        Assert.assertEquals(logOutLink,"Failed to login -- bad username or password");

    }
    @Test
    public void negativeLogin6(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("jnknkjnkjnkjon90");
        loginPage.enterPassword(ConfigReader.getProperty("password"));;
        loginPage.clickLoginButton();

        String logOutLink = Driver.getDriver().findElement(By.xpath("/html/body/p[1]/font")).getText();

        Assert.assertEquals(logOutLink,"Failed to login -- bad username or password");

    }
    @Test
    public void negativeLogin7(){
        LoginPage loginPage = new LoginPage();
        loginPage.enterUsername("");
        loginPage.enterPassword(ConfigReader.getProperty("password"));
        loginPage.clickLoginButton();

        String logOutLink = Driver.getDriver().findElement(By.xpath("/html/body/p[1]/font")).getText();

        Assert.assertEquals(logOutLink,"Failed to login -- bad username or password");

    }

    @Test
    public void login(){
        new LoginPage().login();
        Java java = new Java();
        List <WebElement> headerElements = java.getHeaderElements();
        List<String> actual = SeleniumUtils.getElementsText (headerElements);
        System.out.println(actual);
    }


}
