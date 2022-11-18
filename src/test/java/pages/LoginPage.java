package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

   @FindBy(xpath="//button[@class='radius']")
    public WebElement loginButton;

    @FindBy(xpath="//h2")
    public WebElement loginsuccesful;

    @FindBy(id="flash")
    public WebElement loginunsuccessful ;



}



