
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PedidoListarReservasEspaco {
    private String nomeEspaco = "";
    private ArrayList<String> resposta;
    private DataManager dm = new DataManager();

    public PedidoListarReservasEspaco() {
    }
    
    public void setResposta() {
       this.resposta=dm.listar_reservas(nomeEspaco);
    }
    
    public String getNomeEspaco() {
        return nomeEspaco;
    }

   
    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }


    public ArrayList<String> getResposta() {
        return resposta;
    }

    
    
}
