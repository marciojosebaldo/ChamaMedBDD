import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

// Parei no minuto 25 do segundo vídeo

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is opens");

        String caminhoProjeto = System.getProperty("user.dir");
        System.out.println("Caminho do projeto é: "+caminhoProjeto);

        // Configuração Lubuntu Edge Dev versão 120.0.2172.1
        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        // Configuração Windows com Edge versão 116
        // System.setProperty("webdriver.edge.driver", "C:\\Users\\Aluno\\Desktop\\ChamaMedBDD\\src\\test\\resources\\drivers\\msedgedriver.exe");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step - user is on google search page");

        driver.navigate().to("https://www.google.com");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside Step - user enters a text in search box");

        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Inside Step - hits enter");

        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside Step - user is navigated to search results");

        driver.getPageSource().contains("Online Courses");

        driver.close();
        driver.quit();
    }
}