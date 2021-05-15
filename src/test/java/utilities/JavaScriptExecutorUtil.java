package utilities;

import cucumber.api.java.et.Ja;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtil {

    JavascriptExecutor javaScriptExecutor;

    public JavaScriptExecutorUtil(WebDriver driver){
        javaScriptExecutor = (JavascriptExecutor) driver;
    }

    public void executeScrollBy(int x, int y){
        javaScriptExecutor.executeScript("window.scrollBy("+x+","+y+");");
    }

    public void injectAnAlert(String alertText){
        javaScriptExecutor.executeScript("alert('"+alertText+"');");
    }

    public void executeClickOnElement(WebElement element){
        javaScriptExecutor.executeScript("arguments[0].click;",element);
    }
}
