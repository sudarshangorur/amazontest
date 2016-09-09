package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

    private WebDriver webDriver;

    @FindBy(id = "add-to-cart-button")
    static WebElement addToBasketBtn;
    @FindBy(id = "priceblock_ourprice")
    static WebElement priceOfItem;

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, ProductPage.class);
    }

    public ShoppingBasketPage addItemToBasket() {
        addToBasketBtn.click();
        return new ShoppingBasketPage(webDriver);
    }

    private float capturePriceOfItem() {
        return Float.valueOf(priceOfItem.getText());
    }
}
