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
    public void login() throws InterruptedException {
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
    public void logout() throws InterruptedException {
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
