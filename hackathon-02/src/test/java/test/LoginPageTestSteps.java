package test;

import com.example.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.WebSetUp;

public class LoginPageTestSteps {

    private LoginPage loginPage = new LoginPage(WebSetUp.setUp());

    @Given("the user is on the login page {string}")
    public void i_am_on_the_login_page(String url) {
        loginPage.openPage(url);
    }

    @When("the user enters username {string}")
    public void the_user_enters_username(String username) {
        loginPage.enterUsername(username);
    }

    @And("the user leaves the password field blank")
    public void the_user_leaves_the_password_field_blank() {
        loginPage.enterPassword("");
    }

    @And("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("an error message {string} should be displayed")
    public void an_error_message_should_be_displayed(String errorMessage) {
        System.out.println(loginPage.getErrorMessage());
        System.out.println(errorMessage);
        assert loginPage.getErrorMessage().equals(errorMessage);
        loginPage.quitPage();
    }

}
