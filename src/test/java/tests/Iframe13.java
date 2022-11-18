package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Iframe13 extends TestBase {

    @Test
    public void iframe() throws InterruptedException {


        driver.get("http://107.22.22.225:7080/iframe");
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(5000);
        WebElement textBox= driver.findElement(By.xpath("//p"));
        textBox.clear();
        Thread.sleep(5000);
        textBox.sendKeys("This text box is inside the iframe");
        Assert.assertTrue(textBox.getText().equals("This text box is inside the iframe"));



    }}
