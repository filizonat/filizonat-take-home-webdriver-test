package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Dropdown6 extends TestBase {



    @Test
    public void selectByIndexOption1() throws InterruptedException {

          driver.get("http://107.22.22.225:7080/dropdown");
        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select select=new Select(dropdown);
        Thread.sleep(5000);
        select.selectByIndex(1);
        Thread.sleep(5000);
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("Option 1"));

    }

    @Test
    public void selectByVisibleTestOption2() throws InterruptedException {

        driver.get("http://107.22.22.225:7080/dropdown");
        WebElement dropdown= driver.findElement(By.id("dropdown"));
        Select select=new Select(dropdown);
        Thread.sleep(5000);
        select.selectByVisibleText("Option 2");
        Assert.assertTrue(select.getFirstSelectedOption().getText().equals("Option 2"));







}}
