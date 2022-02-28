package ru.cian;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class CianTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/andrejderugin/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.cian.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Циан - база недвижимости в Московской области | Продажа, аренда квартир и другой недвижимости"));
//        driver.quit();
    }
}
