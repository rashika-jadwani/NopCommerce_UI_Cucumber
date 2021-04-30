package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

public class AddNewCustomerSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Then("user can view the {string} page")
    public void userCanViewThePage(String dashboardString) {
        new DashboardPage(driver).getDashboardPageHeader();
    }

    @Then("user can view Add new customer page")
    public void userCanViewAddNewCustomerPage() {
    }


    @When("user clicks on customers menu")
    public void userClicksOnCustomersMenu() {
    }

    @And("click on Add new button")
    public void clickOnAddNewButton() {
    }

    @When("user enters the customer info")
    public void userEntersTheCustomerInfo() {
    }

    @Then("click on save button")
    public void clickOnSaveButton() {
    }

    @Then("user can view the confirmation message {string}")
    public void userCanViewTheConfirmationMessage(String arg0) {
    }
}
