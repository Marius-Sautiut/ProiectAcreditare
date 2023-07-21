package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;


public class HomeTestCases extends BasePage {

    private HomePage homePage;


    @BeforeMethod
    public void setUp(){
        super.setUp();
        homePage = new HomePage(driver);
    }


    @Test
    public void clickCategoryComponentsAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickCategoryComponents();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Components";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryCamerasAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clikcCategoryCameras();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Cameras";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryPhoneTablesIpodAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickPhoneTablesIpods();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Tablets";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategorySoftwareAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clikcSoftware();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Software";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryMP3PlayersAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickMP3Player();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "MP3 Players";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryLaptopsAndNotebooksAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickLaptopsAndNotebooks();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Laptops";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryDesktopsAndMonitorsAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickDesktopsAndMonitor();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Monitors";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryPrintersAndScannersAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickPrintersAndScanners();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Printers";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryMiceAndTrackballsAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickMiceAndTrackballs();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Mice and Trackballs";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryFashionAndAccessoriesAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickMiceAndTrackballs();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Mice and Trackballs";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryWebCamerasAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        homePage.clickWebCameras();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Web Cameras";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }



}
