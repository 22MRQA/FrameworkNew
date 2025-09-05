package tests;

import basesClass.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductsForGamersPage;

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
        Assert.assertTrue(productsForGamersPage.firstGameCosolesButtonDisplyaed());

        String nameFirstGameConsolesButton = productsForGamersPage.getNameFirstGameCosolesButton();
        Assert.assertTrue(nameFirstGameConsolesButton.contains("Ігрові консолі"));

        // Додати 1 перевірку на сторінці яка відкрилася очікуваний елемент унікальний тільки для цієї сторінки відображаєтся на екрані
        // Додати 2-гу перевірку що 1 із елементів на сторінці містить очікуваний текст

    }

}