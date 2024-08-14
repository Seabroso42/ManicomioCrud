package seabroso;

import seabroso.DAO.DoidoDAO;
import seabroso.models.Doido;

public class Main {
    public static void main(String[] args) {
        DoidoDAO doidoManager = new DoidoDAO();
        /* teste de cadastro-
        Doido doidoteste = new Doido(2,"Welker", "insanidade a lactose");
        doidoManager.cadastrarDoido(doidoteste);
        */
        /*teste da listagem-
        for (Doido d : doidoManager.listarDoidos()){
            System.out.println("Paciente: "+d.getName());
            System.out.println("Diagnostico: "+d.getDiagnostico());
            }
        */



    }

}