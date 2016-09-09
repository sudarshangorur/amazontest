package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {

    private WebDriver webDriver;

    @FindBy(id = "result_3")
    static WebElement itemToBuy;

    public ResultsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, ResultsPage.class);
    }

    public ProductPage findItemToAddToBasket() {
        itemToBuy.click();
        return new ProductPage(webDriver);
    }
}
