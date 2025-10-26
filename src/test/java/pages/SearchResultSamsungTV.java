package pages;

import basesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultSamsungTV extends BasePage {

    public SearchResultSamsungTV(WebDriver driver) {
        super(driver);
    }

    private final String VIEW_MODE_BUTTON = "//button[@class='view-mode__button' and @title='Таблиця']";
    private final String NAME_SEARCH_PRODUCT = "//div[@class='products-layout__container products-layout--grid']//a[@class='product-card__title']";
    private final String COMMENTS_NUMBERS_BUTTON = "//span[@class='review-button__text review-button__text--count']";

    public WebElement viewModeButton() {
      return   visibilityOfElementByXpath(VIEW_MODE_BUTTON);
    }

    public List<WebElement> nameSearchedProduct() {
        return visibilityOfElementsByXpath(NAME_SEARCH_PRODUCT);
    }

    public List<WebElement> comentsNumbersButton() {
        return visibilityOfElementsByXpath(COMMENTS_NUMBERS_BUTTON);
    }

    public boolean viewModeButtonDisplayed() {
        return isElementDisplayed(viewModeButton());
    }

}
