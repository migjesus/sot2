package reservas;


import java.io.Serializable;


public class Reserva implements Serializable {
    
    private String nome;
    private String nomeEspaco;
    private String dataInicio;
    private String dataFim;
    private int telefone;
    private double custoEstimado;
    private int numUtilizadores;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nomeEspaco
     */
    public String getNomeEspaco() {
        return nomeEspaco;
    }

    /**
     * @param nomeEspaco the nomeEspaco to set
     */
    public void setNomeEspaco(String nomeEspaco) {
        this.nomeEspaco = nomeEspaco;
    }

    /**
     * @return the dataInicio
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @return the dataFim
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * @param dataFim the dataFim to set
     */
    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the custoEstimado
     */
    public double getCustoEstimado() {
        return custoEstimado;
    }

    /**
     * @param custoEstimado the custoEstimado to set
     */
    public void setCustoEstimado(double custoEstimado) {
        this.custoEstimado = custoEstimado;
    }

    /**
     * @return the numUtilizadores
     */
    public int getNumUtilizadores() {
        return numUtilizadores;
    }

    /**
     * @param numUtilizadores the numUtilizadores to set
     */
    public void setNumUtilizadores(int numUtilizadores) {
        this.numUtilizadores = numUtilizadores;
    }
    
    
    
    
}
