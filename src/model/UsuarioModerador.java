package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsuarioModerador  extends  Usuario{
	
	List<List<Postagem>> todasPostagens = new ArrayList<>();
    List<Postagem> postagemMod = new ArrayList<>();
	List<Postagem> postagemUser =  new ArrayList<>();
	
	public UsuarioModerador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioModerador(String nome, String email, String dataNascimento, String senha, String senhaConfirm,
			List<Postagem> postagem, Usuario u) {
		super(nome, email, dataNascimento, senha, senhaConfirm, postagem, u);
		// TODO Auto-generated constructor stub
	}
	
	

	


    @Override
	public void adicionarPostagem(Postagem postagem)	{
		
		
	      
	 postagemUser.addAll(postagem.getUsuario().getPostagem());
	 postagemMod.add(postagem);
	 
	 todasPostagens.add(postagemUser);
	 todasPostagens.add(postagemMod);
	 
		
	}
	
	@Override
	public void mostrarPostagem() {
		
		System.out.println(postagemMod);

	}
	
	
    public void mostrarTodasAsPostagem() {
		
		System.out.println(todasPostagens);

	}
	
	
	
	
	
	
	
	
	 

}
