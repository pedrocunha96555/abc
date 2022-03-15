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
public class Administrador extends Utilizador implements Serializable{
    
    //construtor
    public Administrador(String user, String passe, String nome){
      super(user,passe, nome);
        
        Olá Mundo
    }
}
