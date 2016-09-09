package com.amazon.test.stepdefinitions;

import com.amazon.test.constants.ItemPrices;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.AmazonHomePage;
import pageobjects.ProductPage;
import pageobjects.ResultsPage;
import pageobjects.ShoppingBasketPage;

import static org.junit.Assert.assertEquals;

public class PurchaseSteps {

    private AmazonHomePage amazonHomePage;
    private ResultsPage resultsPage;
    private ShoppingBasketPage shoppingBasketPage;

    @Before
    public void setUp() {
        amazonHomePage = new AmazonHomePage();
    }

    @Given("^I search for a \"([^\"]*)\" on Amazon UK$")
    public void iSearchForAnOnAmazonUK(String searchItem) {
        amazonHomePage.goToAmazonHomePage();
        resultsPage = amazonHomePage.searchFor(searchItem);
    }

    @When("^I add the item to the basket$")
    public void iAddTheItemToTheBasket() {
        ProductPage productPage = resultsPage.findItemToAddToBasket();
        shoppingBasketPage = productPage.addItemToBasket();
    }

    @Given("^I search for a \"([^\"]*)\" on basket page$")
    public void iSearchForAOnBasketPage(String searchItem) {
        shoppingBasketPage.searchFor(searchItem);
    }

    @Then("^The total cost should be the sum of items added before$")
    public void theTotalCostShouldBeTheSumOfItemsAddedBefore() {
        Float expectedTotalPrice = ItemPrices.PRICE_OF_IPHONE6 + ItemPrices.PRICE_OF_IPHONE6_CASE;
        assertEquals(expectedTotalPrice, shoppingBasketPage.getBasketTotal());
    }

}
