package basesClass;

// Це головний батьківський клас, в якому будемо виконувать створеня інеціалізацію нашего веб драйвера,\
//який буде взаємодіїти з нашим браузером по типу користувача

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp() {
        WebDriver webDriver = new ChromeDriver();
        driver.set(webDriver);
    }

    public WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
        driver.remove();
    }

    public void openUrl(String url) {
        getDriver().get(url);
    }

}
