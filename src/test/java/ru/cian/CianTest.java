package ru.cian;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class CianTest extends WebSetting {
public void text() {

}
    @Test
    public void test1() {
        driver.get("https://www.cian.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Циан - база недвижимости в Московской области | Продажа, аренда квартир и другой недвижимости"));
    }
    @Test
    public void test2(){
        driver.get("https://www.cian.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Циан - база недвижимости в Московской области | Продажа, аренда квартир и другой недвижимости"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[text()='Войти']")).click();
        driver.findElement(By.xpath("//input[@class='_25d45facb5--input--ED6XL']")).sendKeys("89676809711");
    }
}
