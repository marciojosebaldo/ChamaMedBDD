import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CadastroUsuarioSteps {

    WebDriver driver = null;

    @Given("user is logged in to ChamaMed")
    public void user_is_logged_in_to_chama_med() {
        System.out.println("Inside Step - given");

        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        driver.navigate().to("http://www.localhost:8080/");

        driver.findElement(By.id("matricula")).sendKeys("123");
        driver.findElement(By.id("senha")).sendKeys("123");

        driver.findElement(By.id("login")).click();
    }
    @And("hits the button Cadastro de Usuarios")
    public void hits_the_button_cadastro_de_usuarios() {
        System.out.println("Inside Step - and");

        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
    }
    @And("hist the button Adicionar Usuário")
    public void hist_the_button_adicionar_usuário() {
        System.out.println("Inside Step - and");

        driver.findElement(By.xpath("/html/body/div/div/a[1]")).click();

    }
    @When("enters nome de usuario, matricula e cargo")
    public void enters_nome_de_usuario_matricula_e_cargo() {
        System.out.println("Inside Step - and");

        driver.findElement(By.id("nome")).sendKeys("Nome Teste");
        driver.findElement(By.id("matricula")).sendKeys("111000111000");

        WebElement cargoDropdown = driver.findElement(By.id("cargo"));
        Select selectCargo = new Select(cargoDropdown);
        selectCargo.selectByVisibleText("Gestor");
    }
    @Then("press the button Salvar Cadastro")
    public void press_the_button_salvar_cadastro() {
        System.out.println("Inside Step - and");

        driver.findElement(By.id("enviar")).click();
    }
}
