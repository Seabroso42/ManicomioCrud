package seabroso.models;

import java.util.ArrayList;

public class Doido {
    private long cadastro;
    private String name;
    private ArrayList<Remedio> receitas;
    private ArrayList<AmigoImaginario> ilusoes;
    private String diagnostico;

    public static void main(String[] args) {

    }

    public Doido(){

    }
    public AmigoImaginario criarAmigo(){
        AmigoImaginario bestie= new AmigoImaginario();

        return bestie;
    }

}
