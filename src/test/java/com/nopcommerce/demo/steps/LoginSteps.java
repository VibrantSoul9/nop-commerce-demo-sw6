package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("User is on the Home Page")
    public void userIsOnTheHomePage()
    {

    }

    @When("User click on the login link")
    public void userClickOnTheLoginLink()
    {
        new HomePage().clickOnLoginLink();
    }

    @When("User click on login link")
    public void userClickOnLoginLink()
    {
        new HomePage().clickOnLoginLink();
    }

    @And("User enter password")
    public void userEnterPassword() {
        new LoginPage().enterEmailID("yogmaya@gmail.com");
    }

    @And("User click on Login Button")
    public void userClickOnLoginButton() {
        new LoginPage().enterPassword("Ohm108");
    }

    @Then("User verify the error message")
    public void userVerifyTheErrorMessage() {
        Assert.assertEquals(new LoginPage().getErrorMessage(),"Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect", "Error message");
    }

    @Then("User verify the display text of  LogOut link")
    public void userVerifyTheDisplayTextOfLogOutLink() {
        Assert.assertEquals(new HomePage().isLogInLinkDisplay(),"Log out", "Error message");
    }
    @And("User click on LogOut Link")
    public void userClickOnLogOutLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("User verify the display text of Login Link")
    public void userVerifyTheDisplayTextOfLoginLink() {
        Assert.assertEquals(new HomePage().isLogInLinkDisplay(), "Log in", "Error");
    }

    @Then("User verify the text Welcome, Please Sign In!")
    public void userVerifyTheTextWelcomePleaseSignIn()
    {
        Assert.assertEquals(new LoginPage().getWelcomeText(), " Welcome, Please Sign In!","Error");
    }
}
