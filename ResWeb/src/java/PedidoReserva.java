
import java.io.Serializable;
import javax.faces.bean.ManagedBean;



@ManagedBean
public class PedidoReserva implements Serializable {
    private String nome;
    private String nomeEspaco;
    private String dataInicio;
    private String dataFim;
    private String id;
    private int telefone;
    private double custoEstimado;
    private int numUtilizadores;
    private String resposta;
    private DataManager dm = new DataManager();

    public PedidoReserva() {
       
    }
    

    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNomeEspaco() {
        return nomeEspaco;
    }

  
    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }

 
    public String getDataInicio() {
        return dataInicio;
    }

    
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }


    public String getDataFim() {
        return dataFim;
    }

   
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

  
    public int getTelefone() {
        return telefone;
    }

  
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

 
    public double getCustoEstimado() {
        return this.custoEstimado;
    }

   
    public void setCustoEstimado() {
        custoEstimado =dm.reserva(this.nome,this.nomeEspaco, this.dataInicio, this.dataFim, this.telefone, this.numUtilizadores);
    }

    public int getNumUtilizadores() {
        return numUtilizadores;
    }


    public void setNumUtilizadores(int numUtilizadores) {
        this.numUtilizadores = numUtilizadores;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id=dm.reservaID(dataInicio, nomeEspaco);
    }
    
    public void setResposta(){
        this.setCustoEstimado();
        this.setId();
        if(this.custoEstimado!=0)
            this.resposta = "Reserva efectuada com sucesso! O numero de reserva e: "+id;
        else
            this.resposta = "Não foi possível efectuar reserva!";
    }
    
    public String getResposta(){
        return this.resposta;
    }

    
}
