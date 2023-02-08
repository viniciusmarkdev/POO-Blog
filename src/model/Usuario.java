package model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/*
 * A classe Usuario n�o pode ser inst�nciada
 * 
 * */

public abstract class Usuario {

	private String nome;
	private String email;
	private LocalDate dataNascimento;
	private String senha;
	private String senhaConfirm;

	private List<Postagem> postagem;

	private boolean tipoDeUsuario;

	public Usuario(String nome, String email, LocalDate dataNascimento, String senha, String senhaConfirm,
			List<Postagem> postagem, Usuario u) {

		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.senhaConfirm = senhaConfirm;
		this.postagem = postagem;

		if (u instanceof UsuarioComum) {

			System.out.println("Voc� criou um usuario comum ");
		} else {

		
				System.out.println("Voc� criou um usuario moderador ");
			}

		}
	
	public Usuario() {
		
	}

	

	public void mostrarPostagem() {

		System.out.println("Seja bem vindo ao faceback : " + nome);
		System.out.println("Comemntou  " + postagem);

	}

	/*
	 * Encapsulamento - a classe que inst�n0 ciar as classes que herdam essa classe
	 * Abstrata ter� acesso somente aos m�todos getters e setters.
	 * 
	 * 
	 * N�o sei o que o c�digo faz somente o implemento.
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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
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
