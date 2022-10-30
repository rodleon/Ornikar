package StepDefinitions;

import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class Estimation {
	
public WebDriver driver;
	
	 @Given("^Je souhaite aller sur le site ornikar assurance$")
	    public void je_souhaite_aller_sur_le_site_ornikar_assurance() throws Throwable {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\gouba\\Downloads\\Nouveau dossier\\Driver\\chromedriver.exe");	
			driver = new ChromeDriver();	
		    
			 driver.get("https://www.ornikar.com/assurance-auto");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#axeptio_btn_acceptAll")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#quote > div > div.Heading_24ZdWz > div.ButtonsBlock_209MCL > div")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div:nth-child(1) > div.Illustration_LORKXV > img")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#vehiculeImmatriculation")).sendKeys("DF399HP");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
	         Thread.sleep(2000);
	         driver.findElement(By.id("downshift-0-input")).click();
	     
	       // List<WebElement> notreListeDeroulante= driver.findElements(By.cssSelector("[class=\"kitt_Select_1qEaI\"]"));
	        //notreListeDeroulante.stream().filter(e->e.getText()equal(option)).findFirst().get().click();
	         
	        
	         
	         //date d'acquisition
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button")).click();
	         driver.findElement(By.cssSelector("#vehiculeAcquisition-day")).sendKeys("01");
	         driver.findElement(By.cssSelector("#vehiculeAcquisition-month")).sendKeys("06");
	         driver.findElement(By.cssSelector("#vehiculeAcquisition-year")).sendKeys("2020");
	         
	         //bouton continuer
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         
	         //Date prévisonnelle d'assurance
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div.DateInput_22akoO > div > div > div:nth-child(1) > div > input")).sendKeys("02");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div.DateInput_22akoO > div > div > div:nth-child(2) > div > input")).sendKeys("11");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div.DateInput_22akoO > div > div > div.kitt_Year_1sd7M > div > input")).sendKeys("2022");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
	         
	         //question radio bouton
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div")).click();
	 
	         //Question conduite
	         //date obtention permis
	         driver.findElement(By.cssSelector("#primaryLicenceDate-day")).sendKeys("12");
	         driver.findElement(By.cssSelector("#primaryLicenceDate-month")).sendKeys("05");
	         driver.findElement(By.cssSelector("#primaryLicenceDate-year")).sendKeys("2020");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
	         
	         //Conduite accompagnée
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div")).click();
	          
	         //Kilométrage par an
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	        
	         //stationnement
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(3) > div > div")).click();
	         
	         //Ville
	         driver.findElement(By.xpath("//*[@id=\"parkingCodePostal\"]")).sendKeys("06000");
	         Thread.sleep(2000);
	         
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         
	         //derniere question conduite
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div > div")).click();
	         
	         //Mes informations
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div > div")).click();
	         driver.findElement(By.cssSelector("#downshift-2-input")).click();
	         
	         //code pour récupérer 1 du champs malus bonus
	         driver.findElement(By.cssSelector("")).click();

	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div > div")).click();
	 
	         Thread.sleep(3000);
	         
	         //Confirmer mes informations
	         
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         Thread.sleep(2000);
	         
	         //Dernières informations pour obtenir mon estimation
	         driver.findElement(By.xpath("//*[@id=\"primaryFirstName\"]")).sendKeys("JOHN");
	         driver.findElement(By.xpath("//*[@id=\"primaryLastName\"]")).sendKeys("SMITH");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div")).click();
	         
	         Thread.sleep(2000);
	         
	         driver.findElement(By.cssSelector("#primaryBirthDate-day")).sendKeys("11");
	         driver.findElement(By.cssSelector("#primaryBirthDate-month")).sendKeys("12");
	         driver.findElement(By.cssSelector("#primaryBirthDate-year")).sendKeys("1992");
	         
	         //Code pour choisir Profession
	         driver.findElement(By.xpath("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div > div.kitt_DropdownSelect_26cKc > div > div > div > span.kitt_Children_1sqOc")).click();
	         
	         //Code pour le statut marital
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div > div.kitt_DropdownSelect_26cKc > div > div > div > span.kitt_Children_1sqOc")).click();
	 
	         //Mail&telephone&adresse
	         driver.findElement(By.cssSelector("#subscriberEmail")).sendKeys("mondevis@gmail.com");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div > div.Container_2u7uY-.react-tel-input > input")).sendKeys("655859564");
	         driver.findElement(By.cssSelector("#downshift-3-input")).sendKeys("22 RUE GUNOD");// AJOUTER CODE POUR CHOISR L'ADRESSE DANS LA LISTE
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	 }
	 
	 

	    @When("^Je souhaite estimer mon tarif pour une assurance$")
	    public void je_souhaite_estimer_mon_tarif_pour_une_assurance() throws Throwable {
	       
	    	driver.findElement(By.cssSelector("#quote > div > div.Heading_24ZdWz > div.ButtonsBlock_209MCL > div")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div:nth-child(1) > div.Illustration_LORKXV > img")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#vehiculeImmatriculation")).sendKeys("DF399HP");
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
	         Thread.sleep(2000);
	         //sdriver.findElement(By.id("downshift-0-input")).click();
	     
	        // List<WebElement> notreListeDeroulante= driver.findElements(By.cssSelector("[class=\"kitt_Select_1qEaI\"]"));
	        // notreListeDeroulante.stream().filter(e->e.getText().equals(option)).findFirst().get().click();
	         
	         Select selectByValue = new Select(driver.findElement(By.xpath("//*[@id=\"downshift-8-input\"]"))); 
	         selectByValue.selectByValue("PEUGEOT 308 2.0 BLUE HDI 150 ALLURE BA");
	         
	         //date d'acquisition
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button")).click();
	         driver.findElement(By.cssSelector("#vehiculeAcquisition-day")).sendKeys("01");
	         driver.findElement(By.cssSelector("#vehiculeAcquisition-month")).sendKeys("06");
	         driver.findElement(By.cssSelector("#vehiculeAcquisition-year")).sendKeys("2020");
	         
	         //bouton continuer
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         
	         //Date prévisonnelle d'assurance
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div.DateInput_22akoO > div > div > div:nth-child(1) > div > input")).sendKeys("02");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div.DateInput_22akoO > div > div > div:nth-child(2) > div > input")).sendKeys("11");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div.DateInput_22akoO > div > div > div.kitt_Year_1sd7M > div > input")).sendKeys("2022");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
	         
	         //question radio bouton
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div")).click();
	 
	         //Question conduite
	         //date obtention permis
	         driver.findElement(By.cssSelector("#primaryLicenceDate-day")).sendKeys("12");
	         driver.findElement(By.cssSelector("#primaryLicenceDate-month")).sendKeys("05");
	         driver.findElement(By.cssSelector("#primaryLicenceDate-year")).sendKeys("2020");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div")).click();
	         
	         //Conduite accompagnée
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div")).click();
	          
	         //Kilométrage par an
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	        
	         //stationnement
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(3) > div > div")).click();
	         
	         //Ville
	         driver.findElement(By.xpath("//*[@id=\"parkingCodePostal\"]")).sendKeys("06000");
	         Thread.sleep(2000);
	         
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         
	         //derniere question conduite
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(1) > div > div")).click();
	         
	         //Mes informations
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div > div")).click();
	         driver.findElement(By.cssSelector("#downshift-2-input")).click();
	         
	         //code pour récupérer 1 du champs malus bonus
	         driver.findElement(By.cssSelector("")).click();

	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div > div")).click();
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div > div > div > label:nth-child(2) > div > div")).click();
	 
	         Thread.sleep(3000);
	         
	         //Confirmer mes informations
	         
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	         Thread.sleep(2000);
	         
	         //Dernières informations pour obtenir mon estimation
	         driver.findElement(By.xpath("//*[@id=\"primaryFirstName\"]")).sendKeys("JOHN");
	         driver.findElement(By.xpath("//*[@id=\"primaryLastName\"]")).sendKeys("SMITH");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > label:nth-child(1) > div")).click();
	         
	         Thread.sleep(2000);
	         
	         driver.findElement(By.cssSelector("#primaryBirthDate-day")).sendKeys("11");
	         driver.findElement(By.cssSelector("#primaryBirthDate-month")).sendKeys("12");
	         driver.findElement(By.cssSelector("#primaryBirthDate-year")).sendKeys("1992");
	         
	         //Code pour choisir Profession
	         driver.findElement(By.xpath("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div > div.kitt_DropdownSelect_26cKc > div > div > div > span.kitt_Children_1sqOc")).click();
	         
	         //Code pour le statut marital
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div > div.kitt_DropdownSelect_26cKc > div > div > div > span.kitt_Children_1sqOc")).click();
	 
	         //Mail&telephone&adresse
	         driver.findElement(By.cssSelector("#subscriberEmail")).sendKeys("mondevis@gmail.com");
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div > div.Container_2u7uY-.react-tel-input > input")).sendKeys("655859564");
	         driver.findElement(By.cssSelector("#downshift-3-input")).sendKeys("22 RUE GUNOD");// AJOUTER CODE POUR CHOISR L'ADRESSE DANS LA LISTE
	         driver.findElement(By.cssSelector("#__next > div > div:nth-child(2) > div.FullWidthLayout_1BMidt.FullWidthWithHeader_2gKC17 > form > div.OuterContainer_2gJzzG > div > div.ButtonSection_3jORfe > button > div > span")).click();
	 }
	    
	    @Then("^Faire une capture d'écran et quitter le navigateur$")
	    public void faire_une_capture_dcran_et_quitter_le_navigateur() throws Throwable {
	    	
	 
	    }
	
	
}
