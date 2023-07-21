package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPages extends BasePage {

    public MyAccountPages(WebDriver driver) {super(driver);}

    By EditAccout = By.linkText("Edit Account");
    By SelectFieldFirstName = By.cssSelector("[name=\"firstname\"]");
    By SelectFieldLastName = By.cssSelector("[name=\"lastname\"]");
    By SelectFieldEmail = By.cssSelector("[name=\"email\"]");
    By SelectFieldTelephone = By.cssSelector("[name=\"telephone\"]");
    By FieldFirstName = By.cssSelector("[name=\"firstname\"]");
    By FieldLastName = By.cssSelector("[name=\"lastname\"]");
    By FieldEmail = By.cssSelector("[name=\"email\"]");
    By FieldTelephone = By.cssSelector("[name=\"telephone\"]");
    By ContinueButton = By.cssSelector("[value=\"Continue\"]");
    By FirstName = By.cssSelector("[name=\"firstname\"]");
    By LastName = By.cssSelector("[name=\"lastname\"]");
    By Telephone = By.cssSelector("[name=\"telephone\"]");
    public void clickEditAccount() { driver.findElement(EditAccout).click(); }
    public void clickFieldFirstName() {driver.findElement(SelectFieldFirstName).click(); }
    public void clickFieldLastName() {driver.findElement(SelectFieldLastName).clear(); }
    public void clickFieldEmail() {driver.findElement(SelectFieldEmail).clear(); }
    public void clickFieldTelephone() {driver.findElement(SelectFieldTelephone).clear(); }
    public void clearFieldFirstName() {driver.findElement(FieldFirstName).clear(); }
    public void clearFieldLastName() {driver.findElement(FieldLastName).clear(); }
    public void clearFieldEmail() {driver.findElement(FieldEmail).clear(); }
    public void clearFieldTelephone() {driver.findElement(FieldTelephone).clear(); }
    public void clickContinueButton() {driver.findElement(ContinueButton).click(); }

    public void writeFirstNameField(String arg1) { driver.findElement(FirstName).sendKeys(arg1); }
    public void writeLastNameField(String arg1) { driver.findElement(LastName).sendKeys(arg1); }
    public void writeTelephoneField(String arg1) { driver.findElement(Telephone).sendKeys(arg1); }




}
