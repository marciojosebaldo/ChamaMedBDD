import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class RegistrarInterruptorInvalidado {

    WebDriver driver = null;

    @Given("the user is on the interruptor's page from ChamaMed")
    public void the_user_is_on_the_interruptor_s_page_from_chama_med() {

        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.navigate().to("http://www.localhost:8080/showInterruptor");
    }
    @Given("the user hits the button Adicionar Interruptor")
    public void the_user_hits_the_button_adicionar_interruptor() {

        driver.findElement(By.id("adicionarInterruptor")).click();

    }
    @When("enters nome, true and setor invalidate")
    public void enters_nome_true_and_setor_invalidate() {

        driver.findElement(By.id("interruptor")).sendKeys("Novo Interruptor");
        driver.findElement(By.id("estado")).sendKeys("true");
        driver.findElement(By.id("setor")).sendKeys("Novo Setor");
    }
    @Then("press the button Salvar Cadastro to try create new interruptor")
    public void press_the_button_salvar_cadastro_to_try_create_new_interruptor() {

        driver.findElement(By.id("cadastrar")).click();
    }
}