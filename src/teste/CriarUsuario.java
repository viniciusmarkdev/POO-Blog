package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Postagem;
import model.PostagemUser;
import model.Postagens;
import model.Tema;
import model.Usuario;
import model.UsuarioComum;
import model.UsuarioModerador;

public class CriarUsuario {

	public static void main(String[] args) {

		
		List<Postagem> postagens = new ArrayList<Postagem>();
	  	
      	
		
		Usuario tipo = new UsuarioComum();
		Usuario usuario1 = new UsuarioComum("Marcos", "Marcos@gmail.com", "11-03-2011", "123456789", "123456789",
				postagens, tipo);
		Tema tema = new Tema();
	
		tema.setNome("Flamengo");
		PostagemUser postagem1 = new PostagemUser(tema , usuario1);
		
			
        Postagens teste = new Postagens();
      	
      	
        
		teste.postar(postagem1);
	    teste.monstrarPostagens(postagem1);
		
		
		postagem1.setDescricao("O Flamengo não é time , o flamengo " + "é seleção");

		
	


	

	

	}

}
