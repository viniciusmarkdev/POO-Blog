package model;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
 * A classe Usuario não pode ser instânciada
 * 
 * */

public abstract class Usuario {

	private String nome;
	private String email;
    private	String dataNascimento ;
	
	
	private String senha;
	private String senhaConfirm;

	private List<Postagem> postagem;


	
	
	

	public Usuario(String nome, String email, String dataNascimento, String senha, String senhaConfirm,
			List<Postagem> postagem, Usuario u) {

		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.senhaConfirm = senhaConfirm;
		this.postagem = postagem;

		if (u instanceof UsuarioComum) {

			System.out.println("Você criou um usuario comum ");
		} else {

		
				System.out.println("Você criou um usuario moderador ");
			}

		}
	
	public Usuario() {
		
	}

	

	public void mostrarPostagem() {

		System.out.println("Seja bem vindo ao faceback : " + nome);
		System.out.println("Comemntou  " + postagem);

	}

	/*
	 * Encapsulamento - a classe que instân0 ciar as classes que herdam essa classe
	 * Abstrata terá acesso somente aos métodos getters e setters.
	 * 
	 * 
	 * Não sei o que o código faz somente o implemento.
	 * 
	 * 
	 * 
	 */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		
		Locale.setDefault(new Locale("pt","Brazil"));
		
		Date hoje = new Date();
		dataNascimento = DateFormat.getInstance().format(hoje);
		
		return dataNascimento;	
		
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSenhaConfirm() {
		return senhaConfirm;
	}

	public void setSenhaConfirm(String senhaConfirm) {
		this.senhaConfirm = senhaConfirm;
	}

	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}

}
