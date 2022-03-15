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
public class Jogo extends Evento implements Serializable{
    //variaveis de instancia
    private String adversario;

    //construtor
    public Jogo (int id_evento, String local, LocalDateTime dia, String escalao, String adv, ArrayList<Atleta> lista_atletas) {
        super(id_evento, local, dia, escalao, lista_atletas);
        this.adversario= adv;
    }
    
    //Métodos seletores
	public String getAdversario() {
        return adversario;
    }
	   
    //Métodos modificadores
    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }
}
