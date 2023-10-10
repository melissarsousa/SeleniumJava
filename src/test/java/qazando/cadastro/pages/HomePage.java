package qazando.cadastro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qazando.cadastro.BasePage;

public class HomePage extends BasePage {
    private By localizadorBotaoCadastro = By.linkText("Cadastro");

    public HomePage(WebDriver browser) {
        super(browser);
    }

    public void acessarPaginaPrincipal() {
        browser.get("https://automationpratice.com.br/");
    }

    public void abrirPaginaCadastro() {
        browser.findElement(localizadorBotaoCadastro).click();
    }
}

