package model;

import java.util.ArrayList;
import java.util.List;

public class Postagens  {
	
	
	
	
	
    // Polimorfismo , eu posso usar um metodo postar 
	// para postar uma PostagemMod ou uma PostagemUser
	//Ou seja , um método que pode assumir duas formas
	//E suportar dois objetos
	
	/*
	 * Apesar do polimorfismo, a JVM
	 * busca o metódo utilizado em tempo de execução
	 * , ou seja , de acordo com a classe instânciada
	 * ele irá executar o método específicado.
	 * 
	 */
	
	
  
	
	public void postar(Usuario usuario , Postagem postagem) {
		
	  
		usuario.adicionarPostagem(postagem);
	
		
		
	}
	
	  public void monstrarPostagensDoUser(Usuario usuario) {
		
	   
		
			
			usuario.mostrarPostagem();
			
	
		
	}
	  
	public void listarTodasPostagens(Usuario usuario ) {
		
		usuario.mostrarTodasAsPostagem();
	}
	

	
	
	
	
}
