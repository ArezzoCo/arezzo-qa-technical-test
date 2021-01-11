package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.UnreachableBrowserException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {

    public static WebDriver driver;
    public static WebDriverWait wait;


    public static synchronized WebDriver createDrive() {
        if(driver == null) {
            System.setProperty("webdriver.chrome.driver", "#PathToDriver");
            try {
                ChromeOptions options = new ChromeOptions();
                DesiredCapabilities caps = DesiredCapabilities.chrome();
                caps.setBrowserName("chrome");
                caps.setVersion("86.0");
                caps.merge(options);
                driver = new ChromeDriver(options);
                wait = new WebDriverWait(driver, 30);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
		return driver;
    }

    public static void loadPage(String url) {
        createDrive().get(url);
    }

    public static void close() {
        try {
            createDrive().quit();
            driver = null;
        } catch (UnreachableBrowserException e) {
        }
    }

}
