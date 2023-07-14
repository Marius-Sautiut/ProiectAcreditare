package testCases;

import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.CheckoutPage;
import pages.ProductsPage;

import java.util.Base64;

public class ProductsTestCases extends BasePage {

    private ProductsPage productsPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        productsPage = new ProductsPage(driver);
    }


}
