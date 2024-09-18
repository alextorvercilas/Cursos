package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import runner.RunCucumberTest;
//import sun.management.HotspotMemoryMBean;


public class DescontosStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da qazando$")
    public void acessarSiteQazando() {
        homePage.acessarAplicacao();
        }

    @Quando("^eu preencho meu email$")
    public void eu_preencho_meu_email() throws InterruptedException{
        homePage.scrollDown();
        homePage.preencheEmail();
    }
      
	@Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {
        homePage.clickGanharDesconto();
    }

    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() {
        homePage.verificarCupomDesconto();
    }


}