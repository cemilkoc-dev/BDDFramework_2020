package stepDefinition;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import runnerTest.webPages.LoginPage;
import utils.BasePage;

public class LoginPageSD {

    private LoginPage loginPage = new LoginPage();

    @Given("^I am on home page$")
    public void iAmOnHomePage(){
        Assert.assertEquals(BasePage.get().getCurrentUrl(), "https://www.facebook.com/");
    }

    @When("^I enter (.+) into (username|password) text fields on home screen$")
    public void enterDataUserAndPAssField(String anyText, String textField){

        switch (textField){
            case "username":
                loginPage.enterEmail(anyText);
                break;
            case "password":
                loginPage.enterPassword(anyText);
                break;
        }
    }

    @And("^I click on (login button|create account) on home screen$")
    public void clickOnButton(String button){

        switch (button){
            case "login button":
                loginPage.clickOnLogin();
                break;
            case "create account":
                //implement create account
                break;
        }
    }

    @Then("^I verify that I am in invalid login page$")
    public void verifyInvalidLogin(){
        Assert.assertEquals(loginPage.getTextElement(), "Log Into Facebook");
        //loginPage.createAccount();
    }
}
