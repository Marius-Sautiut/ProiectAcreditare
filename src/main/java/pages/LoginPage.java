package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {super(driver);}


    By EmailField = By.id("input-email");
    By PasswordField = By.id("input-password");
    By LoginButton = By.cssSelector("[value=\"Login\"]");

    By Cart = By.id("entry_217825");
    By CheckoutButton = By.xpath("//*[@id=\"entry_217851\"]/a");


    public void writeEmailField(String arg1) { driver.findElement(EmailField).sendKeys(arg1); }
    public void writePasswordField(String arg1) { driver.findElement(PasswordField).sendKeys(arg1); }
    public void clickLoginButton() { driver.findElement(LoginButton).click(); }
    public void clickCart() { driver.findElement(Cart).click();}
    public void clickCheckoutButton() {driver.findElement(CheckoutButton).click();}




}
