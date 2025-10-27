package basesClass;

// Це головний батьківський клас, в якому будемо виконувать створеня інеціалізацію нашего веб драйвера,\
//який буде взаємодіїти з нашим браузером по типу користувача

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp() {

        ChromeOptions options = new ChromeOptions();

        // 🧠 Додаємо аргументи, щоб браузер коректно працював у CI (GitHub Actions)
        options.addArguments("--headless=new");            // запускає браузер без UI
        options.addArguments("--no-sandbox");              // потрібне для Linux runner'а
        options.addArguments("--disable-dev-shm-usage");   // уникає обмежень пам’яті
        options.addArguments("--disable-gpu");             // вимикає GPU-рендеринг
        options.addArguments("--window-size=1920,1080");   // фіксований розмір екрана

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
