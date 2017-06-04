
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



@ManagedBean
@ApplicationScoped
public class PedidoListarEspacos implements Serializable {
    
    private String espacos;
    private DataManager dm= new DataManager();
    
      public PedidoListarEspacos(){
      this.setEspacos();   
    }
 
    
    public void setEspacos(){
        ArrayList<String> espacos_array = this.dm.listar_espacos();
        String result="";
        for(int i = 0;i<espacos_array.size();i++){
            result+=espacos_array.get(i)+" ";
        }
       this.espacos=result;
    }
    
    public String getEspacos(){
        return this.espacos;
    }
    
        
    
}
