package model;

import java.util.Date;

public abstract class Usuario  {
	
	
	String nome;
	String email;
	Date dataNascimento;
	Long senha;
	Long senhaConfirm;
	
	
	
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
	public Long getSenha() {
		return senha;
	}
	public void setSenha(Long senha) {
		this.senha = senha;
	}
	public Long getSenhaConfirm() {
		return senhaConfirm;
	}
	public void setSenhaConfirm(Long senhaConfirm) {
		this.senhaConfirm = senhaConfirm;
	}
	
	
	

}
