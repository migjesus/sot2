
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PedidoVerificarDispEspaco {
    private String resposta;
    private String nomeEspaco;
    private String data;
    private DataManager dm = new DataManager();

    public PedidoVerificarDispEspaco() {
    }
    
    public void setResposta(){
      boolean ok = dm.disponibilidade(nomeEspaco, data);
      if(ok)
          resposta = "Espaço disponivel!";
      else
          resposta = "Espaço nao disponivel!";
    }
    
    public String getResposta(){
        return resposta;
    }

    public String getNomeEspaco() {
        return nomeEspaco;
    }

    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
}
