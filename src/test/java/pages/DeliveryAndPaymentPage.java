package pages;

import basesClass.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeliveryAndPaymentPage extends BasePage {

    public DeliveryAndPaymentPage(WebDriver driver) {
        super(driver);
    }

    private final String DELIVERY_AND_PAYMENT_HEADER_TITLE = "//h2[@class='sp-page-title sp-h2 page-header']";
    private final String ORDER_PROCESS_SUB_TITLE = "(//h3[@class='sub-block-header'])[1]";

    // WEB ELEMENTS

    public WebElement deliveryAndPaymentHeaderTitle() {
        return visibilityOfElementByXpath(DELIVERY_AND_PAYMENT_HEADER_TITLE);
    }

    public WebElement orderProcessSubTitle() {
        return visibilityOfElementByXpath(ORDER_PROCESS_SUB_TITLE);
    }

    //ACTIONS WITH ELEMENTS

    public String getNameDeliveryAndPaymentTitle() {
        return deliveryAndPaymentHeaderTitle().getText();
    }

    public boolean orderProcessSubTitleDysplayid() {
        return isElementDisplayed(orderProcessSubTitle());
    }

    public String getNameOrderProcessSubTitle() {
        return orderProcessSubTitle().getText();
    }

}
