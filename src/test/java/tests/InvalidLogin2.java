package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class InvalidLogin2 {

    LoginPage loginPage=new LoginPage();


    @Test
    public void invalidlogin(){

        Driver.getDriver().get(ConfigReader.getProperty("login_url"));
        loginPage.username.sendKeys("Filiz");
        loginPage.password.sendKeys("12345");
        loginPage.loginButton.click();
        Assert.assertTrue(loginPage.loginunsuccessful.isDisplayed());
        Driver.closeDriver();






    }}
