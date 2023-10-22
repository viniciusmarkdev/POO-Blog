
package teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Postagem;

import model.Postagens;
import model.Tema;
import model.Usuario;
import model.UsuarioComum;
import model.UsuarioModerador;

public class CriarUsuario {

	public static void main(String[] args) {
		
		
      
		
		List<Postagem> postagens = new ArrayList<Postagem>();
	  	
      	
		
		Usuario tipo = new UsuarioComum();
		UsuarioComum usuario1 = new UsuarioComum("Marcos", tipo.getId() ,"Marcos@gmail.com", "11-03-2011", "123456789", "123456789",
				postagens, tipo);
		
		
		Tema tema = new Tema();
	    
	    Tema tema1 = new Tema();
		tema.setNome("Flamengo");
		tema1.setNome("santos");
		
		Postagem postagem1 = new Postagem (tema , usuario1);
		Postagem postagem2 = new Postagem(tema1 , usuario1);
	
		postagem1.setDescricao("O Flamengo não é time , o flamengo " + "é seleção");
        postagem2.setDescricao("O santos é o melhor time do mundo");
		
		
			
        Postagens teste = new Postagens();
        
        teste.postar(usuario1, postagem1);
        teste.postar(usuario1, postagem2);
        teste.monstrarPostagensDoUser(usuario1);
      	
        System.out.println();
        System.out.println();
        
        
    	List<Postagem> postagensMod = new ArrayList<Postagem>();
    	
    	Usuario tipoMod = UsuarioModerador.getInstanceSemParametro();
    	Usuario UsuarioMod = UsuarioModerador.getInstance("Zuck" , tipoMod.getId() ,"Zuck@gmail.com", "11-03-1970", 
    			"123456789", "123456789",
				postagensMod, tipoMod);
    	
    	
    	
		Tema temaMod = new Tema();
		temaMod.setNome("Programação");
		Postagem postagemMod = new Postagem (temaMod , tipoMod);
		postagemMod.setDescricao("Oi moa noite , oi moa noite , oi Moa noite , oi moa noite");
		
		
		
		teste.postar(tipoMod, postagemMod);
		
		teste.monstrarPostagensDoUser(tipoMod);
		


	}

}
