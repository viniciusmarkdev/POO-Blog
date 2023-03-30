package model;


import java.util.Date;


public  class Postagem{
	
	
	private Date horaPostagem = new Date();
	 
	private Tema tema;
	 
	private  Date horaAtualizacao = new Date();
	 
	private String descricao;
	 
	private Usuario usuario; 
	
	
	@Override
	public String toString() {
		return "\n"+"Postagem :"+"\n"+"Hora de postagem :"+ horaPostagem+ "\n" +"tema : " + tema +"\n"+
   "Hora da Atualizacao : "
	+ horaAtualizacao+"\n"
				+ "descricao : " + descricao ;
	}

	public Postagem(Tema tema , Usuario usuario) {
		 
		 this.tema = tema;
		 this.usuario = usuario;
		 
		 
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	 
	 
   
	 
	 
}
