package pages;

import basesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoodsPage extends BasePage {

    public GoodsPage(WebDriver driver) {
      super(driver);
    }

    private final String PRODUCT_HEADER_TITLE = "//h1[@class='p-view__header-title']";

    // WEB ELEMENTS
    public WebElement productTitle() {
        return visibilityOfElementByXpath(PRODUCT_HEADER_TITLE);
    }

    //ACTIONS WITH ELEMENTS
    public String getNameProductHeaderTitle() {
       return productTitle().getText();
    }
}