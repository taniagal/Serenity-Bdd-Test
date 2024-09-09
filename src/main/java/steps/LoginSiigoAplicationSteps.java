package steps;

import net.serenitybdd.core.pages.WebElementFacade;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import page.LoginSiigoAplicationPage;

import static net.serenitybdd.core.Serenity.getDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


public class LoginSiigoAplicationSteps {
    @Page
    private LoginSiigoAplicationPage loginSiigoAplicationPage;

    public void login() {
        loginSiigoAplicationPage.open();
        loginSiigoAplicationPage.passwordLogin.waitUntilVisible();
        WebElementFacade passwordField = loginSiigoAplicationPage.waitFor(loginSiigoAplicationPage.passwordLogin);
        loginSiigoAplicationPage.waitFor(elementToBeClickable(passwordField));
        WebElementFacade userField = loginSiigoAplicationPage.waitFor(loginSiigoAplicationPage.userLogin);
        loginSiigoAplicationPage.waitFor(elementToBeClickable(userField));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].value = arguments[1];", userField, "admin@siigoautomationqa.com");
        js.executeScript("arguments[0].value = arguments[1];", passwordField, "$22g0QA321");
        WebElement loginForm = getDriver().findElement(By.xpath("//div[@class='card']//button")); // Assumes there's only one form on the page
        js.executeScript("arguments[0].click();", loginForm);
    }
}



