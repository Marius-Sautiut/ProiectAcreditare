package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCases extends BasePage {

    private LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void loginSuccess() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();

        WebElement AccountLogout = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/h2"));
        String actualText = "My Account";
        String expectedText = AccountLogout.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void loginWithIncorrectEmailCorrectPassword() throws InterruptedException {
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
    public void loginWithCorrectEmailIncorrectPassword() throws InterruptedException {
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
    public void logoutSuccess() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        loginPage.clickLogoutLink();

        WebElement AccountLogout = driver.findElement(By.cssSelector("#content .my-3"));
        String actualText = "Account Logout";
        String expectedText = AccountLogout.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

}
