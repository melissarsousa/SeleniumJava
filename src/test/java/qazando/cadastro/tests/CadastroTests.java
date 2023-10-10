package qazando.cadastro.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import qazando.cadastro.pages.RegistroPage;
import qazando.cadastro.pages.HomePage;
import qazando.cadastro.pages.ValidarTextoPage;

@DisplayName("Teste automatizado da funcionalidade de Cadastro")
public class CadastroTests {
    private WebDriver browser;

    @BeforeEach
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
        browser.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
    }

    @AfterEach
    public void tearDown(){
        browser.quit();
    }

    @Test
    @DisplayName("Registrar um novo usuário com dados válidos")
    public void testCadastrarNovoUsuarioComDadosValidos() {
        HomePage homePage = new HomePage(browser);
        homePage.acessarPaginaPrincipal();
        homePage.abrirPaginaCadastro();
        RegistroPage registroPage = new RegistroPage(browser);
        registroPage.cadastroNovoUsuario("Melissa", "melissa@gmail.com", "12345678");
        ValidarTextoPage validarTextoPage = new ValidarTextoPage(browser);
        String confirmar = validarTextoPage.reconhecerTexto();
        Assertions.assertEquals("Cadastro realizado!", confirmar);
    }
}
