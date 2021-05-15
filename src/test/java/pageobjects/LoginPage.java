package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.JavaScriptExecutorUtil;

public class LoginPage {

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordTextBox;

    @FindBy(xpath = "//button[text()='Log in']")
    WebElement loginButton;

    WebDriver driver;
    JavaScriptExecutorUtil javaScriptExecutorUtil;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        javaScriptExecutorUtil = new JavaScriptExecutorUtil(driver);
        PageFactory.initElements(driver,this);
    }

    public void setEmailAndPassword(String email, String password){
        emailTextBox.clear();
        emailTextBox.sendKeys(email);
        passwordTextBox.clear();
        passwordTextBox.sendKeys(password);
    }

    public void clickOnLogin(){
        loginButton.click();
        javaScriptExecutorUtil.executeScrollBy(0,1000);
    }

}
