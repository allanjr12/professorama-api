package com.clearsys.professorama.api.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.clearsys.professorama.api.enums.PerfilEnum;

@Entity
@Table(name = "professor")
public class Professor implements Serializable{
	
	/**
	 * Entidade responsável por representar um professor no sistema 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String materia;
	private String usuario;
	private String senha;
	private PerfilEnum perfil;
	
	public Professor() {}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "professor_nome", nullable = false)
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="professor_materia", nullable = false)
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Column(name = "professor_usuario", nullable = false)
	public String getUsuario() {
		return usuario;
	}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "perfil", nullable = false)
	public PerfilEnum getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}
	
	@Column(name = "professor_senha", nullable = false)
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", materia=" + materia + ", usuario=" + usuario + ", senha="
				+ senha + "]";
	}
	
}
