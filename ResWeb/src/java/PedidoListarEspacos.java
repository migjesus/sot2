
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



@ManagedBean
@ApplicationScoped
public class PedidoListarEspacos implements Serializable {
    
    private ArrayList<String> espacos;
    private DataManager dm= new DataManager();
    
      public PedidoListarEspacos(){
        this.setEspacos();   
      }
 
    
    public void setEspacos(){
         this.espacos = dm.listar_espacos();
        
        
    }
    
    public ArrayList<String> getEspacos(){
        return this.espacos;
    }
    
        
    
}
