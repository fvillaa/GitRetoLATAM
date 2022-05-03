package co.com.choucair.certification.retolatam.stepdefinitions;

import co.com.choucair.certification.retolatam.model.DataLatam;
import co.com.choucair.certification.retolatam.taks.ConsultaVuelosLatam;
import co.com.choucair.certification.retolatam.taks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ConsultaVuelosStepDefinitions {
   @Before
   public void setStage() {OnStage.setTheStage(new OnlineCast()); }

   @Given("^LATAM Airlines Customer$")
   public void latamAirlinesCustomer() {
       OnStage.theActorCalled("Fernando").wasAbleTo(OpenUp.thePage());
   }


    @When("^check available flights$")
    public void checkAvailableFlights(List<DataLatam>dataLatam) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsultaVuelosLatam.the(dataLatam.get(0)));
    }

    @Then("^Know the options and prices that they offer me$")
    public void knowTheOptionsAndPricesThatTheyOfferMe() {

    }
}
