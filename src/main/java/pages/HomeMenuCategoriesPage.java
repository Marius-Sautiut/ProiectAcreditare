package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeMenuCategoriesPage extends BasePage{

    public HomeMenuCategoriesPage(WebDriver driver) {super(driver);}

    By ShopByCategory = By.id("entry_217832");
    By CategoryComponents = By.cssSelector("ul.navbar-nav li a");
    By CategoryCameras = By.cssSelector("ul.navbar-nav li:nth-child(2) a");
    By PhoneTabletsIpod = By.cssSelector("ul.navbar-nav li:nth-child(3) a");
    By Software = By.cssSelector("ul.navbar-nav li:nth-child(4) a");
    By MP3Players = By.cssSelector("ul.navbar-nav li:nth-child(5) a");
    By LaptopsAndNotebooks = By.cssSelector("ul.navbar-nav li:nth-child(6) a");
    By DesktopsAndMonitor = By.cssSelector("ul.navbar-nav li:nth-child(7) a");
    By PrintersAndScanners = By.cssSelector("ul.navbar-nav li:nth-child(8) a");
    By MiceAndTrackballs = By.cssSelector("ul.navbar-nav li:nth-child(9) a");
    By FashionAndAccessories = By.cssSelector("ul.navbar-nav li:nth-child(10) a");
    By BeautyAndSaloon = By.cssSelector("ul.navbar-nav li:nth-child(11) a");
    By AutopartsAndAccessories = By.cssSelector("ul.navbar-nav li:nth-child(12) a");
    By WashingMachine = By.cssSelector("ul.navbar-nav li:nth-child(13) a");
    By GamingConsoles = By.cssSelector("ul.navbar-nav li:nth-child(14) a");
    By AirConditioner = By.cssSelector("ul.navbar-nav li:nth-child(15) a");
    By WebCameras = By.cssSelector("ul.navbar-nav li:nth-child(16) a");



    public void clickShopByCategory() { driver.findElement(ShopByCategory).click(); }
    public void clickCategoryComponents() { driver.findElement(CategoryComponents).click(); }
    public void clikcCategoryCameras() { driver.findElement(CategoryCameras).click(); }
    public void clikcSoftware() { driver.findElement(Software).click(); }
    public void clickPhoneTablesIpods() { driver.findElement(PhoneTabletsIpod).click();}
    public void clickMP3Player() { driver.findElement(MP3Players).click();}
    public void clickLaptopsAndNotebooks() { driver.findElement(LaptopsAndNotebooks).click();}
    public void clickDesktopsAndMonitor() { driver.findElement(DesktopsAndMonitor).click();}
    public void clickPrintersAndScanners() { driver.findElement(PrintersAndScanners).click();}
    public void clickMiceAndTrackballs() { driver.findElement(MiceAndTrackballs).click();}
    public void clickFashionAndAccessories() { driver.findElement(FashionAndAccessories).click();}
    public void clickBeautyAndSaloon() { driver.findElement(BeautyAndSaloon).click();}
    public void clickAutopartsAndAccessories() { driver.findElement(AutopartsAndAccessories).click();}
    public void clickWashingMachine() { driver.findElement(WashingMachine).click();}
    public void clickGamingConsoles() { driver.findElement(GamingConsoles).click();}
    public void clickAirConditioner() { driver.findElement(AirConditioner).click();}
    public void clickWebCameras() { driver.findElement(WebCameras).click();}





}
