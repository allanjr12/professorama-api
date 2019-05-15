package com.clearsys.professorama.api.dtos;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class CadastroAlunoDto {

	private long id;
	private String nivelEscolar;
	private String nome;
	private String senha;
	private int serie;
	private String usuario;
	
	public CadastroAlunoDto() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@NotNull(message = "O campo nome não pode ser vazio")
	@Length(min = 3, max = 200, message = "Nome deve conter entre 2 e 200 caracteres." )
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@NotNull(message = "O campo usuário não pode ser vazio")
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@NotNull(message = "O campo RA não pode ser vazio")
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@NotNull(message = "O campo nível escolar não pode ser vazio")
	public String getNivelEscolar() {
		return nivelEscolar;
	}

	public void setNivelEscolar(String nivelEscolar) {
		this.nivelEscolar = nivelEscolar;
	}
	
	@NotNull(message = "O campo série não pode ser vazio")
	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {
		return "CadastroAlunoDto [id=" + id + ", nivelEscolar=" + nivelEscolar + ", nome=" + nome + ", senha=" + senha
				+ ", serie=" + serie + ", usuario=" + usuario + "]";
	}

	
	
}