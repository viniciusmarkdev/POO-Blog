package model;

import java.util.ArrayList;
import java.util.List;

public class PostagemUser extends Postagem {
	
	private List<Postagem> todasPostagens;
	
	public PostagemUser(Tema tema , Usuario usuario) {
		super(tema, usuario);
		// TODO Auto-generated constructor stub
	}

	
	public void adicionar(Postagem postagem) {
		
		 todasPostagens = new ArrayList<>();
		 todasPostagens.add(postagem);
		
	 
	}
	
	public void ListarPostagens() {
		
		System.out.println(todasPostagens);
	}


	public List<Postagem> getTodasPostagens() {
		return todasPostagens;
	}


	public void setTodasPostagens(List<Postagem> todasPostagens) {
		this.todasPostagens = todasPostagens;
	}
	
	
	
	
	
	
	
	
}
