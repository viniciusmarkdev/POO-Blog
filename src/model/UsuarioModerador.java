package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UsuarioModerador extends Usuario{
	
	private static UsuarioModerador  instancia;
	
    List<Postagem> postagemMod = new ArrayList<>();
	
    
    
   
	
	private  UsuarioModerador() {
		super();
		
	}

	
	private UsuarioModerador(String nome , int id , String email, String dataNascimento, String senha, String senhaConfirm,
			List<Postagem> postagem, Usuario u) {
		super(nome, id , email, dataNascimento, senha, senhaConfirm, postagem, u);
		// TODO Auto-generated constructor stub
	}
	
	public static  UsuarioModerador getInstance (String nome , int id , String email, String dataNascimento, String senha, String senhaConfirm,
			List<Postagem> postagem, Usuario u) {
		
		if(instancia==null) {
			
			instancia = new UsuarioModerador(nome ,  id , email, dataNascimento, senha, senhaConfirm,
					 postagem,  u);
		}
		
		return instancia;
	}
	
	
	public static  UsuarioModerador getInstanceSemParametro () {
		
		if(instancia==null) {
			
			instancia = new UsuarioModerador();
		}
		
		return instancia;
	}
	
	
	
	

   
	public void adicionarPostagem(Postagem postagem)	{
		
		
	postagemMod.add(postagem);

	
	

	
		
	}

	public void mostrarPostagem() {
		
		System.out.println(postagemMod);

	}

	
	
	
    
	
	
	
	
	
	
	
	 

}
