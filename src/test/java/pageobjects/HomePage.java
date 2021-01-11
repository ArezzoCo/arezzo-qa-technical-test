package pageobjects;

import utils.Generic;
import utils.ScreenMappings;


public class HomePage extends BasePage {

    static Generic element = new ScreenMappings<models.pages.HomePage>().getJson("HomePage");


    public static void pesquisa(String produto) {
        fillInput(produto, element.getCampoDePesquisa());
        click(element.getCampoDePesquisaSumbit());
    }
    public static void selecionarPrimeiroResultadoDaPesquisa(){
        click(element.getSelecioarPrimeiraProdutoDaPesquisa());
    }

}