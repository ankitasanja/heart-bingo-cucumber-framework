package uk.co.heartbingo.steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.heartbingo.pages.AccountPage;
import uk.co.heartbingo.pages.HomePage;

import java.util.List;

public class AccountSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on sign up link$")
    public void iClickOnSignUpLink() {
        new HomePage().clickOnSignUpLink();
    }

    @Then("^I should navigate to account page$")
    public void iShouldNavigateToAccountPage() {
    }

    @And("^I enter below details on account page$")
    public void iEnterBelowDetailsOnAccountPage(DataTable dataTable) {
        List<List<String>> form = dataTable.asLists(String.class);

        for (List<String> e : form) {
            String firstName = e.get(0);
            new AccountPage().enterFirstName(firstName);
            String lastName = e.get(1);
            new AccountPage().enterLastName(lastName);
        }

    }

    @And("^I click on continue button account page$")
    public void iClickOnContinueButtonAccountPage() {
        new AccountPage().clickOnContinueTabOnAccountPage();
    }

    @And("^I click on female tab$")
    public void iClickOnFemaleTab() {
        new AccountPage().clickOnFemaleTab();
    }

    @And("^I enter email \"([^\"]*)\" into the email field$")
    public void iEnterEmailIntoTheEmailField(String arg0)  {
        new AccountPage().enterEmail();

    }

    @And("^I enter password into password \"([^\"]*)\"field$")
    public void iEnterPasswordIntoPasswordField(String password)  {
        new AccountPage().enterPassword(password);

    }

    @And("^I enter mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobileNum) {
        new AccountPage().enterMobileNumber(mobileNum);
    }

    /*@And("^I enter mobile number \"([^\"]*)\"$")
    public void iEnterMobileNumber(String mobileNum) throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().enterMobileNumber(mobileNum);

    }*/

    @And("^I select date of birth from dropdown$")
    public void iSelectDateOfBirthFromDropdown() {
        new AccountPage().selectDayFromDateOfBirthDropDown();
        new AccountPage().selectMonthFromDateOfBirthDropDown();
        new AccountPage().selectYearFromDateOfBirthDropDown();
    }

    @And("^I enter below personal details$")
    public void iEnterBelowPersonalDetails(DataTable dataTable) {
        List<List<String>> form = dataTable.asLists(String.class);
        new AccountPage().enterHouseNumberInAddressField(form.get(0).get(0));
        new AccountPage().enterLocalityFieldInAddressField(form.get(0).get(1));
        new AccountPage().enterCityFieldInAddressField(form.get(0).get(2));
        new AccountPage().enterPostcodeFieldInAddressField(form.get(0).get(3));


    }

    @Then("^I click on continue tab$")
    public void iClickOnContinueTab() throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().clickOnContinueTabAfterFillingAllDetails();
    }


    @And("^I click on marketing communications check box$")
    public void iClickOnMarketingCommunicationsCheckBox() throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().clickOnMarketingCheckBox();
    }

    @And("^I click on terms and conditions check box$")
    public void iClickOnTermsAndConditionsCheckBox() {
        new AccountPage().clickOnTermsCheckBox();
    }

    @And("^I click on create account tab on sign up page$")
    public void iClickOnCreateAccountTabOnSignUpPage() throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().clickOnCreateAccountTab();
    }

    @Then("^I should be able to create account successfully$")
    public void iShouldBeAbleToCreateAccountSuccessfully() {
    }


}
