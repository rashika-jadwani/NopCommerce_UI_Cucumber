package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ExcelHandler;

import java.util.ArrayList;

public class AddCustomerPage {

    @FindBy(xpath = "//a[@href='/Admin/Customer/Create']")
    WebElement addUserButton;

    @FindBy(xpath = "//h1[contains(text(),'Add a new customer')]")
    public WebElement addCustomerPageHeader;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement addEmail;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement addPassword;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement addFirstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement addLastName;

    @FindBy(xpath = "//input[@id='Gender_Male']")
    WebElement addGenderMale;

    @FindBy(xpath = "//input[@id='Gender_Female']")
    WebElement addGenderFemale;

    @FindBy(xpath = "//input[@id='DateOfBirth']")
    WebElement addDateOfBirth;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement addCompany;

    @FindBy(xpath = "//button[@name='save']")
    WebElement saveButton;

    @FindBy(xpath = "//button[@name='save-continue']")
    WebElement saveAndContinueButton;

    @FindBy(xpath = "//div[contains(@class,'alert-success')]")
    public WebElement successAlert;

    WebDriver driver;
    ExcelHandler excelHandler;

    public AddCustomerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addUserButtonClick(){
        addUserButton.click();
    }

    public void addUserInformation(String email, String password, String firstName, String lastName, int dobMonth, int dobDate, int dobYear, String company, String gender){
        addEmail.sendKeys(email);
        addPassword.sendKeys(password);
        addFirstName.sendKeys(firstName);
        addLastName.sendKeys(lastName);
        addDateOfBirth.sendKeys(dobMonth+"/"+dobDate+"/"+dobYear);
        addCompany.sendKeys(company);
        if (gender.equalsIgnoreCase("Female")){
            addGenderFemale.click();
        }else addGenderMale.click();
    }

    public void clickOnSaveButton(){
        saveButton.click();
    }

}