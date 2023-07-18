package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTestCases extends BasePage {

    private CheckoutPage checkoutPage;


    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkoutPage = new CheckoutPage(driver);
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
        productsPage.clickCartt();
//        Thread.sleep(8000);
        productsPage.clickCheckoutButton();


    }


}
