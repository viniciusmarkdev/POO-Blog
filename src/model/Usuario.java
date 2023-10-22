package model;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
 * A classe Usuario n�o pode ser inst�nciada , somente 
 * as subclasses que herda esse classe Usuario
 * 
 * */


/*
 * 
 * Se h�  um elemento importante, possui comportamentos e atributos
,  ele deveria ser representado como um Objeto! 
   Podemos criar uma classe e definindo os 
   atributos e comportamentos espec�ficos desse novo tipo.
   A classe criada � a classe UsuarioComum e UsuarioModerador
 * 
 * /
 


/*
 * Devemos pensar em nosso c�digo 
 * pensando como ser� sua evolu��o no futuro
 * 
 *  
 * */

public abstract class Usuario {
	
	private int id;

	private String nome;
	
	private String email;
	
    private	String dataNascimento ;
	
	
	private String senha;
	
	private String senhaConfirm;

	protected List<Postagem> postagem;
	
	Postagem postagemU;
	
	

	@Override
	public String toString() {
		
		return "Usuario : "+"\n"+"Nome :" + nome +"\n" +"Id : "+id+ "\n"+"E-mail : "+ email +"\n"+ "dataNascimento : " + dataNascimento +"\n"+ "senha :" + senha
				+"\n"+"senhaConfirm : "+ senhaConfirm +"\n"+"postagem " + postagem ;
	}

	public Usuario(String nome, int id , String email, String dataNascimento, String senha, String senhaConfirm,
			List<Postagem> postagem, Usuario u) {

		this.nome = nome;
		this.id = id;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.senha = senha;
		this.senhaConfirm = senhaConfirm;
		this.postagem = postagem;
		
	
		  
		  
	  if (u instanceof UsuarioComum )  {

	 System.out.println("Voc� criou um usuario comum com nome de "
	 		+ ""+ this.nome);
	  
	     id++;
	 
	 
	
	 
		
		}else if(u instanceof UsuarioModerador) {
			
		
			

		
		System.out.println("Voc� criou um usuario moderador ");
		
		
			
		
		}

		}
	
	public Usuario() {
		
	}

	
	//Evitar de deixar infroma��es t�o espec�ficas em nosso
	//moldes

	

	/*
	 * Encapsulamento - a classe que inst�nciar as classes que herdam essa classe
	 * Abstrata ter� acesso somente aos m�todos getters e setters.
	 * 
	 * 
	 * N�o sei o que o c�digo faz.Somente lhe implemento
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
	
	

	public int getId() {
		return id;
	}

	public void setId(int  id) {
		this.id = id;
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
 	
   
 
 
		public Postagem getPostagemU() {
		return postagemU;
	}

	public void setPostagemU(Postagem postagemU) {
		this.postagemU = postagemU;
	}
   
  

	
	
	
	public abstract void mostrarPostagem();

	public abstract void adicionarPostagem(Postagem postagem);
	
 
	

}
