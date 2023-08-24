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
    @Test
    public void verifyFieldErrorsForFirstNameFromEditAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickEditAccount();
        myAccountPages.clickFieldFirstName();
        myAccountPages.clearFieldFirstName();
        myAccountPages.clickContinueButton();

        WebElement FieldFirstNameError = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[1]/div/div"));
        String expectedText = "First Name must be between 1 and 32 characters!";
        String actualText = FieldFirstNameError.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void verifyFieldErrorsForLastNameFromEditAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickEditAccount();
        myAccountPages.clickFieldLastName();
        myAccountPages.clearFieldLastName();
        myAccountPages.clickContinueButton();

        WebElement FieldLastNameError = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[2]/div/div"));
        String expectedLastNameErrorText = "Last Name must be between 1 and 32 characters!";
        String actualLastNameErrorText = FieldLastNameError.getText();
        Assert.assertEquals(actualLastNameErrorText,expectedLastNameErrorText, "The page text is not as expected");

    }

    @Test
    public void verifyFieldErrorsForFieldEmailFromEditAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickEditAccount();
        myAccountPages.clickFieldEmail();
        myAccountPages.clearFieldEmail();
        myAccountPages.clickContinueButton();

        WebElement FieldEmailError = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[3]/div/div"));
        String expectedEmailErrorText = "E-Mail Address does not appear to be valid!";
        String actualEmailErrorText = FieldEmailError.getText();
        Assert.assertEquals(actualEmailErrorText,expectedEmailErrorText, "The page text is not as expected");

    }

    @Test
    public void verifyFieldErrorsForFieldTelephoneFromEditAccount() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickEditAccount();
        myAccountPages.clickFieldTelephone();
        myAccountPages.clearFieldTelephone();
        myAccountPages.clickContinueButton();

        WebElement FieldTelephoneError = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[4]/div/div"));
        String expectedTelephoneErrorText = "Telephone must be between 3 and 32 characters!";
        String actualTelephoneErorText = FieldTelephoneError.getText();
        Assert.assertEquals(actualTelephoneErorText,expectedTelephoneErrorText, "The page text is not as expected");


    }


    @Test
    public void editAccountwithSuccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickEditAccount();
        myAccountPages.clickFieldFirstName();
        myAccountPages.clearFieldFirstName();
        myAccountPages.writeFirstNameField("mariuss");

        myAccountPages.clickFieldLastName();
        myAccountPages.clearFieldLastName();
        myAccountPages.writeLastNameField("sautiut");

        myAccountPages.clickFieldTelephone();
        myAccountPages.clearFieldTelephone();
        myAccountPages.writeTelephoneField("0777555444");
        myAccountPages.clickContinueButton();

        WebElement AccountUpdatedWithSuccess = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]"));
        String actualText = "Success: Your account has been successfully updated.";
        String expectedText = AccountUpdatedWithSuccess.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");


    }


}
