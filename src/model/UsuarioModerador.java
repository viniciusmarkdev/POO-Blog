package model;

import java.util.Date;
import java.util.List;

public class UsuarioModerador  extends  Usuario{
	
	
	
	public UsuarioModerador(String nome, String email, Date dataNascimento,
			
			String senha, String senhaConfirm,
			List<Postagem> postagem) {
		super(nome, email, dataNascimento, senha, senhaConfirm, postagem , Usuario u);
		
	}

	
	public void Mensagem() {
		
		System.out.println("Você criou um Usuario do tipo moderador");
	}
	
	
	
	
	
	
	
	
	
	
	 

}
