package definitions.inicioSesion;

import io.cucumber.java.en.Given;
import net.serenitybdd.annotations.Steps;
import steps.LoginSiigoAplicationSteps;

public class LoginSiigoAplicationDefinitions {
    @Steps
    private LoginSiigoAplicationSteps loginSiigoAplicationSteps;

    @Given("you are inside siigo application")
    public void loginSiigoAplication() {
        loginSiigoAplicationSteps.login();
    }
}
