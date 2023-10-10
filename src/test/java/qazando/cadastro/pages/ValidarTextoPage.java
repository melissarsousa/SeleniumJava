package qazando.cadastro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qazando.cadastro.BasePage;

public class ValidarTextoPage extends BasePage {
    @FindBy(className = "swal2-title")
    private WebElement localizadorTexto;

    public ValidarTextoPage(WebDriver browser) {
        super(browser);
    }

    public String reconhecerTexto() {
        return localizadorTexto.getText();
    }
}
