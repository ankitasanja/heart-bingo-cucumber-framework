package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(linkText = "Sign Up")
    WebElement signUpLink;
    @CacheLookup
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(linkText = "Log In")
    WebElement lonInLink;

    public void clickOnSignUpLink() {
        log.info("Clicking on sign up link: " + signUpLink.toString());
        clickOnElement(acceptAllCookies);
        clickOnElement(signUpLink);
    }

    public void clickOnLogInLink() {
        log.info("Clicking on sign up link: " + lonInLink.toString());
        clickOnElement(acceptAllCookies);
        clickOnElement(lonInLink);
    }
}
