package pageobjects;

import org.openqa.selenium.WebDriver;
import widgets.SearchWidget;

import static utils.WebDriverInstance.getFirefoxDriver;

public class AmazonHomePage {

    private WebDriver webDriver;

    public AmazonHomePage() {
        this.webDriver = getFirefoxDriver();
    }

    public AmazonHomePage goToAmazonHomePage() {
        webDriver.get("https://www.amazon.co.uk/");
        return this;
    }

    public ResultsPage searchFor(String searchItem) {
        SearchWidget searchWidget = new SearchWidget(webDriver);
        searchWidget.searchFor(searchItem);
        return new ResultsPage(webDriver);
    }
}
