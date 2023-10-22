package model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioComum extends Usuario {

	/*
	 * 
	 *
	 * 
	 * Uma classe pode, sim, ter mais de um construtor, isso é conhecido como uma
	 * sobrecarga (overloaded) de construtor. Mas, assim como nos demais métodos,
	 * isso funcionará contanto que os construtores não tenham a mesma quantidade de
	 * parâmetro. Por exemplo, se eu tenta.
	 * 
	 * 
	 * 
	 */
	
   
	
	
	
	
	List<Postagem> postagemUser =  new ArrayList<>();
	

	
	public UsuarioComum(String nome,int id , String email, String dataNascimento, String senha, String senhaConfirm,
			
			List<Postagem> postagem, Usuario u) {
	
		super(nome, id , email, dataNascimento, senha, senhaConfirm, postagem, u);

	}

	public UsuarioComum() {

		
	
	}
	
	
   public void adicionarPostagem(Postagem p)	{
	
	
	 postagemUser.add(p);
	 
	 
	}
   
   public void mostrarPostagem() {
	   
	 
	  System.out.println(postagemUser);
	  
	  
   }

   
   
      
	

	
	

}
