package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class Java {
    public Java() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='h2'])[1]")
    private List<WebElement> headerElements;
    public List<WebElement> getHeaderElements() {
        return headerElements;
    }


}
