/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;

/**
 *
 * @author sanda
 */
public class Escalao {
    private String nome;
    private String genero;
    private ArrayList<Atleta> lista_atletas=new ArrayList();
    
    //construtor
    public Escalao(String nome, String genero, ArrayList<Atleta> lista_atletas){
        this.nome=nome;
        this.genero=genero;
        this.lista_atletas=lista_atletas;
    }         

    //seletores
    public String getNome(){
        return nome;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public ArrayList<Atleta> getLista_atletas() {
        return lista_atletas;
    }
    
    //modificadores
    public void setNome(String nome){
        this.nome=nome;
    }
 
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setLista_atletas(ArrayList<Atleta> lista_atletas) {
        this.lista_atletas = lista_atletas;
    }
   
}
