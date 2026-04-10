package ru.yandex.praktikum.scooter;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.scooter.pages.MainPage;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setup() {
        driver = WebDriverFactory.getWebDriver(System.getProperty("browser", "chrome"));
        driver.get(MainPage.BASE_URL);
    }

    @After
    public void browserClose() {
        if (driver != null) {
            driver.quit();
        }
    }
}