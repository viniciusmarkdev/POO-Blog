package model;

import java.util.ArrayList;
import java.util.List;

public class Postagens  {
	
	
	
	
	
    // Polimorfismo , eu posso usar um metodo postar 
	// para postar uma PostagemMod ou uma PostagemUser
	//Ou seja , um m�todo que pode assumir duas formas
	//E suportar dois objetos
	
	/*
	 * Apesar do polimorfismo, a JVM
	 * busca o met�do utilizado em tempo de execu��o
	 * , ou seja , de acordo com a classe inst�nciada
	 * ele ir� executar o m�todo espec�ficado.
	 * 
	 */
	
	
  
	
	public void postar(PostagemUser postagem) {
		
	    postagem.adicionar(postagem);
		
		
	}
	
	public void monstrarPostagens(PostagemUser postagem) {
		
		postagem.ListarPostagens();
		
	}
	
	
	
	
}
