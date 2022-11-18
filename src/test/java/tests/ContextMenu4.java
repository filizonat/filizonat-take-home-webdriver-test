package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class ContextMenu4 extends TestBase {
    @Test
    public void contextClick(){
        driver.get("http://107.22.22.225:7080/context_menu");
        WebElement box=driver.findElement(By.xpath("//div[@id='hot-spot']"));
        box.click();
        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();
        String actualAlertText=driver.switchTo().alert().getText();
        String exepectedText="You selected a context menu";
        Assert.assertEquals(actualAlertText,exepectedText);

    }
}
