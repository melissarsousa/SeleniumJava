package qazando.cadastro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import qazando.cadastro.BasePage;

public class RegistroPage extends BasePage {
    private By localizadorCampoUser = By.id("user");
    private By localizadorCampoEmail = By.id("email");
    private By localizadorCampoPassword = By.id("password");
    private By botaoCadastrar = By.id("btnRegister");

    public RegistroPage(WebDriver browser) {
        super(browser);
    }

    public void cadastroNovoUsuario(String user, String email, String password) {
        this.browser.findElement(localizadorCampoUser).sendKeys(user);
        this.browser.findElement(localizadorCampoEmail).sendKeys(email);
        this.browser.findElement(localizadorCampoPassword).sendKeys(password);
        this.browser.findElement(botaoCadastrar).click();
    }
}
