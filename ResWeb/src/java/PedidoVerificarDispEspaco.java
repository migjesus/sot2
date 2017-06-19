
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@ManagedBean
@FacesValidator("pedidoVerificarDispEspaco")
public class PedidoVerificarDispEspaco implements Validator {
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

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try{
            Date dateI = format.parse(o.toString());            
            Date actualDate = new Date();
            System.out.println(dateI.toString());
            
            if(!dateI.after(actualDate)){
        
               FacesMessage msg = new FacesMessage("Formato de data invalido ou data anterior à actual. Tente: ano-mes-dia h:min");
               throw new ValidatorException(msg);
            }
  
        }catch( Exception e){
            FacesMessage msg = new FacesMessage("Formato de data invalido ou data anterior à actual. Tente: ano-mes-dia h:min");
            throw new ValidatorException(msg);
        }  
        
    }
    
    
}
