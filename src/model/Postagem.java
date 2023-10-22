package model;


import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public  class Postagem{
	
	
	private String horaPostagem ;
	
	private  Long  idPostagem;
	
	 
	private Tema tema;
	 
	private   Date horaAtualizacao = new Date();
	 
	private String descricao;
	 
	private Usuario usuario; 
	
	private List<Date> dataPostagem;
	
    
	
	
	
	
	

	
	@Override
	public String toString() {
		return "\n"+"Postagem :"+"\n"+"Hora de postagem :"+ this.addDataPostagem()+"\n" +"tema : " + tema +"\n"+
   "Hora da Atualizacao : "
	+ horaAtualizacao+"\n"
				+ "descricao : " + descricao ;
	}
	
	public Date addDataPostagem() {
		
	    Locale.setDefault(new Locale("pt","Brazil"));
		
		Date hoje = new Date();
		
		horaPostagem  = DateFormat.getInstance().format(hoje);
			
		
		
		dataPostagem = new ArrayList<Date>();
		
		dataPostagem.add(hoje);
	    return dataPostagem.get(0) ;
		
	}

	public Postagem(Tema tema , Usuario usuario) {
		 
		 this.tema = tema;
		 this.usuario = usuario;
		 
		 
	 }
	 
	

	

	public Long getIdPostagem() {
		return idPostagem;
	}

	public void setIdPostagem(Long idPostagem) {
		this.idPostagem = idPostagem;
	}

	public String getHoraPostagem() {
		return horaPostagem;
	}

	public void setHoraPostagem(String horaPostagem) {
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
