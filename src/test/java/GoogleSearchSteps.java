import io.cucumber.java.en.*;

public class GoogleSearchSteps {
    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is opens");
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step - user is on google search page");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside Step - user enters a text in search box");
    }

    @And("hits enter")
    public void hits_enter() {
        System.out.println("Inside Step - hits enter");
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside Step - user is navigated to search results");
    }
}