/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.io.Serializable;
import java.time.LocalDate;
/**
 *
 * @author 
 */
public class Treinador extends Utilizador implements Serializable{
    //variaveis de instancia
    private int cipa;
    private String nome;
    private LocalDate dataNasc;
    private String escalao;
    private int contactoTlm;
    //construtor
    public Treinador (String user, String passe, int cipa, String nome, LocalDate data_nasc, String escalao, int tlm){
        super(user,passe, nome);
		this.cipa=cipa;
		this.nome=nome;
		this.dataNasc=data_nasc;
		this.escalao=escalao;
        this.contactoTlm= tlm;
    }
	//Métodos seletores
	public int getCipa() {
        return cipa;
    }
	
	public String getNome() {
        return nome;
    }
    	
	public LocalDate getDataNasc() {
        return dataNasc;
    }
	
	public String getFuncao() {
        return escalao;
    }
	
	public int getContactoTlm() {
        return contactoTlm;
    }
	
	
	//Métodos modificadores
	public void setCipa(int cipa) {
        this.cipa = cipa;
    }
	
	public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }
	
	public void setEscalao(String escalao) {
        this.escalao = escalao;
    }
	
	public void setContactoTlm(int contactoTlm) {
        this.contactoTlm = contactoTlm;
    }
}