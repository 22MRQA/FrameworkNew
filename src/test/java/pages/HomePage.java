package pages;

import basesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final String SITE_LOGO = "//a[@class='v-logo']";
    private final String CATALOG_BUTTON = "//div[@class='mh-catalog-btn']";
    private final String PRODUCTS_FOR_GAMERS_BUTTON = "(//a[@class='mm__a'])[7]";
    private final String SEARCH_INPUT = "//input[@id='search-form__input']";
    private final String SEARCH_BUTTON = "//button[@class='search-form__submit-button']";
    private final String BUYER_MENU_BUTTON = "//div[@class='mh-button__wrap']";
    private final String BUYER_DROP_DOWN_MENU = "//div[@class='mh-button__dropdown']";
    private final String DELIVERY_AND_PAYMENT_BUTTON = "(//a[@class='mh-button'])[5]";

    // WEB ELEMENTS

    public WebElement siteLogo() {
        return visibilityOfElementByXpath(SITE_LOGO);
    }

    public WebElement catalogButton() {
        return visibilityOfElementByXpath(CATALOG_BUTTON);
    }

    public WebElement catalogGamerButton() {
        return visibilityOfElementByXpath(PRODUCTS_FOR_GAMERS_BUTTON);
    }

    public WebElement searchInput() {
        return visibilityOfElementByXpath(SEARCH_INPUT);
    }

    public WebElement searchButton() {
        return visibilityOfElementByXpath(SEARCH_BUTTON);
    }

    public WebElement buyerMenuButton() {
        return visibilityOfElementByXpath(BUYER_MENU_BUTTON);
    }

    public WebElement buyerDropDownMenu() {
        return visibilityOfElementByXpath(BUYER_DROP_DOWN_MENU);
    }

    public WebElement deliveryAndPaymentButton() {
        return visibilityOfElementByXpath(DELIVERY_AND_PAYMENT_BUTTON);
    }

    //ACTIONS WITH ELEMENTS

    public boolean siteLogoDisplayed() {
        return isElementDisplayed(siteLogo());
    }

    public void clickCatalogButton() {
        clikElement(catalogButton());
    }

    public void clickCatalogGamerButton() {
        clikElement(catalogGamerButton());
    }

    public boolean catalogButtonDisplyaed() {
        return isElementDisplayed(catalogButton());
    }

    public boolean catalogGamerButtonDisplyaed() {
        return isElementDisplayed(catalogGamerButton());
    }

    public void enterValueSearchInput(String value) {
        searchInput().sendKeys(value);
    }

    public void clickSearchButton() {
        clikElement(searchButton());
    }

    public boolean buyerMenuButtonDisplayed() {
        return isElementDisplayed(buyerMenuButton());
    }

    public void clickBuyerMenuButton() {
        clikElement(buyerMenuButton());
    }

    public boolean buyerDropDownMenuDisplayed() {
        return isElementDisplayed(buyerDropDownMenu());
    }

    public boolean deliveryAndPaymentButtonDispayed() {
        return isElementDisplayed(deliveryAndPaymentButton());
    }

    public void clickDeliveryAndPaymentButton() {
        clikElement(deliveryAndPaymentButton());
    }

}
