package qazando.cadastro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qazando.cadastro.BasePage;

public class ValidarTextoPage extends BasePage {
    private By localizadorTexto = By.className("swal2-title");

    public ValidarTextoPage(WebDriver browser) {
        super(browser);
    }

    public String reconhecerTexto() {
        return browser.findElement(localizadorTexto).getText();
    }
}
