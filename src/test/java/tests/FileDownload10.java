package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownload10 extends TestBase {

    @Test
    public void fileDownload() throws InterruptedException {

        driver.get("http://107.22.22.225:7080/download");
        driver.findElement(By.linkText("some-file.txt")).click();
        Thread.sleep(3000);
        // implicit wait can not solve it because it is related to desktop application
        String path=System.getProperty("user.home")+"/Downloads/some-file.txt";
        boolean isExist= Files.exists(Paths.get(path));
        Assert.assertTrue(isExist);


    }




}
