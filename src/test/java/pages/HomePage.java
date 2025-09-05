package pages;

import basesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final String CATALOG_BUTTON = "//div[@class='mh-catalog-btn']";
    private final String PRODUCTS_FOR_GAMERS_BUTTON = "(//a[@class='mm__a'])[7]";

    // WEB ELEMENTS

    public WebElement catalogButton() {
        return visibilityOfElementByXpath(CATALOG_BUTTON);
    }

    public WebElement catalogGamerButton() {
        return visibilityOfElementByXpath(PRODUCTS_FOR_GAMERS_BUTTON);
    }

    //ACTIONS WITH ELEMENTS

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

}
