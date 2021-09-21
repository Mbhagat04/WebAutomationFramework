package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import navigation.NavigateTo;
import search.LookForInformation;
import search.WikipediaArticle;

public class SearchStepDefinitions {

    @Given("{actor} is researching things on the internet")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(LookForInformation.about(term)
        );
    }

    @Then("{actor} should see information about {string}")
    public void should_see_information_about(Actor actor, String term) {
        actor.attemptsTo(Ensure.that(WikipediaArticle.HEADING).hasText(term)
        );
    }

    @Given("Tilda is researching things on the internet")
    public void tildaIsResearchingThingsOnTheInternet() {
    }

    @When("he looks up {string}")
    public void heLooksUp(String arg0) {
    }

    @Then("he should see information about {string}")
    public void heShouldSeeInformationAbout(String arg0) {
    }
}