package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {super(driver);}

    By ProductName = By.linkText("HTC Touch HD");
    By RemoveItem = By.xpath("//*[@id=\"content\"]/form/div/table/tbody/tr/td[4]/div/div/button[2]");

    public void checkProductName() {driver.findElement(ProductName).click();}
    public void clickRemoveItem() {driver.findElement(RemoveItem).click();}


}
