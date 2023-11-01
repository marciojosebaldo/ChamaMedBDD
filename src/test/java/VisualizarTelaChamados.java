import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class VisualizarTelaChamados {

    WebDriver driver = null;
    @Given("user is on page Chamados")
    public void user_is_on_page_chamados() {
        System.out.println("Inside Step - Given");

        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.navigate().to("http://www.localhost:8080/chamados");
    }
    @When("user clicks on page")
    public void user_clicks_on_page() {
        System.out.println("Inside Step - When");

        driver.findElement(By.className("coluna-principal")).click();
    }
    @Then("returns to the Simulação's page")
    public void returns_to_the_simulação_s_page() {
        System.out.println("Inside Step - Then");

        driver.getPageSource().contains("Ação");

    }
}
