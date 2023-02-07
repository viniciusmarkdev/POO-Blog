package model;

import java.util.Date;

public abstract class Usuario  {
	
	
	public static void main(String[] args) {
		
		System.out.println("Criação do Model de Usuario");
	}
	
 private	String nome;
 private	String email;
 private	Date dataNascimento;
 private 	String senha;
 private	String senhaConfirm;
	
	
	public Usuario(String nome , String
			email , Date dataNascimento , String senha , 
			String senhaConfirm ) {
		
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.senhaConfirm = senhaConfirm;
		
	}
	
	
	/*
	 * Encapsulamento - a classe que instânciar
	 * as classes que herdam essa classe
	 * Abstrata terá acesso somente aos métodos
	 * getters e setters.
	 * 
	 * 
	 * */
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSenhaConfirm() {
		return senhaConfirm;
	}
	public void setSenhaConfirm(String senhaConfirm) {
		this.senhaConfirm = senhaConfirm;
	}
	
	
	

}
