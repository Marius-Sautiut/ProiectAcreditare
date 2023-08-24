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

    @Test
    public void ChangePasswordSuccess() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickPassword();
        myAccountPages.clickPasswordFirstField();
        myAccountPages.writePasswordFirstField("Test@1234");
        myAccountPages.clickPasswordConfirmField();
        myAccountPages.writePasswordConfirmField("Test@1234");
        myAccountPages.clickContinueButton();
        myAccountPages.clickPassword();
        myAccountPages.clickPasswordFirstField();
        myAccountPages.writePasswordFirstField("Test@123");
        myAccountPages.clickPasswordConfirmField();
        myAccountPages.writePasswordConfirmField("Test@123");
        myAccountPages.clickContinueButton();


        WebElement PasswordUpdatedWithSuccess = driver.findElement(By.xpath("//*[@id=\"account-account\"]/div[1]"));
        String actualText = "Success: Your password has been successfully updated.";
        String expectedText = PasswordUpdatedWithSuccess.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");


    }

    @Test
    public void PasswordErrorForPasswordConfirmField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickPassword();
        myAccountPages.clickPasswordFirstField();
        myAccountPages.writePasswordFirstField("1234");
        myAccountPages.clickContinueButton();


        WebElement PasswordConfirmFieldError = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div"));
        String actualText = "Password confirmation does not match password!";
        String expectedText = PasswordConfirmFieldError.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");


    }


    @Test
    public void PasswordErrorForFirstPasswordField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        Thread.sleep(2000);
        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickPassword();
        myAccountPages.clickPasswordConfirmField();
        myAccountPages.writePasswordConfirmField("Test@123");
        myAccountPages.clickContinueButton();


        WebElement PasswordFieldError = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[1]/div/div"));
        String actualText = "Password must be between 4 and 20 characters!";
        String expectedText = PasswordFieldError.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

        WebElement PasswordConfirmFieldError = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div[2]/div/div"));
        String actualTextConfirmField = "Password confirmation does not match password!";
        String expectedTextConfirmField = PasswordConfirmFieldError.getText();
        Assert.assertEquals(actualTextConfirmField,expectedTextConfirmField, "The page text is not as expected");


    }

    @Test
    public void AddNewAddressBook() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickAddressBook();
        myAccountPages.clickNewAddress();
        myAccountPages.clickFieldFirstName();
        myAccountPages.writeFirstNameField("Marius");
        myAccountPages.clickFieldLastName();
        myAccountPages.writeLastNameField("Mircea");
        myAccountPages.clickAddress1();
        myAccountPages.writeAddress1("Str Sambetei, Nr 1, P1, apt 4");
        myAccountPages.clickCty();
        myAccountPages.writetCity("Oradea");
        myAccountPages.clickPostcode();
        myAccountPages.writePostcode("410202");
        myAccountPages.clickCountry();
        myAccountPages.selectCountryRomania();
        Thread.sleep(1000);
        myAccountPages.clickRegionState();
        Thread.sleep(1000);
        myAccountPages.selectBihor();
        myAccountPages.clickRadioButton();
        myAccountPages.clickContinueButton();
        Thread.sleep(2000);

        WebElement AddressSuccessfullyAdded = driver.findElement(By.xpath("//*[@id=\"account-address\"]/div[1]"));
        String actualText = "Your address has been successfully added";
        String expectedText = AddressSuccessfullyAdded.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void AddNewAddressBookFormFieldErrorForFirstName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickAddressBook();
        myAccountPages.clickNewAddress();
        myAccountPages.clickFieldLastName();
        myAccountPages.writeLastNameField("Mircea");
        myAccountPages.clickAddress1();
        myAccountPages.writeAddress1("Str Sambetei, Nr 1, P1, apt 4");
        myAccountPages.clickCty();
        myAccountPages.writetCity("Oradea");
        myAccountPages.clickPostcode();
        myAccountPages.writePostcode("410202");
        myAccountPages.clickCountry();
        myAccountPages.selectCountryRomania();
        Thread.sleep(1000);
        myAccountPages.clickRegionState();
        Thread.sleep(1000);
        myAccountPages.selectBihor();
        myAccountPages.clickRadioButton();
        myAccountPages.clickContinueButton();
        Thread.sleep(2000);

        WebElement CheckFirstNameErrorField = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[1]/div/div"));
        String actualText = "First Name must be between 1 and 32 characters!";
        String expectedText = CheckFirstNameErrorField.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void AddNewAddressBookFormFieldErrorForLasttName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickAddressBook();
        myAccountPages.clickNewAddress();
        myAccountPages.clickFieldFirstName();
        myAccountPages.writeFirstNameField("Marius");
        myAccountPages.clickAddress1();
        myAccountPages.writeAddress1("Str Sambetei, Nr 1, P1, apt 4");
        myAccountPages.clickCty();
        myAccountPages.writetCity("Oradea");
        myAccountPages.clickPostcode();
        myAccountPages.writePostcode("410202");
        myAccountPages.clickCountry();
        myAccountPages.selectCountryRomania();
        Thread.sleep(1000);
        myAccountPages.clickRegionState();
        Thread.sleep(1000);
        myAccountPages.selectBihor();
        myAccountPages.clickRadioButton();
        myAccountPages.clickContinueButton();
        Thread.sleep(2000);

        WebElement CheckLastNameErrorField = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[2]/div/div"));
        String actualText = "Last Name must be between 1 and 32 characters!";
        String expectedText = CheckLastNameErrorField.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void AddNewAddressBookFormFieldErrorForAddress1() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickAddressBook();
        myAccountPages.clickNewAddress();
        myAccountPages.clickFieldFirstName();
        myAccountPages.writeFirstNameField("Marius");
        myAccountPages.clickFieldLastName();
        myAccountPages.writeLastNameField("Mircea");
        myAccountPages.clickCty();
        myAccountPages.writetCity("Oradea");
        myAccountPages.clickPostcode();
        myAccountPages.writePostcode("410202");
        myAccountPages.clickCountry();
        myAccountPages.selectCountryRomania();
        Thread.sleep(1000);
        myAccountPages.clickRegionState();
        Thread.sleep(1000);
        myAccountPages.selectBihor();
        myAccountPages.clickRadioButton();
        myAccountPages.clickContinueButton();
        Thread.sleep(2000);

        WebElement CheckAddress1ErrorField = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[4]/div/div"));
        String actualText = "Address must be between 3 and 128 characters!";
        String expectedText = CheckAddress1ErrorField.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void AddNewAddressBookFormFieldErrorForCity() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickAddressBook();
        myAccountPages.clickNewAddress();
        myAccountPages.clickFieldFirstName();
        myAccountPages.writeFirstNameField("Marius");
        myAccountPages.clickFieldLastName();
        myAccountPages.writeLastNameField("Mircea");
        myAccountPages.clickAddress1();
        myAccountPages.writeAddress1("Str Sambetei, Nr 1, P1, apt 4");
        myAccountPages.clickPostcode();
        myAccountPages.writePostcode("410202");
        myAccountPages.clickCountry();
        myAccountPages.selectCountryRomania();
        Thread.sleep(1000);
        myAccountPages.clickRegionState();
        Thread.sleep(1000);
        myAccountPages.selectBihor();
        myAccountPages.clickRadioButton();
        myAccountPages.clickContinueButton();
        Thread.sleep(2000);

        WebElement CheckCityErrorField = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[6]/div/div"));
        String actualText = "City must be between 2 and 128 characters!";
        String expectedText = CheckCityErrorField.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

        @Test
        public void CheckCountryErrorField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickAddressBook();
        myAccountPages.clickNewAddress();
        myAccountPages.clickFieldFirstName();
        myAccountPages.writeFirstNameField("Marius");
        myAccountPages.clickFieldLastName();
        myAccountPages.writeLastNameField("Mircea");
        myAccountPages.clickAddress1();
        myAccountPages.writeAddress1("Str Sambetei, Nr 1, P1, apt 4");
        myAccountPages.clickCty();
        myAccountPages.writetCity("Oradea");
        myAccountPages.clickPostcode();
        myAccountPages.writePostcode("410202");
        myAccountPages.clickCountry();
        Thread.sleep(2000);
        myAccountPages.pleaseSelectCountry();
        Thread.sleep(1000);
        myAccountPages.clickRadioButton();
        myAccountPages.clickContinueButton();
        Thread.sleep(2000);

        WebElement CheckCountryErrorField = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[8]/div/div"));
        String actualText = "Please select a country!";
        String expectedText = CheckCountryErrorField.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }

    @Test
    public void CheckRegionStateErrorField() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        myAccountPages.clickAddressBook();
        myAccountPages.clickNewAddress();
        myAccountPages.clickFieldFirstName();
        myAccountPages.writeFirstNameField("Marius");
        myAccountPages.clickFieldLastName();
        myAccountPages.writeLastNameField("Mircea");
        myAccountPages.clickAddress1();
        myAccountPages.writeAddress1("Str Sambetei, Nr 1, P1, apt 4");
        myAccountPages.clickCty();
        myAccountPages.writetCity("Oradea");
        myAccountPages.clickPostcode();
        myAccountPages.writePostcode("410202");
        myAccountPages.clickCountry();
        myAccountPages.selectCountryRomania();
        Thread.sleep(2000);
        myAccountPages.clickRadioButton();
        myAccountPages.clickContinueButton();
        Thread.sleep(2000);

        WebElement CheckRegionStateErrorField = driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset/div[9]/div/div"));
        String actualText = "Please select a region / state!";
        String expectedText = CheckRegionStateErrorField.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }


}
