package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class JSError16 extends TestBase {

    @Test
    public void jsError(){
        driver.get("http://107.22.22.225:7080/javascript_error");
        String errorMessage= driver.findElement(By.xpath("//p")).getText();
        String expectedMessage=" Cannot read property 'xyz' of undefined.";
        Assert.assertTrue(errorMessage.contains(expectedMessage));

        //It will fail since the message on the screen is different

    }



}
