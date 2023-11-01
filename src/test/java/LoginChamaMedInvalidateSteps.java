import io.cucumber.java.en.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class LoginChamaMedInvalidateSteps {

    WebDriver driver = null;

    @Given("page login ChamaMed is open")
    public void page_login_ChamaMed_is_open(){
        System.out.println("Inside Step - page login");

        // Configuração Lubuntu Edge Dev versão 120.0.2172.1
        System.setProperty("webdriver.edge.driver", "/home/marciobaldo/Arquivos Gerais/Márcio Baldo/Sistemas/Testes/ChamaMedBDD/src/test/resources/drivers/msedgedriver");

        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
    }
    @And ("user is on login page ChamaMed")
    public void user_is_on_login_page_ChamaMed() {
        System.out.println("Inside Step - user is on page login");

        driver.navigate().to("http://www.localhost:8080/");
    }
    @When ("user enters the matricula and senha wrong")
    public void user_enters_the_matricula_and_senha_wrong() {
        System.out.println("Inside Step - user enters the matricual and senha wrong");

        driver.findElement(By.id("matricula")).sendKeys("000222000222");
        driver.findElement(By.id("senha")).sendKeys("000222000222");
    }

    @And ("hits the button login")
    public void hits_the_button_login() {
        System.out.println("Inside Step - hits the button login");

        driver.findElement(By.id("login")).click();
    }

    @Then ("user cannot enter the home page")
    public void user_cannot_enter_the_home_page(){
        System.out.println("Inside Step - cannot enters the home page");

        Alert alert = driver.switchTo().alert();
        String textoAlerta = alert.getText();

        if(textoAlerta.contains("Login e Senha Inválidos!")) {
            alert.accept(); // Fecha o alerta da página
            driver.close();
            driver.quit();
        }
    }
}