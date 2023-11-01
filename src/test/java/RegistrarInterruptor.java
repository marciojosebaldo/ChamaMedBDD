import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class RegistrarInterruptor {

    WebDriver driver = null;
    @Given("the user is on the interruptor's page")
    public void the_user_is_on_the_interruptor_s_page() {
        System.out.println("Inside Step - Given");

        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.navigate().to("http://www.localhost:8080/showInterruptor");
    }
    @And("hits the button Adicionar Interruptor")
    public void hits_the_button_adicionar_interruptor() {
        System.out.println("Inside Step - And");

        driver.findElement(By.id("adicionarInterruptor")).click();
    }
    @When("enters nome, true and setor")
    public void enters_nome_true_and_setor() {
        System.out.println("Inside Step - When");

        driver.findElement(By.id("interruptor")).sendKeys("Novo Interruptor");

        WebElement webElement = driver.findElement(By.id("estado"));
        webElement.clear();
        webElement.sendKeys("true");

        driver.findElement(By.id("setor")).sendKeys("Novo Setor");
    }
    @Then("press the button Salvar Cadastro to create new interruptor")
    public void press_the_button_Salvar_Cadastro_to_create_new_interruptor() {
        System.out.println("Inside Step - Then");

        driver.findElement(By.id("cadastrar")).click();

    }
}