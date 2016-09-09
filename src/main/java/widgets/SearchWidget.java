package widgets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ProductPage;

public class SearchWidget {

    private WebDriver webDriver;

    @FindBy(id = "twotabsearchtextbox")
    static WebElement searchBox;
    @FindBy(id = "nav-search-submit-text")
    static WebElement lensBtn;

    public SearchWidget(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, SearchWidget.class);
    }

    public void searchFor(String searchItem) {
        searchBox.sendKeys(searchItem);
        lensBtn.click();
    }
}
