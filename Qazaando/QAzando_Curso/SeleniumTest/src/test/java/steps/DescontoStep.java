package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DescontoStep {

    @Dado("^que estou no site da qazando$")
    public void que_estou_no_site_da_qazando() throws Throwable {
        System.out.println("Passou 1");
    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() throws Throwable {
        System.out.println("Passou 2");
    }

    @E("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Passou 3");
    }

    @Entao("^eu vejo o codigo de desconto$")
    public void eu_vejo_o_codigo_de_desconto() throws Throwable {
        System.out.println("Passou 4");
    }

}
