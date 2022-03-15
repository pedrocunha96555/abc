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
public class Sistema implements Serializable{
    private ListaUtilizadores listaUtilizadores;
    private Utilizador utilizadorLigado;
    private ListaEventos listaEventos;

    public Sistema(){
        listaUtilizadores = new ListaUtilizadores();
    }
       
    public ListaUtilizadores getListaUtilizadores(){
        return listaUtilizadores;
    }
    
    public ListaEventos getListaEventos(){
        return listaEventos;
    }
    
    public void setListaUtilizadores(ListaUtilizadores listaUtilizadores) {
        this.listaUtilizadores = listaUtilizadores;
    }

    public void setUtilizadorLigado(Utilizador utilizadorLigado) {
        this.utilizadorLigado = utilizadorLigado;
    }
 
    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }
    
    public boolean autenticarUtilizador(String username, String password) {        
        if (listaUtilizadores.existe(username)) {
            try{
                Utilizador u = listaUtilizadores.getUtilizador(username);                
                if (u.getPassword().equals(password)){
                    utilizadorLigado = u;
                    return true;
                }                
            }catch (Exception e) {}                        
        }        
        return false;        
    }
    
    public void inicializar() throws ListaUtilizadores.UtilizadorDuplicadoException {
        listaUtilizadores.adicionarUtilizador(new Administrador("admin", "admin", "admin"));
        listaUtilizadores.adicionarUtilizador(new Utilizador("user1", "1234", "joao"));
        listaUtilizadores.adicionarUtilizador(new Utilizador("user2", "1234", "maria"));        
    }
    
    public void terminar() {
        System.exit(0);
    }  
}
