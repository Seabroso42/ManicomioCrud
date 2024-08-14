package seabroso.DAO;

import seabroso.factory.DataCon;
import seabroso.models.Doido;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/*
  C- create - cadastrardoido()
  R- read - listardoidos()
  U- update - alterardoido()
  D- delete - deletardoido()
*/

public class DoidoDAO {
    public void cadastrarDoido(Doido paciente){
        String sql = "INSERT INTO doidos (CADASTRO, NOME, DIAGNOSTICO) VALUES (?,?,?)";
        PreparedStatement ps= null;
        try{
            String cadastro= String.valueOf(paciente.getCadastro());
            ps = DataCon.getConexao().prepareStatement(sql);
            ps.setString(1, cadastro);
            ps.setString(2, paciente.getName());
            ps.setString(3, paciente.getDiagnostico());

            ps.execute();
            System.out.println("doido cadastrado!");
            ps.close();
        }catch (SQLException | NullPointerException e){
            System.out.println("algo deu errado:");
            e.printStackTrace();
        }finally {
            System.out.println("operação finalizada!");
        }

    }

    public void atualizarDoido(Doido paciente){
        String sql = "UPDATE doidos SET nome = ?, diagnostico = ?" + "WHERE cadastro = ?";
        PreparedStatement ps = null;
        try{
            ps= DataCon.getConexao().prepareStatement(sql);
            //valores a serem atualizados
            ps.setString(1, paciente.getName());
            ps.setString(2, paciente.getDiagnostico());
            //id do doido a ser atualizado
            ps.setString(3, String.valueOf(paciente.getCadastro()));

            ps.execute();

        }catch (SQLException | NullPointerException | NumberFormatException e){
            System.out.println("Falha em atualizar os dados do Lelé!");
            e.printStackTrace();
        }finally {
            try {
                if (ps!=null){
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public List<Doido> listarDoidos(){
        String sql = "SELECT * FROM doidos ";
        PreparedStatement ps = null;
        List<Doido> listagem = new ArrayList<Doido>();
        //classe que recupera os dados do banco
        ResultSet rset = null;
        try{
            ps= Objects.requireNonNull(DataCon.getConexao()).prepareStatement(sql);
            rset= ps.executeQuery();

            while(rset.next()){
                Doido paciente = new Doido();
                //recuperar cadastro
                paciente.setCadastro(Long.parseLong(rset.getString("cadastro")));
                //recuperar nome
                paciente.setName(rset.getString("nome"));
                //recuperar diagnostico
                paciente.setDiagnostico(rset.getString("diagnostico"));
                listagem.add(paciente);
            }

        }catch(SQLException | NumberFormatException | NullPointerException e)  {
            listagem = null;
            System.out.println("deu errado ladrão!");
            e.printStackTrace();
        }finally {
            try{
                if (rset!=null){
                    rset.close();
                }
                if (ps!=null){
                    ps.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return listagem;
    }

    public void deletarDoido(Doido doido){
        String sql = "DELETE FROM doidos WHERE cadastro = ? ";
        PreparedStatement ps = null;
        try{
            ps= DataCon.getConexao().prepareStatement(sql);
            ps.setString(1, String.valueOf(doido.getCadastro()));
            ps.execute();
            System.out.println("paciente removido do sistema.");

        } catch (SQLException | NumberFormatException | NullPointerException e) {
            System.out.println("tentativa inválida - ");
            e.printStackTrace();
        }finally {
            try{
                if (ps!=null){
                    ps.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
