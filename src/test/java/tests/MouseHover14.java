package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class MouseHover14 extends TestBase {

    //I did not have enough time so I automated only the first image

    @Test
    public void mouseHover() {


        driver.get("http://107.22.22.225:7080/hovers");
        WebElement image1= driver.findElement(By.xpath("//img[@src='/img/avatar-blank.jpg'][1]"));
        Actions actions=new Actions(driver);
        actions.moveToElement(image1).perform();
        WebElement username1= driver.findElement(By.xpath("//h5"));
        Assert.assertTrue(username1.isDisplayed());




    }}
