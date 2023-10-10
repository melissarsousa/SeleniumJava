package qazando.cadastro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import qazando.cadastro.BasePage;

public class CadastroPage extends BasePage {
    @FindBy(id = "user")
    private WebElement campoUser;
    @FindBy(id = "email")
    private WebElement campoEmail;
    @FindBy(id = "password")
    private WebElement campoPassword;
    @FindBy(id = "btnRegister")
    private WebElement botaoCadastro;

    public CadastroPage(WebDriver browser) {
        super(browser);
    }

    public ValidarTextoPage cadastrarNovoUsuario(String user, String email, String password) {
        campoUser.sendKeys(user);
        campoEmail.sendKeys(email);
        campoPassword.sendKeys(password);
        botaoCadastro.click();
        return new ValidarTextoPage(browser);
    }
}
