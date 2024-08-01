package seabroso.models;

import java.util.ArrayList;

public class Cuidador {
    private String name;
    private ArrayList<Doido> pacientes;
    private long codigoContrato;

    public static void main(String[] args) {

    }

    public void alterarDosagem(){

    }
    public void darRemedio(){

    }
    public void tirarRemedio(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Doido> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Doido> pacientes) {
        this.pacientes = pacientes;
    }

    public long getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(long codigoContrato) {
        this.codigoContrato = codigoContrato;
    }
}
