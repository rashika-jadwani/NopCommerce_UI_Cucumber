package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.AddCustomerPage;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;
import utilities.DriverManager;

public class AddNewCustomerSteps {
    static Logger logger = Logger.getLogger(AddNewCustomerSteps.class);

    private WebDriver driver;

    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private AddCustomerPage addCustomerPage;

    @Then("user can view the {string} page")
    public void userCanViewThePage(String dashboardString) {
        driver = DriverManager.getDriver();
        dashboardPage = new DashboardPage(driver);
        dashboardPage.getDashboardPageHeader();
        logger.info("User is on Dashboard page");
    }

    @When("user clicks on customers menu")
    public void userClicksOnCustomersMenu() {
        dashboardPage.goToCustomerTab();
        logger.info("user is on the customer page");
    }

    @And("click on Add new button")
    public void clickOnAddNewButton() {
        addCustomerPage = new AddCustomerPage(driver);
        addCustomerPage.addUserButtonClick();
        logger.info("New users can be now added in the list");
    }

    @Then("user can view Add new customer page")
    public void userCanViewAddNewCustomerPage() {
        String pageHeader = addCustomerPage.addCustomerPageHeader.getText();
        Assert.assertTrue(pageHeader.contains("Add a new customer"));
    }

    @When("user enters the customer info as {string} {string} {string} {string} {int} {int} {int} {string} {string}")
    public void user_enters_the_customer_info_as(String email, String password, String firstName, String lastName, Integer dobMonth, Integer dobDay, Integer dobYear, String companyName, String gender) {
       addCustomerPage.addUserInformation(email,password,firstName,lastName,dobMonth,dobDay,dobYear,companyName,gender);
    }

    @Then("click on save button")
    public void clickOnSaveButton() {
        addCustomerPage.clickOnSaveButton();
        logger.info("new user added");
    }

    @Then("user can view the confirmation message {string}")
    public void userCanViewTheConfirmationMessage(String expectedSuccessMessage) {
        if(addCustomerPage.successAlert.isDisplayed()) {
            Assert.assertTrue(addCustomerPage.successAlert.getText().contains(expectedSuccessMessage));
        } else Assert.assertTrue(false);
    }
}
