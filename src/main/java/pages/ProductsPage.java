package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {super(driver);}

    By ProductHtcTouchHd = By.cssSelector("[onclick=\"cart.add('28');\"]");
    By Cart = By.id("entry_217825");
    By CheckoutButton = By.xpath("//*[@id=\"entry_217851\"]/a");
    By WatchlistButton = By.cssSelector("[onclick=\"wishlist.add('28', this);\"]");

    public void clickAddProductHtcTouchHdToCart() { driver.findElement(ProductHtcTouchHd).click(); }
    public void clickCart() { driver.findElement(Cart).click();}
    public void clickCheckoutButton() {driver.findElement(CheckoutButton).click();}
    public void clickAddToWatchlist() {driver.findElement(WatchlistButton).click();}




}
