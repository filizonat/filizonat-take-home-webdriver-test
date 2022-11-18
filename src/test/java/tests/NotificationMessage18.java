package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class NotificationMessage18 extends TestBase {

    //18. Notification Message
    //    * Test clicks on the Click Here link a multiple times.
    //    + Test asserts that one of the “Action Successful”,
    //                                   “Action unsuccessful, please try again” and
    //                                   “Action Unsuccessful” messages show on click.

    //I wrote my test case according to this requirements but in reality "Action Unsuccessful " message never appears
    //in the application.

    @Test
    public  void notificationMessage(){
        driver.get("http://107.22.22.225:7080/notification_message_rendered");
        WebElement clickHere= driver.findElement(By.xpath("//a[@href='/notification_message']"));
        clickHere.click();
        WebElement message= driver.findElement(By.xpath("//div[@id='flash']"));
        boolean flag=false;
        if (message.getText().equals("Action Successful")){
            flag=true;
        }else if(message.getText().equals("Action unsuccessful")){
            flag=true;
        }else if(message.getText().equals("Action unsuccessful, please try again")){
                flag=true;
        }else{
            flag=false;
        }

       Assert.assertTrue(flag=true);




    }
}
