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

    public Doido(){}

    public Doido(long cadastro, String name, String diagnostico) {
        this.cadastro = cadastro;
        this.name = name;
        this.diagnostico = diagnostico;
    }

    public AmigoImaginario criarAmigo(){
        AmigoImaginario bestie= new AmigoImaginario();

        return bestie;
    }

    public long getCadastro() {
        return cadastro;
    }

    public void setCadastro(long cadastro) {
        this.cadastro = cadastro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
