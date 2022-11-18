package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class NewTab17 extends TestBase {

    @Test
    public void newTab() {

        driver.get("http://107.22.22.225:7080/windows");
        WebElement clickHereButton = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHereButton.click();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("http://107.22.22.225:7080/windows/new");
        String tab2ActualTitle = driver.getTitle();
        String tab2ExpectedTitle = "New Window";
        Assert.assertEquals(tab2ActualTitle,tab2ExpectedTitle);


    }}