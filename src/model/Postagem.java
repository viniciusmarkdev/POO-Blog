package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Postagem {
	
	
	 Date horaPostagem = new Date();
	 
	 Tema tema;
	 
	 Date horaAtualizacao = new Date();
	 
	 String descricao;
	 
	 
	 
	
	 @Override
	public String toString() {
		return "\n"+"Postagem :"+"\n"+"Hora de postagem :"+ horaPostagem+ "\n" +"tema : " + tema +"\n"+
   "Hora da Atualizacao : "
	+ horaAtualizacao+"\n"
				+ "descricao : " + descricao ;
	}

	public Postagem(Tema tema) {
		 
		 this.tema = tema;
		 
	 }
	 
	
	

	public Date getHoraPostagem() {
		return horaPostagem;
	}

	public void setHoraPostagem(Date horaPostagem) {
		this.horaPostagem = horaPostagem;
	}

	public Date getHoraAtualizacao() {
	
		return horaAtualizacao;
	}

	public void setHoraAtualizacao(Date horaAtualizacao) {
		this.horaAtualizacao = horaAtualizacao;
	}

	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	 
	 

	 
	 
}
