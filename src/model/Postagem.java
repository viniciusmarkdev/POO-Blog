package model;

import java.time.LocalDate;

public class Postagem {
	
	
	 LocalDate dataPostagem;
	 Tema tema;
	 LocalDate dataAtualizacao;
	 String descricao;
	
	 public Postagem(Tema tema) {
		 
		 this.tema = tema;
	 }
	 
	 public LocalDate getDataPostagem() {
		return dataPostagem;
	}
	public void setDataPostagem(LocalDate dataPostagem) {
		this.dataPostagem = dataPostagem;
	}
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	 
	 

	 
	 
}
