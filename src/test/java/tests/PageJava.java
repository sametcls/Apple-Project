package tests;

import org.testng.annotations.Test;
import pages.Java;
import pages.LoginPage;

public class PageJava extends TestBase {

    @Test
    public void javaTest() {

        LoginPage loginPage = new LoginPage();
        Java java = new Java();
        loginPage.login();
        System.out.println(java);
       // java.getHeaderElements();

    }
}
