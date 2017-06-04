
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PedidoVerificarDispEspaco {
    private boolean resposta;
    private String nomeEspaco;
    private String data;
    private DataManager dm = new DataManager();

    public PedidoVerificarDispEspaco() {
    }
    
    public void setResposta(){
       resposta = dm.disponibilidade(nomeEspaco, data);
    }
    
    public boolean getResposta(){
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
