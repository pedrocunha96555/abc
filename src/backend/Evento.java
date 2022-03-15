/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Evento implements Serializable{
    //variaveis de instancia
    private int id_evento;
    private String local;
    private LocalDateTime dia;
    private String escalao;
    private ArrayList<Atleta> lista_atletas;
 
    //construtor
    public Evento (int evento, String local,LocalDateTime dia, String esc, ArrayList<Atleta> lista_atletas) {
	this.id_evento=evento;
        this.local=local;
        this.dia=dia;
	this.escalao=esc;
        this.lista_atletas=lista_atletas;
    }
    
    //Métodos seletores
    public int getIdEvento(){
        return id_evento;
    }
    public String getLocal(){
        return local;
    }
	
    public LocalDateTime getDia(){
        return dia;
    }
	
    public String getEscalao(){
        return escalao;
    }
    
    public ArrayList<Atleta> getAtletas(){
        return lista_atletas;
    }
	
    //Métodos modificadores	
    public void setlocal(int id_evento){
        this.id_evento = id_evento;
    }
	
    public void setlocal(String local){
        this.local = local;
    }

    public void setDia(LocalDateTime dia){
        this.dia = dia;
    }
	
    public void setEscalao(String escalao){
        this.escalao = escalao;
    }
	
    @Override
    public String toString() {
        return "Evento{" + "local=" + local +", dia=" + dia + ", escalao=" + escalao + '}';
    }
}
