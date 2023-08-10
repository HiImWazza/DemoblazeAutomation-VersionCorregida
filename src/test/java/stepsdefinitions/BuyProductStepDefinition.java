package stepsdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.CompareCategories;
import tasks.BuyProduct;

public class BuyProductStepDefinition {

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("the user enters the web page")
    public void theUserEntersTheWebPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com/"));

    }

    @When("the user adds two products to the cart and has placed an order")
    public void theUserAddsTwoProductsToTheCartAndHasPlacedAnOrder() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuyProduct.enterandadd());
    }

    @Then("the user has purchased the products successfully")
    public void theUserHasPurchasedTheProductsSuccessfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareCategories.validation(), Matchers.is("CATEGORIES")));
    }

    @After
    public void setFinish() {
        hisBrowser.close();
    }

}