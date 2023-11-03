package br.com.cotiinformatica.entities;

import java.util.UUID;

public class Usuario {

	// atributos
	private UUID idusuario;
	private String nome;
	private String email;
	private String senha;
	
	// método construtor
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	// método construtor com argumentos
	public Usuario(UUID idusuario, String nome, String email, String senha) {
		this.idusuario = idusuario;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	// propriedades
	public UUID getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(UUID idusuario) {
		this.idusuario = idusuario;
	}

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

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	// sobrescrita do método toString
	@Override
	public String toString() {
		return "Usuario [idusuario=" + idusuario + ", nome=" + nome + ", email=" + email + ", senha=" + senha + "]";
	}
}
