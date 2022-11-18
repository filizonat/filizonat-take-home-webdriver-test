package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class JSAlerts15 extends TestBase {


    //15. JavaScript Alerts
    //    * Test Clicks on JS Alert Button.
    //    + Test asserts alert message.
    //    - Test clicks on JS confirm Button and clicks ok on alert.
    //    * Test asserts the alert message.
    //    + Test clicks on JS Prompt Button and types a message on Prompt.
    //    - Test asserts that the alert message contains the typed message.

     //In the first step in the requirements above, you wanted only clicking the alert button and verifying the message ,
    // not clicking the ok button, so I did not go on with clicking the ok button.

    @Test
    public void alertMessage() throws InterruptedException {
        driver.get("http://107.22.22.225:7080/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(5000);
        String actualAlertText=driver.switchTo().alert().getText();
        String expectedAlertText="I am a JS Alert";
        Assert.assertEquals(expectedAlertText,actualAlertText);

    }


    @Test
    public void acceptAlert() throws InterruptedException {
        driver.get("http://107.22.22.225:7080/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        Thread.sleep(5000);
//        String actualAlertText = driver.switchTo().alert().getText();
//        String expectedAlertText = "I am a JS Confirm";
//        Assert.assertEquals(expectedAlertText,actualAlertText);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        String expectedResultText="You clicked: Ok";
        String actualResultText=driver.findElement(By.xpath("//p[@id='result']")).getText();
        Assert.assertEquals(expectedResultText,actualResultText);

    }

    @Test
    public void sendKeysAlert() throws InterruptedException {
        driver.get("http://107.22.22.225:7080/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Thread.sleep(5000);
//        String actualAlertText = driver.switchTo().alert().getText();
//        String expectedAlertText = "I am a JS prompt";
//        Assert.assertEquals(expectedAlertText,actualAlertText);
        driver.switchTo().alert().sendKeys("Filiz Onat");
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        String actualResultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedResultText = "You entered: Filiz Onat";
        Assert.assertEquals(expectedResultText,actualResultText);

    }





}
