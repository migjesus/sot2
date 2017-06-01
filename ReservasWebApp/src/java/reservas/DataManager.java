
package reservas;

import java.util.ArrayList;


public class DataManager implements BusinessLogic {
    DBConnector pc = new DBConnector("alunos.di.uevora.pt","l36926","l36926","miguel");

    @Override
    public boolean disponibilidade(String nome, String data) {
        return pc.disponibilidade(nome, data);
    }

    @Override
    public double reserva(String nome, String nomeEspaco, String dataInicio, String dataFim, int telefone, int numUtilizadores) {
        return pc.reserva(nome, nomeEspaco, dataInicio, dataFim, telefone, numUtilizadores);
    }

    @Override
    public ArrayList<Espaco> listar_espacos() {
       return pc.listar_espacos();
    }

    @Override
    public ArrayList<Reserva> listar_reservas(String nome) {
        return pc.listar_reservas(nome);
    }


    
  
}
