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
        Thread.sleep(2000);
        homePage.clickCategoryComponents();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Components";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryCamerasAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clikcCategoryCameras();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Cameras";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryPhoneTablesIpodAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickPhoneTablesIpods();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Tablets";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategorySoftwareAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clikcSoftware();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Software";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryMP3PlayersAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickMP3Player();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "MP3 Players";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryLaptopsAndNotebooksAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickLaptopsAndNotebooks();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Laptops";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryDesktopsAndMonitorsAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickDesktopsAndMonitor();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Monitors";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryPrintersAndScannersAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickPrintersAndScanners();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Printers";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryMiceAndTrackballsAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickMiceAndTrackballs();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Mice and Trackballs";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryFashionAndAccessoriesAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickFashionAndAccessories();
        homePage.clickShopByCategory();
        Thread.sleep(2000);

        WebElement getCheckValueText = driver.findElement(By.linkText("Fashion and Accessories"));
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText, "Fashion and Accessories");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryBeautyAndSaloonAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickBeautyAndSaloon();
        homePage.clickShopByCategory();
        Thread.sleep(2000);

        WebElement getCheckValueText = driver.findElement(By.linkText("Beauty and Saloon"));
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText, "Beauty and Saloon");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryAutopartsAndAccessoriesAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickAutopartsAndAccessories();
        homePage.clickShopByCategory();
        Thread.sleep(2000);

        WebElement getCheckValueText = driver.findElement(By.linkText("Autoparts and Accessories"));
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText, "Autoparts and Accessories");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryWashingMachineAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickWashingMachine();
        homePage.clickShopByCategory();
        Thread.sleep(2000);

        WebElement getCheckValueText = driver.findElement(By.linkText("Washing machine"));
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText, "Washing machine");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryGamingConsolesAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickGamingConsoles();
        homePage.clickShopByCategory();
        Thread.sleep(2000);

        WebElement getCheckValueText = driver.findElement(By.linkText("Gaming consoles"));
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText, "Gaming consoles");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryAirConditionerAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickAirConditioner();
        homePage.clickShopByCategory();
        Thread.sleep(2000);

        WebElement getCheckValueText = driver.findElement(By.linkText("Air conditioner"));
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText, "Air conditioner");
        Thread.sleep(2000);
    }

    @Test
    public void clickCategoryWebCamerasAndCheckPageTitle() throws InterruptedException {

        homePage.clickShopByCategory();
        Thread.sleep(2000);
        homePage.clickWebCameras();

        WebElement getCheckValueText = driver.findElement(By.id("entry_212392"));
        String expectedText = "Web Cameras";
        String actualText = getCheckValueText.getText();
        Assert.assertEquals(actualText,expectedText, "The page text is not as expected");
        Thread.sleep(2000);
    }



}
