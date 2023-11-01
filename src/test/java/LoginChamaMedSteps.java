import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginChamaMedSteps {

    WebDriver driver = null;
    WebDriverWait wait = null;

    @Given("page login is open")
    public void page_login_is_open() {

        // Configuração Lubuntu Edge Dev versão 120.0.2172.1
        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }

    @And("user is on login page ChamaMed applications")
    public void user_is_on_login_page_ChamaMed_applications() {
        System.out.println("Inside Step - login page");

        driver.navigate().to("http://www.localhost:8080/");
    }
    @When("user enters the matricula and senha")
    public void user_enters_the_matricula_and_senha() {
        System.out.println("Inside Step - enters matricula and senha");

        driver.findElement(By.id("matricula")).sendKeys("123");
        driver.findElement(By.id("senha")).sendKeys("123");
    }
    @And("press login")
    public void press_login() {
        System.out.println("Inside Step - press the button login");

        driver.findElement(By.id("login")).click();
    }
    @Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("Inside Step - navigated to home page");

        driver.getPageSource().contains("Bem vindo(a): marcio ");

        driver.close();
        driver.quit();
    }
}