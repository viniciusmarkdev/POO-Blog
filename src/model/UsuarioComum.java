package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class UsuarioComum extends Usuario  {
	

	
	
	public UsuarioComum(String nome, String email, LocalDate dataNascimento, String senha, String senhaConfirm,
			List<Postagem> postagem , Usuario u) {
		super(nome, email,dataNascimento , senha, senhaConfirm, postagem, u);
	
	}

	
	public  UsuarioComum() {
		
	}
	
	
	
	
	
}
