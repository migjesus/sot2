
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PedidoListarReservasEspaco {
    private String nomeEspaco;
    private String resposta;
    private DataManager dm = new DataManager();

    public PedidoListarReservasEspaco() {
    }
    
    public void setResposta() {
        ArrayList<String> reservas = dm.listar_reservas(nomeEspaco);
        String result="";
        for(int i = 0;i<reservas.size();i++){
            result+=reservas.get(i)+" ";
        }
       this.resposta=result;
    }
    
    public String getNomeEspaco() {
        return nomeEspaco;
    }

   
    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }


    public String getResposta() {
        return resposta;
    }

    
    
}
