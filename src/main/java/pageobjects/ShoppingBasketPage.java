package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import widgets.SearchWidget;

public class ShoppingBasketPage {

    private WebDriver webDriver;

    @FindBy(xpath = "//*[@id=\"hlb-subcart\"]/div[1]/span/span[2]")
    static WebElement priceOfItemsString;

    public ShoppingBasketPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, ShoppingBasketPage.class);
    }

    public ResultsPage searchFor(String searchItem) {
        SearchWidget searchWidget = new SearchWidget(webDriver);
        searchWidget.searchFor(searchItem);
        return new ResultsPage(webDriver);
    }

    public Float getBasketTotal() {
        return Float.valueOf(priceOfItemsString.toString());
    }

}
