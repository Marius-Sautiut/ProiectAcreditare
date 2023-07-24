package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {super(driver);}


    By EmailField = By.id("input-email");
    By PasswordField = By.id("input-password");
    By LoginButton = By.cssSelector("[value=\"Login\"]");
    By LogoutLink = By.linkText("Logout");


    public void writeEmailField(String arg1) { driver.findElement(EmailField).sendKeys(arg1); }
    public void writePasswordField(String arg1) { driver.findElement(PasswordField).sendKeys(arg1); }
    public void clickLoginButton() { driver.findElement(LoginButton).click(); }
    public void clickLogoutLink() { driver.findElement(LogoutLink).click();}





}
