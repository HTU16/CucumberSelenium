package com.krafttech.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_stepDefs {
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {

        System.out.println("Batch2 was here");
        System.out.println("I open the browser and navigate to krafttech web page");
    }

    @When("The user enters Mike credentials")
    public void the_user_enters_mike_credentials() {

        System.out.println("I enter username and password and click login button");
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {

        System.out.println("I verify that url changed Dashboard page");
    }

    @When("The user enters Aegon Targaryen credentials")
    public void theUserEntersAegonTargaryenCredentials() {
        System.out.println("I enter username and password and click login button");
    }
}