package ru.cian;
import org.junit.Assert;
import org.junit.Test;

public class CianTest extends WebSetting {

    @Test
    public void firstTest() {
        driver.get("https://www.cian.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Циан - база недвижимости в Московской области | Продажа, аренда квартир и другой недвижимости"));
    }
}
