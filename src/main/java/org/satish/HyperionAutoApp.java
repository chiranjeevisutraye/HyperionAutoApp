package org.satish;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @Author Chiranjeevi Sutraye on 12/31/2020
 */


public class HyperionAutoApp {
    private WebDriver driver = null;
    public void initialize() {
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", "C:\\cdriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
    }

    public void actions() throws InterruptedException {
        driver.get("https://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Oracle Hyperion");
        searchBox.sendKeys(Keys.ENTER);
        String source = driver.getPageSource();
        driver.wait(2);
        driver.close();
    }
    public static void main( String[] args ) throws InterruptedException {
        HyperionAutoApp app = new HyperionAutoApp();
        app.initialize();
        app.actions();
    }
}
