package testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class HomeTestCases extends BasePage {

    private HomePage homePage;


    @BeforeMethod
    public void setUp(){
        super.setUp();
        homePage = new HomePage(driver);
    }
//    @BeforeMethod
//    public void setUp(){
//        super.setUp();
//        loginPage = new LoginPage(driver);
//    }

//    @Test
//    public void clickCategoryComponentsAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickCategoryComponents();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Components";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryCamerasAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clikcCategoryCameras();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Cameras";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryPhoneTablesIpodAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickPhoneTablesIpods();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Tablets";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }

//    @Test
//    public void clickCategorySoftwareAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clikcSoftware();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Software";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryMP3PlayersAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickMP3Player();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "MP3 Players";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryLaptopsAndNotebooksAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickLaptopsAndNotebooks();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Laptops";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryDesktopsAndMonitorsAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickDesktopsAndMonitor();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Monitors";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryPrintersAndScannersAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickPrintersAndScanners();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Printers";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryMiceAndTrackballsAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickMiceAndTrackballs();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Mice and Trackballs";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryFashionAndAccessoriesAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickMiceAndTrackballs();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Mice and Trackballs";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }
//
//    @Test
//    public void clickCategoryWebCamerasAndCheckPageTitle() throws InterruptedException {
//
//        homeMenuCategoriesPage.clickShopByCategory();
//        homeMenuCategoriesPage.clickWebCameras();
//
//        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
//        String expectedText = "Web Cameras";
//        String actualText = getCheckValueText.getText();
//        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
//    }






}
