package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(id = "username")  //xpath = "//label[contains(text(),'Username or Email Address')]"
    WebElement usernameField;
    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(name = "login_submit")
    WebElement logInButton;
    @CacheLookup
    @FindBy(className = "oneauth-iframe")
    WebElement iframe;

    public void handlingFrame() {
        handleFrame(iframe);
    }

    public void enterUserNameInUserNameField(String username) {
        log.info("Enter username " + username + " to firstName field " + usernameField.toString());
        sendTextToElement(usernameField, username);

    }
    public void enterPasswordInPasswordField(String password) {
        log.info("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);

    }

    public void clickOnLogInTab() {
        log.info("Clicking on login button: " + logInButton.toString());
        clickOnElement(logInButton);
    }

}
