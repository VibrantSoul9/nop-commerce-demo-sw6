package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("Click on Register Link")
    public void clickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("User Verify the Register text")
    public void userVerifyTheRegisterText() {
        Assert.assertEquals(new RegisterPage().getRegisterText(), "Register", "Error");
    }

    @When("Click on Register button")
    public void clickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("User verify the first name error message  First name is required.")
    public void userVerifyTheFirstNameErrorMessageFirstNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("First name"), "First name is required", "Error");
    }

    @Then("User Verify the last name error message   Last name is required.")
    public void userVerifyTheLastNameErrorMessageLastNameIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Last name"), "Last name is required", "Error");


    }

    @Then("User Verify the email error message Email is required.")
    public void userVerifyTheEmailErrorMessageEmailIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Email"), "Email is required", "Error");
    }

    @Then("User Verify the password error message Password is required.")
    public void userVerifyThePasswordErrorMessagePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Password"), "Password is required", "Error");
    }

    @Then("User Verify the Confirm password error message Confirm Password is required.")
    public void userVerifyTheConfirmPasswordErrorMessageConfirmPasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().getValidationErrorMessageForField("Confirm password"), "Password is required", "Error");
    }

    @And("User Select gender Female")
    public void userSelectGenderFemale() {
        new RegisterPage().selectGender("Female");
    }

    @And("User Enter firstname")
    public void userEnterFirstname() {
        new RegisterPage().enterFirstName("Human");
    }

    @And("User Enter lastname")
    public void userEnterLastname() {
        new RegisterPage().enterLastName("Soul");
    }

    @And("User Select day")
    public void userSelectDay()
    {
    }


    @And("User Select month")
    public void userSelectMonth() {
    }

    @And("User Select year")
    public void userSelectYear() {
        new RegisterPage().selectDateOfBirth("01", "01", "2000");
    }

    @And("User Enter email")
    public void userEnterEmail() {
        new RegisterPage().enterEmail("Yogmaya@gmail.com");
    }

    @And("User Enter password")
    public void userEnterPassword() {
        new RegisterPage().enterPassword("Ohm108");
    }

    @And("User Enter Confirm Password")
    public void userEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("Ohm108");
    }

    @And("User Click on REGISTER button")
    public void userClickOnREGISTERButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("User Verify message Your registration completed")
    public void userVerifyMessageYourRegistrationCompleted() {
        Assert.assertEquals(new RegisterPage().getYourRegCompletedText(), "Your registration completed", "Error");
    }

}
