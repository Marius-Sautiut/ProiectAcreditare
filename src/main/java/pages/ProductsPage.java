package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {super(driver);}

    By ProductHtcTouchHd = By.cssSelector("[onclick=\"cart.add('28');\"]");
    By Cart = By.id("entry_217825");
    By CheckoutButton = By.xpath("//*[@id=\"entry_217851\"]/a");


    public void clickAddProductHtcTouchHdToCart() { driver.findElement(ProductHtcTouchHd).click(); }
    public void clickCart() { driver.findElement(Cart).click();}
    public void clickCheckoutButton() {driver.findElement(CheckoutButton).click();}


}
