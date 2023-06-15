package uk.co.heartbingo.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.heartbingo.pages.HomePage;
import uk.co.heartbingo.pages.LoginPage;

public class LoginSteps {
    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogInLink();
    }

    @And("^I enter username \"([^\"]*)\" into username field$")
    public void iEnterUsernameIntoUsernameField(String username) throws InterruptedException {
        Thread.sleep(2000);
        new LoginPage().handlingFrame();
        new LoginPage().enterUserNameInUserNameField(username);
    }

    @And("^I enter password \"([^\"]*)\" into password field$")
    public void iEnterPasswordIntoPasswordField(String password)  {
        new LoginPage().enterPasswordInPasswordField(password);
    }

    @And("^I click on log in button$")
    public void iClickOnLogInButton() {
        new LoginPage().clickOnLogInTab();
    }

    @Then("^I should be able to login successfully$")
    public void iShouldBeAbleToLoginSuccessfully() {

    }


}
