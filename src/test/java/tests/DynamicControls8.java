package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class DynamicControls8 extends TestBase {

    @Test
    public void removeAndAddButton() {

        driver.get("http://107.22.22.225:7080/dynamic_controls");
        WebElement removeButton = driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement itsGoneMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertTrue(itsGoneMessage.isDisplayed());


        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add']"));
        addButton.click();
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        Assert.assertTrue(checkBox.isDisplayed());
    }

        @Test
        public void enableAndDisableButton(){

        driver.get("http://107.22.22.225:7080/dynamic_controls");
        WebElement enableButton=driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement itIsEnabledMessage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertTrue(itIsEnabledMessage.isDisplayed());

        WebElement disableButton=driver.findElement(By.xpath("//button[text()='Disable']"));
        disableButton.click();
        WebElement itIsDisabledMessage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertTrue(itIsDisabledMessage.isDisplayed());















}}
