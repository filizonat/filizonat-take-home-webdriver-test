package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class FloatingMenu12 extends TestBase {

    @Test
    public void floatingMenu() throws InterruptedException {

        driver.get("http://107.22.22.225:7080/floating_menu");
        WebElement floatingMenu= driver.findElement(By.id("menu"));
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        Assert.assertTrue(floatingMenu.isDisplayed());



    }


}
