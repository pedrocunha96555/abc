/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class ListaEventos implements Serializable{
    //variaveis de instancia
    private ArrayList <Evento> listaEventos; 
        
    //construtor
    public ListaEventos(){
        listaEventos= new ArrayList();
    }
    
    //exceções
    public class EventoNaoExistenteException extends Exception {
        public EventoNaoExistenteException(){ }
        public EventoNaoExistenteException(String message) {
            super(message);
        }        
    }
    
    public class EventoDuplicadoException extends Exception {
        public EventoDuplicadoException() { }
        public EventoDuplicadoException(String message) {
            super(message);
        }        
    }
    
    //Método seletor
    public ArrayList<Evento> getListaEventos(){
         return listaEventos;
    }
    
    public int length(){
        return listaEventos.size();
    }

    public void adicionarEvento(Evento evento) throws EventoDuplicadoException{       
        try{    
            if(!listaEventos.contains(evento)){
                listaEventos.add(evento); 
            }
        }catch (NullPointerException e){
            throw new EventoDuplicadoException(String.format("O evento já existe ", evento.getIdEvento()));
        }                  
    }    
   
    public void removerEvento(Evento evento){
        listaEventos.remove(evento);
    }
    
    //listagem de todos os eventos
    public ArrayList listagemEventos(){
        ArrayList <Evento> lista =new ArrayList();
        for (Evento evento : listaEventos){
            lista.add(evento);       
        }
        return lista;
    }
    	
    public boolean existe(int id_evento){
       for(int i=0; i<listaEventos.size(); i++){
           if(listaEventos.get(i).getIdEvento()==id_evento){
               return true;
           }
       } 
       return false;
     }
    

    public Evento getIdEvento(int id_evento)throws ListaEventos.EventoNaoExistenteException{
        for (Evento evento : listaEventos){
            if (evento.getIdEvento()==id_evento){
                return evento;             
            }
        }
        throw new ListaEventos.EventoNaoExistenteException("O evento não existe na lista");     
   }
   
}

