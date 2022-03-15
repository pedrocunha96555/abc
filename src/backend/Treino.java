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
public class Treino extends Evento implements Serializable{
    //variaveis de instancia
  
    //construtor
    public Treino (int id_evento, String local,LocalDateTime dia, String escalao, ArrayList<Atleta> lista_atletas) {
        super(id_evento, local, dia, escalao, lista_atletas);

    }
    
    //Métodos seletores
	
	   
    //Métodos modificadores
   
}
