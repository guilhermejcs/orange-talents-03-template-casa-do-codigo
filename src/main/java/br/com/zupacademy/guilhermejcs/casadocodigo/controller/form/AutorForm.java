package br.com.zupacademy.guilhermejcs.casadocodigo.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.zupacademy.guilhermejcs.casadocodigo.model.Autor;

public class AutorForm {
	
	@NotNull(message = "O campo nome não pode ser nulo")
	@NotEmpty(message = "O campo nome não pode ser vazio")
	private String nome;
	@NotNull(message = "O campo e-mail não pode ser nulo")
	@NotEmpty(message = "O campo e-mail não pode ser vazio")
	@Email(message = "E-mail inválido")
	private String email;
	@NotNull(message = "O campo descrição não pode ser nulo")
	@NotEmpty(message = "O campo descrição não pode ser vazio")
	@Size(max = 400, message = "O campo descrição não pode ter mais de 400 caracteres")
	private String descricao;
	
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Autor converter() {
		return new Autor(nome, email, descricao);
	}
	
}
