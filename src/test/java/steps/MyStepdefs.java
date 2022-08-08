package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class MyStepdefs {
    int userID;
    JsonPath jsonPath;
    Response putResponse;

    @Given("creating a user")
    public void creating_a_user() {

    }

    @When("updating the user")
    public void updatingTheUser() {

    }

    @Then("the user is updated")
    public void theUserIsUpdated() {
    }

    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void updatingTheUserUserNamePassword(String userName,String password) {
        System.out.println(userName);
        System.out.println(password);
    }

    @When("updating the user with invalid input")
    public void updatingTheUserWithInvalidInput() {
    }

    @Then("the user not to be  updated")
    public void theUserNotToBeUpdated() {
    }


    @When("^updating the user with invalid input \"(.*)\" and \"(.*)\"$")
    public void updatingTheUserWithInvalidInput(String arg0, String arg1) {
        System.out.println(arg0);
        System.out.println(arg1);
    }
}
