package steps;

import pageobjects.*;
import cucumber.api.java8.Pt;


public class HomeSteps implements Pt {
    public HomeSteps() {

        Dado("que pesquiso por um produto (.*)", HomePage::pesquisa);
        E("acesso o primeiro produto da pesquisa", HomePage::selecionarPrimeiroResultadoDaPesquisa);
    }

}
