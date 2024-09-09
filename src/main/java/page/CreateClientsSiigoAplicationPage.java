package page;

import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateClientsSiigoAplicationPage extends LoginSiigoAplicationPage {
    public CreateClientsSiigoAplicationPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateClient() {
        WebElement shadowHost = getDriver().findElement(By.cssSelector("shadow-host-selector")); // Replace with the CSS selector for the shadow host    // Perform actions or assertions on the element inside the shadow DOM
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebElement shadowRoot = (WebElement) js.executeScript("return arguments[0].shadowRoot", shadowHost);
        WebElement shadowElement = shadowRoot.findElement(By.cssSelector("siigo-button-atom"));
        shadowElement.click();// Add assertions as needed
    }
}
