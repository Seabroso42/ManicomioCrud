package seabroso.view;

import seabroso.models.Remedio;

public class RemedioView {
    public void DisplayRemedio(String nome, String subs, float dosagem){
        System.out.println(
                "Remedio: "+ nome
                + "/n feito de" + dosagem
                + "de" + subs
        );
    }
}
