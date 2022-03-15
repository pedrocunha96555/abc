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
public class Utilizador implements Serializable {
    //variaveis de instancia
    private String username;
    private String password;
    private String nome;
  
    //construtor
    public Utilizador (String user, String passe, String nome){
        this.username=user;
        this.password=passe;
        this.nome=nome;
    }

    //Métodos seletores
    public String getUsername(){
        return username;
    }
  
    public String getPassword(){
        return password;
    }
    
    //Método modificador
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Utilizador{" + "username=" + username + ", password=" + password + '}';
    }   
}
