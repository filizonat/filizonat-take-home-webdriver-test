package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class DragAndDrop5 extends TestBase {

    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("http://107.22.22.225:7080/drag_and_drop");
        WebElement source= driver.findElement(By.xpath("//*[@id='column-a']"));
        WebElement target= driver.findElement(By.xpath("//*[@id='column-b']"));
        Actions action=new Actions(driver);
        Action dragAndDrop = action.clickAndHold(source)
                .moveToElement(target)
                .release(target)
                .build();
        dragAndDrop.perform();
        Thread.sleep(3000);
  //      Assert.assertTrue(source.getText().contains("B"));
    }


}
