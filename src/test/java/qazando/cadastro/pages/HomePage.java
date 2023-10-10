package qazando.cadastro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qazando.cadastro.BasePage;

public class HomePage extends BasePage {
    @FindBy(linkText = "Cadastro")
    private WebElement botaoCadastro;

    public HomePage(WebDriver browser) {
        super(browser);
    }

    public HomePage acessarPaginaPrincipal() {
        browser.get("https://automationpratice.com.br/");
        return new HomePage(browser);
    }

    public CadastroPage abrirPaginaCadastro() {
        botaoCadastro.click();
        return new CadastroPage(browser);
    }
}

