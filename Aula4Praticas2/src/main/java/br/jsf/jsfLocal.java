/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.ejb.ejbLocalLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Pessoal
 */
@Named(value = "jsfLocal")
@RequestScoped
public class jsfLocal {

    @EJB
    private ejbLocalLocal ejbLocal;
  
    private int valor;
    private int resultado;
    
    
    /**
     * Creates a new instance of jsfLocal
     */
    public jsfLocal() {
    }

    public void dobrarValor(){
        resultado=ejbLocal.dobrarValor(valor);
    }
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
