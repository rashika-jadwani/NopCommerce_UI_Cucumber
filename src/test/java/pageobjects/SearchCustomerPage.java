package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WebTableHandler;

public class SearchCustomerPage {

    @FindBy(xpath = "//input[@id='SearchEmail']")
    WebElement searchEmail;

    @FindBy(xpath = "//input[@id='SearchFirstName']")
    WebElement searchFirstName;

    @FindBy(xpath = "//input[@id='SearchLastName']")
    WebElement searchLastName;

    @FindBy(xpath = "//input[@id='SearchCompany']")
    WebElement searchCompany;

    @FindBy(xpath = "//button[@id='search-customers']")
    WebElement searchButton;



    WebDriver driver;
    public SearchCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getCustomerTableData() throws InterruptedException {
        WebTableHandler handler = new WebTableHandler();
        handler.searchUserNameInCustomerTable("Name","Steve Gates");
    }

    public void searchByEmail(String email){
        searchEmail.sendKeys(email);
        searchButton.click();
    }

    public void searchByFirstName(String firstName){
        searchFirstName.sendKeys(firstName);
        searchButton.click();
    }

    public void searchByLatName(String lastName){
        searchFirstName.sendKeys(lastName);
        searchButton.click();
    }

    public void searchByCompany(String company){
        searchCompany.sendKeys(company);
        searchButton.click();
    }
}