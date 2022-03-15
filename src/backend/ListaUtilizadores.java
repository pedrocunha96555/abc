/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author 
 */
public class ListaUtilizadores implements Serializable{
    //variaveis de instancia
    private HashMap<String, Utilizador> listaUtilizadores;

    //construtor
    public ListaUtilizadores() {
        listaUtilizadores = new HashMap<>();        
    }
    
    //exceções
    public class UtilizadorNaoExistenteException extends Exception {
        public UtilizadorNaoExistenteException() { }
        public UtilizadorNaoExistenteException(String message) {
            super(message);
        }        
    }
    
    public class UtilizadorDuplicadoException extends Exception {
        public UtilizadorDuplicadoException() { }
        public UtilizadorDuplicadoException(String message) {
            super(message);
        }        
    }
    
    //Método seletor
    public HashMap<String, Utilizador> getListaUtilizadores() {
        return listaUtilizadores;
    }

    public void adicionarUtilizador(Utilizador utilizador) throws UtilizadorDuplicadoException {
        if (utilizador == null) {
            throw new NullPointerException("O parâmetro 'utilizador' não pode ser um valor nulo");
        }        
        
        if (!listaUtilizadores.containsKey(utilizador.getUsername())){
            listaUtilizadores.put(utilizador.getUsername(), utilizador);
        }else{
            throw new UtilizadorDuplicadoException(String.format("O utilizador já existe na coleção", utilizador.getUsername()));
        } 
    }
   
    
    public boolean existe(String username) {
        return listaUtilizadores.containsKey(username);
    }
    
    public int size() {
        return listaUtilizadores.size();
    }
    
    public void removerUtilizador(String username) {
        listaUtilizadores.remove(username);
    }
    
    public Utilizador getUtilizador(String username) throws UtilizadorNaoExistenteException {
        if (listaUtilizadores.containsKey(username)){
            return listaUtilizadores.get(username);
        }else{
            throw new UtilizadorNaoExistenteException("O utilizador já existe na lista");
        }
    }

    public Atleta getAtleta(Atleta atleta) throws UtilizadorNaoExistenteException {
        if (listagemAtletas().contains(atleta)){
            return atleta;
        }else{
            throw new UtilizadorNaoExistenteException("O utilizador já existe na lista");
        }
    }
	
    public Colaborador getColaborador(Colaborador colaborador) throws UtilizadorNaoExistenteException {
        if (listagemColaboradores().contains(colaborador)){
            return colaborador;
        }else{
            throw new UtilizadorNaoExistenteException("O utilizador já existe na lista");
        }
    }
    
    public ArrayList<Utilizador> listagemUtilizadores() {
        return new ArrayList<>(listaUtilizadores.values());
    }
    
    public ArrayList<Treinador> listagemTreinadores(){
        ArrayList <Treinador> listaTreinadores = new ArrayList<>();
        for( HashMap.Entry e : listaUtilizadores.entrySet()){
            if(e.getValue() instanceof Treinador)
                listaTreinadores.add((Treinador)e.getValue());
        }
        return listaTreinadores;
    }
    
    public ArrayList<Atleta> listagemAtletas(){
        ArrayList <Atleta> listaAtletas = new ArrayList<>();
        for( HashMap.Entry e : listaUtilizadores.entrySet()){
            if(e.getValue() instanceof Atleta)
                listaAtletas.add((Atleta)e.getValue());
        }
        return listaAtletas;
    }
	
	public ArrayList<Colaborador> listagemColaboradores(){
        ArrayList <Colaborador> listaColaboradores = new ArrayList<>();
        for( HashMap.Entry e : listaUtilizadores.entrySet()){
            if(e.getValue() instanceof Colaborador)
                listaColaboradores.add((Colaborador)e.getValue());
        }
        return listaColaboradores;
    }
    
}


