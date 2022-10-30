package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class API {
 public WebDriver driver;

    @Given("^Je me connecte sur postman$")
    public void je_me_connecte_sur_postman() throws Throwable {
        
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouba\\Downloads\\Nouveau dossier\\Driver\\chromedriver.exe");	
		driver = new ChromeDriver();
    }

    @When("^Je lance une requete Get pour récupérer tous les employés$")
    public void je_lance_une_requete_get_pour_rcuprer_tous_les_employs() throws Throwable {
       
    }

    @When("^Je lance une requete Get pour récupérer un employé avec en paramètre son id$")
    public void je_lance_une_requete_get_pour_rcuprer_un_employ_avec_en_paramtre_son_id() throws Throwable {
       
    }

    @When("^Je lance une requete POST pour ajouter un nouvel employé $")
    public void je_lance_une_requete_post_pour_ajouter_un_nouvel_employ() throws Throwable {
        
    }

    @When("^Je lance une requete PUT pour modifier les informations $")
    public void je_lance_une_requete_put_pour_modifier_les_informations() throws Throwable {
        
    }

    @When("^Je lance une requete DEL pour modifier les informations $")
    public void je_lance_une_requete_del_pour_modifier_les_informations() throws Throwable {
        
    }

    @Then("^Je vérifie que la réponse me renvoie tous les employés$")
    public void je_vrifie_que_la_rponse_me_renvoie_tous_les_employs() throws Throwable {
        
    }

    @Then("^Je vérifie que la réponse me renvoie le salarié correspondant au paramètre id$")
    public void je_vrifie_que_la_rponse_me_renvoie_le_salari_correspondant_au_paramtre_id() throws Throwable {
      
    }

    @Then("^Je vérifie que la requete est traitée avec succès $")
    public void je_vrifie_que_la_requete_est_traite_avec_succs() throws Throwable {
        
    }

    @And("^ Je vérifie que le statut retourné est bien 200$")
    public void je_vrifie_que_le_statut_retourn_est_bien_200() throws Throwable {
       
    }
	
}
