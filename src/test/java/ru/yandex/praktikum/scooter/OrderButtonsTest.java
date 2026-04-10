package ru.yandex.praktikum.scooter;

import org.junit.Test;
import ru.yandex.praktikum.scooter.pages.MainPage;
import ru.yandex.praktikum.scooter.pages.OrderPage;

import static org.junit.Assert.assertTrue;

public class OrderButtonsTest extends BaseTest {

    @Test
    public void checkOrderUpButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButtonOrderUp();
        OrderPage orderPage = new OrderPage(driver);
        assertTrue(orderPage.checkOpenOrderPage());
    }

    @Test
    public void checkOrderDownButton() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickButtonOrderDown();
        OrderPage orderPage = new OrderPage(driver);
        assertTrue(orderPage.checkOpenOrderPage());
    }
}