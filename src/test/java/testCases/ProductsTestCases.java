package testCases;

import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.ProductsPage;

public class ProductsTestCases extends BasePage {

    private ProductsPage productsPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        productsPage = new ProductsPage(driver);
    }


}
