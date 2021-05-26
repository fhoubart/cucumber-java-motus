package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;

import hellocucumber.App;

import static org.junit.Assert.*;

public class StepDefinitions {

    private App app;

    @Before
    public void before() {
        this.app = new App();
    }


    @Given("L'application est demarree")
    public void l_application_est_demarree() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("on appelle la methode hello")
    public void on_appelle_la_methode_hello() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("affiche un message hello world")
    public void affiche_un_message_hello_world() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



    @Given("Le mot a deviner est {string}")
    public void le_mot_a_deviner_est_poutine(String mot) {
        // Write code here that turns the phrase above into concrete actions
        this.app.setMotADeviner(mot);
    }
    @When("le joueur propose {string}")
    public void le_joueur_propose_poutine(String proposition) {
        // Write code here that turns the phrase above into concrete actions
        this.app.propose(proposition);
    }
    @Then("le joueur a gagne")
    public void le_joueur_a_gagne() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(this.app.aGagner());
    }
}
