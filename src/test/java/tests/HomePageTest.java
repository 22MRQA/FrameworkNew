package tests;

import basesClass.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class HomePageTest extends TestInit {

    public String alloUrl = "https://allo.ua/";

    @Test
    public void checkCatalogButton() {

        HomePage homePage = new HomePage(driver);

        openUrl(alloUrl);

        Assert.assertTrue(homePage.catalogButtonDisplyaed());

    }

    @Test
    public void checkCatalogGamerGoodsButton() {

        HomePage homePage = new HomePage(driver);
        ProductsForGamersPage productsForGamersPage = new ProductsForGamersPage(driver);

        openUrl(alloUrl);

        homePage.clickCatalogButton();
        Assert.assertTrue(homePage.catalogGamerButtonDisplyaed());

        homePage.clickCatalogGamerButton();
        Assert.assertTrue(productsForGamersPage.firstGameConsolesButtonDisplayed());

        String nameFirstGameConsolesButton = productsForGamersPage.getNameFirstGameConsolesButton();
        Assert.assertTrue(nameFirstGameConsolesButton.contains("Ігрові консолі"));

        // Додати 1 перевірку на сторінці яка відкрилася очікуваний елемент унікальний тільки для цієї сторінки відображаєтся на екрані
        // Додати 2-гу перевірку що 1 із елементів на сторінці містить очікуваний текст

    }

    @Test
    public void productNameShouldMatchInSearchResultsAndProductPageForAirPods3() {

        HomePage homePage = new HomePage(driver);
        SearchResultAirPodsPage searchResultAirPodsPagePage = new SearchResultAirPodsPage(driver);
        GoodsPage goodsPage = new GoodsPage(driver);

        String airPods = "AirPods 3";

        openUrl(alloUrl);

        Assert.assertTrue(homePage.siteLogoDisplayed());

        homePage.enterValueSearchInput(airPods);
        homePage.clickSearchButton();

        String actualNameFirstProductCard = searchResultAirPodsPagePage.getNameFirstProductCardAirPods();
        Assert.assertTrue(actualNameFirstProductCard.contains(airPods));

        searchResultAirPodsPagePage.clickFirstProductCardAirPods();

        String expectedProductTitle = goodsPage.getNameProductHeaderTitle();
        Assert.assertEquals(actualNameFirstProductCard, expectedProductTitle);

    }

    @Test
    public void verifyDeliveryAndPaymentPageViaBuyersMenu() {

        HomePage homePage = new HomePage(driver);
        DeliveryAndPaymentPage deliveryAndPaymentPage = new DeliveryAndPaymentPage(driver);

        String headerDeliverAndPayment = "Доставка і оплата";
        String titleOrderProcess = "Як оформити замовлення?";

        openUrl(alloUrl);

        Assert.assertTrue(homePage.buyerMenuButtonDisplayed());

        homePage.clickBuyerMenuButton();
        Assert.assertTrue(homePage.buyerDropDownMenuDisplayed());

        Assert.assertTrue(homePage.deliveryAndPaymentButtonDispayed());
        homePage.clickDeliveryAndPaymentButton();

        String actualTextDeliveryAndPaymentTitle = deliveryAndPaymentPage.getNameDeliveryAndPaymentTitle();
        Assert.assertTrue(actualTextDeliveryAndPaymentTitle.contains(headerDeliverAndPayment));
        Assert.assertTrue(deliveryAndPaymentPage.orderProcessSubTitleDysplayid());

        String actualTextOrderProcess = deliveryAndPaymentPage.getNameOrderProcessSubTitle();
        Assert.assertTrue(actualTextOrderProcess.contains(titleOrderProcess));

        System.out.println(actualTextOrderProcess);

    }

}