package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DashboardPage {

    @FindBy(xpath = "//a[text()='Logout']")
    WebElement logoutButton;

    @FindBy(xpath = "//ul[contains(@class, 'nav-sidebar')]/li/a/p[contains(text(),'Customers')]")
    WebElement customerDropdown;

    @FindBy(xpath = "//p[text()=' Customers']")
    WebElement customers;

    @FindBy(xpath = "//div[@class='content-header']/h1")
    WebElement dashboardPageHeader;


    public DashboardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void performLogout(){
        logoutButton.click();
    }

    public String getDashboardPageHeader(){
        return dashboardPageHeader.getText().trim();
    }

    public void goToCustomerTab(){
        customerDropdown.click();
        customers.click();
    }

}