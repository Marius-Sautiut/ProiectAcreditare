package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTestCases extends BasePage {

    private CheckoutPage checkoutPage;


    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkoutPage = new CheckoutPage(driver);
    }

        @Test
    public void checkIfCheckoutCartIsEmpty() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        Actions action = new Actions(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        homePage.clickHomeButton();
        homePage.clickCategoryDesktop();
        //Hover over the product
        WebElement ele = driver.findElement(By.id("mz-product-grid-image-28-212408"));
        action.moveToElement(ele).perform();

        productsPage.clickAddProductHtcTouchHdToCart();
        Thread.sleep(12000);
        productsPage.clickCart();
//        Thread.sleep(8000);
        Thread.sleep(5000);
        productsPage.clickCheckoutButton();
        Thread.sleep(2000);
        checkoutPage.clickRemoveItem();
        Thread.sleep(5000);

        WebElement MyCheckoutValue = driver.findElement(By.xpath("//*[@id=\"content\"]/p"));
        String expectedText = "Your shopping cart is empty!";
        String actualtext = MyCheckoutValue.getText();
        Assert.assertEquals(actualtext, expectedText, "The page text is not as expected");

    }

    @Test
    public void clickAddAndCheckIfIsAddedToCheckout() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        Actions action = new Actions(driver);

        homePage.clickMyAccount();
        loginPage.writeEmailField("mariussautiut@yahoo.com");
        loginPage.writePasswordField("Test@123");
        loginPage.clickLoginButton();
        homePage.clickHomeButton();
        homePage.clickCategoryDesktop();
        //Hover over the product
        WebElement ele = driver.findElement(By.id("mz-product-grid-image-28-212408"));
        action.moveToElement(ele).perform();

        productsPage.clickAddProductHtcTouchHdToCart();
        Thread.sleep(12000);
        productsPage.clickCart();
//        Thread.sleep(8000);
        Thread.sleep(5000);
        productsPage.clickCheckoutButton();

        WebElement ProductName = driver.findElement(By.linkText("HTC Touch HD"));
        String actualText = "HTC Touch HD";
        String expectedText = ProductName.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");

    }


}
