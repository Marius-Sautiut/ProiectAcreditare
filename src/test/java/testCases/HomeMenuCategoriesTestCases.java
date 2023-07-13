package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomeMenuCategoriesPage;

public class HomeMenuCategoriesTestCases extends BasePage {

    private HomeMenuCategoriesPage homeMenuCategoriesPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        homeMenuCategoriesPage = new HomeMenuCategoriesPage(driver);
    }

    @Test
    public void clickCategoryComponentsAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clickCategoryComponents();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Components";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryCamerasAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clikcCategoryCameras();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Cameras";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryPhoneTablesIpodAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clickPhoneTablesIpods();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Tablets";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategorySoftwareAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clikcSoftware();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Software";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryMP3PlayersAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clickMP3Player();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "MP3 Players";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryLaptopsAndNotebooksAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clickLaptopsAndNotebooks();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Laptops";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryDesktopsAndMonitorsAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clickDesktopsAndMonitor();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Monitors";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryPrintersAndScannersAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clickPrintersAndScanners();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Printers";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }

    @Test
    public void clickCategoryPrintersAndScannersAndCheckPageTitle() throws InterruptedException {

        homeMenuCategoriesPage.clickShopByCategory();
        homeMenuCategoriesPage.clickPrintersAndScanners();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Printers";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
    }







}
