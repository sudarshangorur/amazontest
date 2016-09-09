package utils;

import com.machinepublishers.jbrowserdriver.JBrowserDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverInstance {

    public static WebDriver getJBrowserDriver() {
        return new JBrowserDriver();

    }

    public static WebDriver getFirefoxDriver() {
        return new FirefoxDriver();

    }

    public static WebDriver getSafariDriver() {
        return new SafariDriver();

    }
}
