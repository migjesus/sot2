
import java.io.Serializable;
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

@FacesValidator("pedidoReserva")
@ManagedBean
public class PedidoReserva implements Serializable, Validator {
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

    @Override
   public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try{
            Date dateI = format.parse(o.toString());
            UIInput componente = (UIInput) uic.getAttributes().get("dataf");
            String dataf = (String) componente.getSubmittedValue();   
            
            Date actualDate = new Date();
            Date dataFinal = format.parse(dataf);
            
            if(!dateI.after(actualDate)){
                FacesMessage msg = new FacesMessage("Formato de data invalido ou data inicial igual ou posterior à final. Tente: ano-mes-dia h:min");
                throw new ValidatorException(msg);
            }
            
            if(!dataFinal.after(dateI)){
                FacesMessage msg = new FacesMessage("Formato de data invalido ou data inicial igual ou posterior à final. Tente: ano-mes-dia h:min");
                throw new ValidatorException(msg);
            } 
            
            if (dataFinal.equals(dateI)){
                FacesMessage msg = new FacesMessage("Formato de data invalido ou data inicial igual ou posterior à final. Tente: ano-mes-dia h:min");
                throw new ValidatorException(msg);
            }
           
            
        }catch( Exception e){
            FacesMessage msg = new FacesMessage("Formato de data invalido ou data inicial igual ou posterior à final. Tente: ano-mes-dia h:min");
            throw new ValidatorException(msg);
        }  
        
    }

    
}
