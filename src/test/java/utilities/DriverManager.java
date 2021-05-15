package utilities;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static WebDriver webDriver;

    public static void setDriver(WebDriver driver) {
        webDriver = driver;
    }

    public static WebDriver getDriver() {
        return webDriver;
    }

}
