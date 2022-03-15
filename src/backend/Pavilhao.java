/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;

/**
 *
 * @author 
 */
public class Pavilhao implements Serializable{
    private String local; 
    //variavel que guarde os horarios em que está disponivel 
    
    /*construtor
    public Pavilhao(String local, //variavel que guarde os horarios em que está disponivel ){
           this.local=local;
           //variavel que guarde os horarios em que está disponivel 
    }*/
    
    //Métodos seletores
    public String getLocal(){
        return local;
    }
    
    //Métodos modificadores
    public void setLocal(){
        this.local=local;
    }
}
