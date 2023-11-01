import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertFalse;
import java.time.Duration;

public class CadastroUsuarioInvalidadoSteps {

    WebDriver driver = null;
    @Given("user is logged in to application ChamaMed for test")
    public void user_is_logged_in_to_application_chama_med_for_test() {
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
    @And("hits the button Cadastro de Usuários")
    public void hits_the_button_cadastro_de_usuários() {
        System.out.println("Inside Step - and");

        driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
    }
    @When("hist the button Adicionar Usuario")
    public void hist_the_button_adicionar_usuario() {
        System.out.println("Inside Step - and");

        driver.findElement(By.xpath("/html/body/div/div/a[1]")).click();
    }
    @Then("enters nome de usuario, matricula e cargo invalidate")
    public void enters_nome_de_usuario_matricula_e_cargo_invalidate() {
        System.out.println("Inside Step - when");

        driver.findElement(By.id("nome")).sendKeys("Nome Teste");
        driver.findElement(By.id("matricula")).sendKeys("Nome Teste");

        WebElement cargoDropdown = driver.findElement(By.id("cargo"));
        Select selectCargo = new Select(cargoDropdown);
        selectCargo.selectByVisibleText("Professor");

        assertFalse(driver.findElements(By.xpath("//*[contains(text(), 'Professor')]")).size() > 0);

    }
}