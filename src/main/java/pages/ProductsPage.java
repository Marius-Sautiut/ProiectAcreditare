package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {super(driver);}

    By ProductHtcTouchHd = By.cssSelector("[onclick=\"cart.add('28');\"]");
//    By ClosePopUp = By.xpath("//*[@id=\"notification-box-top\"]/div/div[1]/button/span");
    By Cart = By.xpath("//*[@id=\"notification-box-top\"]/div/div[2]/div[2]/div[1]/a");



    public void clickAddProductHtcTouchHdToCart() { driver.findElement(ProductHtcTouchHd).click(); }
//    public void clickClosePopUp() { driver.findElement(ClosePopUp).click();}
    public void clickCartt() { driver.findElement(Cart).click();}


}
