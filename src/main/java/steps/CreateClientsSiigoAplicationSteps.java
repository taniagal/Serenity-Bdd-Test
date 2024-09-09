package steps;

import org.fluentlenium.core.annotation.Page;
import page.CreateClientsSiigoAplicationPage;

public class CreateClientsSiigoAplicationSteps {
    @Page
    private CreateClientsSiigoAplicationPage createClientsSiigoAplicationPage;

    public void createNewClient() {
 createClientsSiigoAplicationPage.clickCreateClient();
    }
}
