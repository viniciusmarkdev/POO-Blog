package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Postagem;
import model.Tema;
import model.Usuario;
import model.UsuarioComum;

public class CriarUsuario {
	
	
	public static void main(String[] args) {
		
		
		Tema tema = new Tema();
		tema.setNome("Flamengo");
		Postagem postagem1 = new Postagem(tema);
		postagem1.setDescricao("O flamengo é uma merda");
		postagem1.getDataPostagem();
		
		
	    List<Postagem> postagens = new ArrayList<Postagem>();
	    postagens.add(postagem1);
	    
		
	   
	    
	    Usuario tipo = new  UsuarioComum();
	    Usuario usuario1 = new UsuarioComum(
				"Marcos" ,   "Marcos@gmail.com"
		, "11-03-2011","123456789" , "123456789" , postagens  ,
		tipo);
		
		
	}

}
