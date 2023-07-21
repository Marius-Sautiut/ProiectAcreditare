package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPages;

public class MyAccountTestCases extends BasePage {

    private MyAccountPages myAccountPages;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        myAccountPages = new MyAccountPages(driver);
    }

    @Test
    public void loginWithInvalidEmailCorrectPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.co");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();

        WebElement WarningValue = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]"));
        String expectedText = "Warning: Your account has exceeded allowed number of login attempts. Please try again in 1 hour.";
        String actualText = WarningValue.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void loginWithCorrectEmailInvalidPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@12");
        loginPage.clickLoginButton();

        WebElement WarningValue = driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]"));
        String expectedText = "Warning: No match for E-Mail Address and/or Password.";
        String actualText = WarningValue.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void loginWithValidCredentials() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();

        WebElement WarningValue = driver.findElement(By.xpath("//*[@id=\"account-account\"]/nav/ol/li[2]"));
        String expectedText = "Account";
        String actualText = WarningValue.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }



}
