package com.AutoNote.senai.entity;

import java.io.Serializable;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Competencia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_competencia;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private String nome;
	private String descricao;



	public Competencia() {
		super();
	}



	public Competencia(Integer id_competencia, Tipo tipo, String nome, String descricao) {
		super();
		this.id_competencia = id_competencia;
		this.tipo = tipo;
		this.nome = nome;
		this.descricao = descricao;
	}



	public Integer getId_competencia() {
		return id_competencia;
	}



	public void setId_competencia(Integer id_competencia) {
		this.id_competencia = id_competencia;
	}



	public Tipo getTipo() {
		return tipo;
	}



	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	@Override
	public int hashCode() {
		return Objects.hash(descricao, id_competencia, nome, tipo);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competencia other = (Competencia) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id_competencia, other.id_competencia)
				&& Objects.equals(nome, other.nome) && tipo == other.tipo;
	}


	@Override
	public String toString() {
		return "Competencia [id_competencia=" + id_competencia + ", tipo=" + tipo + ", nome=" + nome + ", descricao="
				+ descricao + "]";
	}



	enum Tipo {

		tecnica("Tecnico"), basica("Basico"), socioemocional("SocioEmocional");

		private String descricao;

		Tipo(String descricao) {

			this.descricao = descricao;

		}

		public String getDescricao() {

			return descricao;

		}
	}

}
