/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Administrador;
import backend.Atleta;
import backend.Calendario;
import backend.Colaborador;
import backend.Evento;
import backend.Jogo;
import backend.Serializacao;
import backend.Sistema;
import backend.ListaEventos;
import backend.ListaUtilizadores;
import backend.Treinador;
import backend.Treino;
import backend.Utilizador;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Iniciar {
        public static void main(String[] args) throws ListaUtilizadores.UtilizadorDuplicadoException, ClassNotFoundException, ListaEventos.EventoDuplicadoException {
            try {
                getConnection();    
                ArrayList<String> lista = new ArrayList<String>();
                lista=get();
                listar(lista);
            } catch (Exception ex) {
                Logger.getLogger(Iniciar.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
        public static ArrayList<String> get() throws Exception{
            try{
                Connection con = getConnection();
                PreparedStatement statement = con.prepareStatement("SELECT * FROM atletas");
                ResultSet result=statement.executeQuery();
                ArrayList<String> array=new ArrayList<String>();
                while(result.next()){
                    System.out.println(result.getString("first"));
                    System.out.println("");
                    System.out.println(result.getString("last"));
                    array.add(result.getString("last"));
                }
                return array;
        }catch(Exception e){System.out.println(e);}
        return null;
        }
        
    public static void listar(ArrayList<String> lista){
        //ArrayList <String> lista =new ArrayList();
        for (String str : lista){
            System.out.println(str);      
        }
    }
    public static Connection getConnection() throws Exception{
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://sql11.freesqldatabase.com/sql11478410";
            String username = "sql11478410";
            String password = "PiYhihCm7q";
            Class.forName(driver);
            Connection conn = null;
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
            return conn;
        } catch(Exception e){System.out.println(e);}

         return null;
 }   
}