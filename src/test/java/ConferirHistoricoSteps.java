import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ConferirHistoricoSteps {

    WebDriver driver = null;

    @Given("user is on Interruptore's page")
    public void user_is_on_interruptore_s_page() {
        System.out.println("Inside Step - given");

        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://www.localhost:8080/simulacao");
    }
    @When("hits the button Relatorio")
    public void hits_the_button_relatorio() {
        System.out.println("Inside Step - when");

        driver.findElement(By.xpath("/html/body/a[2]")).click();
    }
    @Then("user will sees Relatorio's page")
    public void user_will_sees_relatorio_s_page() {
        System.out.println("Inside Step - then");

        driver.getPageSource().contains("Data e Hora da Chamada");
    }
}
