/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservas;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Espaco implements Serializable {
    
    private String nome;
    private int custo;
    
    
    Espaco(String nome, int custo){
        this.nome = nome;
        this.custo = custo;
    }
    
    public String getNome (){
        return nome;
    }
    
    public void setNome (String nome){
        nome= this.nome;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }
}
