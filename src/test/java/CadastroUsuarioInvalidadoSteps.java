import io.cucumber.java.en.*;

public class CadastroUsuarioInvalidadoSteps {
    @Given("user is logged in to application ChamaMed for test")
    public void user_is_logged_in_to_application_chama_med_for_test() {
        System.out.println("Inside Step - given");
    }
    @And("hits the button Cadastro de Usuários")
    public void hits_the_button_cadastro_de_usuários() {
        System.out.println("Inside Step - and");
    }
    @And("hist the button Adicionar Usuario")
    public void hist_the_button_adicionar_usuario() {
        System.out.println("Inside Step - and");
    }
    @When("enters nome de usuario, matricula e cargo invalidate")
    public void enters_nome_de_usuario_matricula_e_cargo_invalidate() {
        System.out.println("Inside Step - when");
    }
    @Then("press the button Salvar Cadastro for invalidate")
    public void press_the_button_salvar_cadastro_for_invalidate() {
        System.out.println("Inside Step - then");
    }
}