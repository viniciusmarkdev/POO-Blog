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
		postagem1.setDescricao("O Flamengo não é time , o flamengo "
				+ "é seleção");
		
		
	
		
		
		
	    List<Postagem> postagens = new ArrayList<Postagem>();
	   
	    postagens.add(postagem1);
	  
	  
		
	   
	    
	    Usuario tipo = new  UsuarioComum();
	    Usuario usuario1 = new UsuarioComum(
		"Marcos" ,   "Marcos@gmail.com",
		"11-03-2011","123456789" , "123456789", 
		postagens,
		tipo);
	    
	    
	    
	    
	    System.out.println(usuario1);
	    
	    
		Tema tema2 = new Tema();
		tema.setNome("teste");
		
		Postagem postagem2 = new Postagem(tema2);
		postagem2.setDescricao("Testando postagem2");
	    List<Postagem> postagemTeste = new ArrayList<Postagem>();
		
	    postagemTeste.add(postagem2);
	    
	    Usuario tipo1 = new UsuarioComum();
	    Usuario carlos = 
	    		new UsuarioComum(
	    				"Vinicius" ,   "Vinicius@gmail.com",
	    				"11-03-2011","123456711" , "123456711", 
	    				postagemTeste,
	    				tipo1);

	}

}
