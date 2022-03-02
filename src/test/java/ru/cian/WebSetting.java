package ru.cian;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSetting {
    public ChromeDriver driver;

    @Before
    public void setting() {
        System.setProperty("webdriver.chrome.driver", "/Users/andrejderugin/Downloads/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Start");
    }

//    @After
//    public void exit() {
//        driver.quit();
//        System.out.println("Exit");
//    }
}
