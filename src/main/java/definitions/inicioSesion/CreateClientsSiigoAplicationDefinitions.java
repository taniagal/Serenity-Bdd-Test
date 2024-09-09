package definitions.inicioSesion;

import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import steps.CreateClientsSiigoAplicationSteps;

public class CreateClientsSiigoAplicationDefinitions {
    @Steps
    private CreateClientsSiigoAplicationSteps createClientsSiigoAplicationSteps;

    @When("you go to create a new client")
    public void createNewSiigoClient(){
        createClientsSiigoAplicationSteps.createNewClient();
    }

}
