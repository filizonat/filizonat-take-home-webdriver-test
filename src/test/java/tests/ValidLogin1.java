package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ValidLogin1 {

  LoginPage loginPage=new LoginPage();


    @Test
    public void validlogin(){

            Driver.getDriver().get(ConfigReader.getProperty("login_url"));
            loginPage.username.sendKeys("tomsmith");
            loginPage.password.sendKeys("SuperSecretPassword!");
            loginPage.loginButton.click();
            Assert.assertTrue(loginPage.loginsuccesful.isDisplayed());
            Driver.closeDriver();



















}}
