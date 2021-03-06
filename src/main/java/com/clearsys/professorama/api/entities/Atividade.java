package com.clearsys.professorama.api.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atividade")
public class Atividade implements Serializable {

	/**
	 * Entidade responsável por representar uma atividade no sistema
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String materia;
	private String serie;
	private String dataInicio;
	private String dataEntrega;
	private String descricao;

	public Atividade() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "materia", nullable = false)
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Column(name = "serie")
	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}


	@Column(name = "data_entrega", nullable = false)
	public String getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(String dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	@Column(name = "descricao", nullable = false)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Atividade [id=" + id + ", materia=" + materia + ", serie=" + serie + ", dataInicio=" + dataInicio
				+ ", dataEntrega=" + dataEntrega + ", descricao=" + descricao + "]";
	}

}
