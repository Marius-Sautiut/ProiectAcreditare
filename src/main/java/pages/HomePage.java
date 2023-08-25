package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {super(driver);}

    By MyAccount = By.linkText("My account");
    By ShopByCategory = By.id("entry_217832");
    By CategoryComponents = By.linkText("Components");
    By CategoryCameras = By.linkText("Cameras");
    By PhoneTabletsIpod = By.linkText("Phone, Tablets & Ipod");
    By Software = By.linkText("Software");
    By MP3Players = By.linkText("MP3 Players");
    By LaptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    By DesktopsAndMonitor = By.linkText("Desktops and Monitors");
    By PrintersAndScanners = By.linkText("Printers & Scanners");
    By MiceAndTrackballs = By.linkText("Mice and Trackballs");
    By FashionAndAccessories = By.linkText("Fashion and Accessories");
    By BeautyAndSaloon = By.linkText("Beauty and Saloon");
    By AutopartsAndAccessories = By.linkText("Autoparts and Accessories");
    By WashingMachine = By.linkText("Washing machine");
    By GamingConsoles = By.linkText("Gaming consoles");
    By AirConditioner = By.linkText("Air conditioner");
    By WebCameras = By.linkText("Web Cameras");
    By CategoryDesktop = By.cssSelector("[alt=\"Desktops\"]");
    By HomeButton = By.linkText("Home");


    public void clickMyAccount() { driver.findElement(MyAccount).click(); }
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
    public void clickCategoryDesktop() { driver.findElement(CategoryDesktop).click(); }
    public void clickHomeButton() { driver.findElement(HomeButton).click(); }




}
