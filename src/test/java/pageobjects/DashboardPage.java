package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutButton;

    public DashboardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void perofrmLogout(){
        logoutButton.click();
    }

}
