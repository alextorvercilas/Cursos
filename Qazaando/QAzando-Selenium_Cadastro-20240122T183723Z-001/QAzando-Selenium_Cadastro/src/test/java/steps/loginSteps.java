package steps;

import cucumber.api.java.es.Dado;
import pages.loginPage;
import runner.RunCucumberTest;

public class loginSteps extends RunCucumberTest {

    pages.loginPage loginPage = new loginPage(driver);

    @Dado("^que esteja na tela de login$")
    public void que_esteja_na_tela_de_login() throws Throwable {
        loginPage.acessarTelaLogin();
    }

   @Dado("^acesso o cadastro de usuário$")
   public void acesso_o_cadastro_de_usuario() throws Throwable {
         loginPage.waitBeElementPresent();
      }

}
