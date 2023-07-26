package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {super(driver);}

    By ProductName = By.linkText("HTC Touch HD");

    public void checkProductName() {driver.findElement(ProductName).click();}


}
