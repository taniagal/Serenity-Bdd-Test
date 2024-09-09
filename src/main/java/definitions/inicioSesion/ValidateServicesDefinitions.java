package definitions.inicioSesion;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import steps.ValidateServicesSteps;

public class ValidateServicesDefinitions {

    @Steps
    private ValidateServicesSteps validateServicesSteps;

    @When("the list the users is searched")
    public void consultListUsers(){
        validateServicesSteps.consultListUsers();
    }

    @Then("the next information can be visualized")
    public void validateListUsers(){
        validateServicesSteps.validateListUsers();
    }

    @When("a request to delete a user is sent")
    public void deleteUser(){
        validateServicesSteps.deleteUser();
    }

    @Then("the user should be deleted successfully")
    public void validateUserDeleted(){
        validateServicesSteps.validateUserDeleted();
    }

    @When("a request to create a user is sent")
    public void createUser(){
        validateServicesSteps.createUser();
    }

    @Then("the user shouldn't be created successfully")
    public void validateUserCreation(){
        validateServicesSteps.validateUserCreation();
    }

    @When("a request to update a user is sent")
    public void updateUser(){
        validateServicesSteps.updateUser();
    }

    @Then("the user shouldn't be updated successfully")
    public void validateUserUpdated(){
        validateServicesSteps.validateUserUpdated();
    }

}
