package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy ( css = "a[class='btn btn-primary btn-sm']") public WebElement bluerentalLogin;
    @FindBy(id = "dropdown-basic-button") public WebElement userID;
    @FindBy(xpath = "//a[text()='Logout']") public WebElement logOutLink;
    @FindBy(xpath = "//button[contains(text(),'OK')]") public WebElement OK;

}
