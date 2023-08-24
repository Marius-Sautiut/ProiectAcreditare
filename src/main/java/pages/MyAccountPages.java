package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.*;

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
    By Password = By.linkText("Password");
    By PasswordFirstField = By.xpath("//*[@id=\"input-password\"]");
    By PasswordConfirmField = By.xpath("//*[@id=\"input-confirm\"]");
    By AddressBook = By.linkText("Address Book");
    By NewAddress = By.linkText("New Address");
    By Address1 = By.cssSelector("[name=\"address_1\"]");
    By City = By.cssSelector("[name=\"city\"]");
    By Postcode = By.cssSelector("[name=\"postcode\"]");
    By Country = By.cssSelector("[name=\"country_id\"]");
    By CountryRomania = By.xpath("//*[@id=\"input-country\"]/option[186]");
    By CountryPleaseSelect = By.xpath("//*[@id=\"input-country\"]/option[1]");

    By RegionState = By.cssSelector("[name=\"zone_id\"]");
    By RegionBihor = By.xpath("//*[@id=\"input-zone\"]/option[6]");
    By DefaultRadioButton = By.xpath("//*[@id=\"content\"]/form/fieldset/div[10]/div/div[1]/label/input");

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
    public void clickPassword() {driver.findElement(Password).click();}
    public void clickPasswordFirstField() {driver.findElement(PasswordFirstField).click();}
    public void writePasswordFirstField(String arg1) {driver.findElement(PasswordFirstField).sendKeys(arg1);}
    public void clickPasswordConfirmField() {driver.findElement(PasswordConfirmField).click();}
    public void writePasswordConfirmField(String arg1) {driver.findElement(PasswordConfirmField).sendKeys(arg1);}
    public void clickAddressBook() {driver.findElement(AddressBook).click();}
    public void clickNewAddress() {driver.findElement(NewAddress).click();}
    public void clickAddress1() {driver.findElement(Address1).click();}
    public void writeAddress1(String arg1) {driver.findElement(Address1).sendKeys(arg1);}
    public void clickCty() {driver.findElement(City).click();}
    public void writetCity(String arg1) {driver.findElement(City).sendKeys(arg1);}
    public void clickPostcode() {driver.findElement(Postcode).click();}
    public void writePostcode(String arg1) {driver.findElement(Postcode).sendKeys(arg1);}
    public void clickCountry() {driver.findElement(Country).click();}
    public void pleaseSelectCountry() {driver.findElement(CountryPleaseSelect).click();}
    public void selectCountryRomania() {driver.findElement(CountryRomania).click();};
    public void clickRegionState() {driver.findElement(RegionState).click();}
    public void selectBihor() {driver.findElement(RegionBihor).click();}

    public void clickRadioButton() {driver.findElement(DefaultRadioButton).click();}



}
