package pages;

import basesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultAirPodsPage extends BasePage {

    public SearchResultAirPodsPage(WebDriver driver) {
        super(driver);
    }

    private final String FIRST_PRODUCT_CARD_AIR_PODS = "(//a[@class='product-card__title'])[1]";

    // WEB ELEMENTS

    public WebElement firstProductCardAirPods() {
        return visibilityOfElementByXpath(FIRST_PRODUCT_CARD_AIR_PODS);
    }

    //ACTIONS WITH ELEMENTS

    public String getNameFirstProductCardAirPods() {
        return firstProductCardAirPods().getText();
    }

    public void clickFirstProductCardAirPods() {
        clikElement(firstProductCardAirPods());
    }

}
