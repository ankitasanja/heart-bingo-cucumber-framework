package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class AccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());

    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    // All web element locators for account page
    @CacheLookup
    @FindBy(id = "first_name")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "last_name")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Female']")
    WebElement femaleTab;
    @CacheLookup
    @FindBy(id = "regpath_form_email_input")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(className = "account-form__input")
    WebElement countryField;
    @CacheLookup
    @FindBy(id = "phone_number")
    WebElement mobileField;
    @CacheLookup
    @FindBy(xpath = "//select[@name='day']")
    WebElement dayDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='month']")
    WebElement monthDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='year']")
    WebElement yearDropDown;
    @CacheLookup
    @FindBy(id = "address1")
    WebElement houseNumberField;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='address2'])[1]")
    WebElement localityField;
    @CacheLookup
    @FindBy(id = "address3")
    WebElement cityField;
    @CacheLookup
    @FindBy(id = "address4")
    WebElement countyField;
    @CacheLookup
    @FindBy(id = "postcode")
    WebElement postcodeField;
    @CacheLookup
    @FindBy(xpath = "//span[@class='regpath__button-next-text']")
    WebElement continueTabAfterAllDetails;
    @CacheLookup
    @FindBy(xpath = "//label[@for='marketing_opt_in']")
    WebElement marketingCheckBox;
    @CacheLookup
    @FindBy(xpath = "//label[@for='terms_privacy_policy']")
    WebElement termsCheckBox;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    WebElement createAccount;

    public void enterFirstName(String firstName) {
        log.info("Enter first name " + firstName + " to firstName field " + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);

    }

    public void enterLastName(String lastName) {
        log.info("Enter last name " + lastName + " to lastName field " + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);

    }

    public void clickOnContinueTabOnAccountPage() {
        log.info("Clicking on continue tab on account page: " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOnFemaleTab() {
        log.info("Clicking on female tab on account page: " + femaleTab.toString());
        clickOnElement(femaleTab);
    }

    public void enterEmail() {
        String generated = getRandomString(5) + "@gmail.co.uk";
        log.info("Enter email " + emailField.toString());
        sendTextToElement(emailField, generated);
    }

    public void enterPassword(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);

    }

    public void enterMobileNumber(String mobileNum)  {
        log.info("Enter mobile number " + mobileNum + " to mobile number field " + mobileField.toString());
        sendTextToElement(mobileField, mobileNum);

    }

    public void selectDayFromDateOfBirthDropDown() {
        log.info("Select a day from drop down ");
        selectByVisibleTextFromDropDown(dayDropDown,"7");

    }

    public void selectMonthFromDateOfBirthDropDown() {
        log.info("Select a month from drop down ");
        selectByVisibleTextFromDropDown(monthDropDown, "January");

    }

    public void selectYearFromDateOfBirthDropDown() {
        log.info("Select a year from drop down ");
        selectByVisibleTextFromDropDown(yearDropDown, "1997");

    }


    public void enterHouseNumberInAddressField(String houseNum) {
        log.info("Enter house number " + houseNum + " to address field " + houseNumberField.toString());
        sendTextToElement(houseNumberField, houseNum);

    }
    public void enterLocalityFieldInAddressField(String locality) {
        log.info("Enter locality  " + locality + " to address field " + localityField.toString());
        sendTextToElement(localityField, locality);

    }
    public void enterCityFieldInAddressField(String city) {
        log.info("Enter city  " + city + " to address field " + cityField.toString());
        sendTextToElement(cityField, city);

    }

    public void enterPostcodeFieldInAddressField(String postcode) {
        log.info("Enter postcode  " + postcode + " to address field " + postcodeField.toString());
        sendTextToElement(postcodeField, postcode);

    }
    public void clickOnContinueTabAfterFillingAllDetails() {
        log.info("Clicking on continue tab on account page: " + continueTabAfterAllDetails.toString());
        clickOnElement(continueTabAfterAllDetails);
    }
    public void clickOnMarketingCheckBox() {
        log.info("Clicking on marketing checkbox: " + marketingCheckBox.toString());
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", marketingCheckBox);

    }
    public void clickOnTermsCheckBox() {
        log.info("Clicking on terms checkbox: " + termsCheckBox.toString());
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", termsCheckBox);

    }
    public void clickOnCreateAccountTab() {
        log.info("Clicking on create account tab: " + createAccount.toString());
        clickOnElement(createAccount);
    }


}
