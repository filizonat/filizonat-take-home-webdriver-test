package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class FileUpload11 extends TestBase {

    @Test
    public void fileUpload() throws InterruptedException {

        driver.get("http://107.22.22.225:7080/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        String filePath ="/Users/Owner/Desktop/pictureupload.jpeg";
        chooseFile.sendKeys(filePath);
        WebElement upload = driver.findElement(By.id("file-submit"));
        upload.click();
        String uploadedMessage = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertEquals("File Uploaded!",uploadedMessage);






}}