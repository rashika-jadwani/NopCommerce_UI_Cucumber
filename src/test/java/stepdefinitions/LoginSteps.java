package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.DashboardPage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

        private WebDriver driver;
        private LoginPage loginPage;
        private DashboardPage dashboardPage;

        @Given("user has launched the chrome browser")
        public void userHasLaunchedTheChromeBrowser() {
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.manage().deleteAllCookies();
        }

        @When("user opens the url {string}")
        public void userOpensTheUrl(String url) {
                driver.get(url);
        }

        @And("user enters the Email as {string} and Password as {string}")
        public void userEntersTheEmailAsAndPasswordAs(String email, String password) {
                loginPage = new LoginPage(driver);
                loginPage.setEmailAndPassword(email, password);
        }

        @And("clicks on Login")
        public void clicksOnLogin() {
                loginPage.clickOnLogin();
        }

        @Then("page title should be {string}")
        public void pageTitleShouldBe(String expectedTitle) {
                String actualTitle = driver.getTitle();
                Assert.assertEquals(expectedTitle, actualTitle);
        }

        @When("user clicks on Logout link")
        public void userClicksOnLogoutLink() {
                dashboardPage = new DashboardPage(driver);
                dashboardPage.performLogout();
                Assert.assertEquals("Your store. Login", driver.getTitle());

        }

        @And("close the browser")
        public void closeTheBrowser() {
                driver.close();
        }

}
