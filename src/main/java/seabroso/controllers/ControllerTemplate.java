package seabroso.controllers;

import seabroso.models.Remedio;
import seabroso.view.RemedioView;

public class ControllerTemplate {
    private Remedio model;
    private RemedioView tela;

    public ControllerTemplate(Remedio model, RemedioView tela){
        this.tela= tela;
        this.model= model;
    }

    public void updateView(){
        tela.DisplayRemedio(model.getNome(), model.getSubstancia(), model.getDosagem());
    }
}
