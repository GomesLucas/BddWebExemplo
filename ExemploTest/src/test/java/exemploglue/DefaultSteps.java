package exemploglue;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DefaultSteps extends WebDriverFactory{

	@Given("^Estou com a tela do Firefox aberta$")
	public void estou_com_a_tela_do_Firefox_aberta() throws Throwable {
	    driver = new FirefoxDriver();
	}

	@When("^Acesso página do google$")
	public void acesso_página_do_google() throws Throwable {
		driver.get("http://google.com");
	}

	@When("^digito a palavra \"(.*?)\"$")
	public void digito_a_palavra(String txPesquisa) throws Throwable {
		 driver.findElement(By.id("lst-ib")).clear();
		 driver.findElement(By.id("lst-ib")).sendKeys(txPesquisa);
	}

	@When("^Clico no botão pesquisar$")
	public void clico_no_botão_pesquisar() throws Throwable {
		driver.findElement(By.name("btnG")).click();
	}

	
}
