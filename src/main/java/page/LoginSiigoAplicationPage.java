package page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://qastaging.siigo.com/#/login/")
public class LoginSiigoAplicationPage extends PageObject {

    public LoginSiigoAplicationPage(WebDriver driver) {
     super(driver);
    }

    @FindBy(xpath="//body//form//input-atom[@id='username']")
    public WebElementFacade userLogin;

    @FindBy(xpath="//body//form//input-atom[@id='current-password']")
    public WebElementFacade passwordLogin;

    @FindBy(xpath = "//button[contains(@class, 'login')]")
    public WebElementFacade buttonLogin;
}


