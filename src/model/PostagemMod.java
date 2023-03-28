package model;

import java.util.ArrayList;
import java.util.List;

public class PostagemMod  extends Postagem{

	
	List<List<Postagem>> todasPostagensMod;
	
	public PostagemMod(Tema tema , Usuario usuario) {
		super(tema, usuario);
		// TODO Auto-generated constructor stub
	}

	
      
	public void adicionar(Postagem postagem) {
		
		 todasPostagensMod = new ArrayList<>();
		
		List<Postagem> todasPostagens =  new ArrayList<>();
		todasPostagensMod.add(todasPostagens);
		
	
	}
	
        public void ListarPostagens() {
		
		System.out.println(todasPostagensMod);
	}



		public List<List<Postagem>> getTodasPostagensMod() {
			return todasPostagensMod;
		}



		public void setTodasPostagensMod(List<List<Postagem>> todasPostagensMod) {
			this.todasPostagensMod = todasPostagensMod;
		}

	
	  
	
	
}
