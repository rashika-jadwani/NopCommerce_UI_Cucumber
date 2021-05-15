package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTableHandler {
    public static WebDriver driver = DriverManager.getDriver();

    public void searchUserNameInCustomerTable(String columnName, String userName) throws InterruptedException {
        int columnNum=0, rowNum=0;

        List<WebElement> headerRow = driver.findElements(By.xpath("//div[@class='dataTables_scrollHeadInner']/table/thead/tr/th"));

        for(WebElement e:headerRow){
            columnNum++;
            if (e.getText().equals(columnName)){
                break;
            }
        }

        TimeUnit.SECONDS.sleep(3);

        List<WebElement> listOfNames = driver.findElements(By.xpath("//table[@id='customers-grid']/tbody/tr/td["+columnNum+"]"));

        for (WebElement e:listOfNames){
            rowNum++;
            if (e.getText().equals(userName)){
                System.out.println(e.getText());
                driver.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+rowNum+"]/td[1]")).click();
                break;
            }
        }
    }

}
