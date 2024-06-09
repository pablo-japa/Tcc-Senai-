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
public class Criterio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_criterio;
	private Integer id_competencia;
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	private String nome;

	public Criterio() {
		super();
	}

	public Criterio(Tipo tipo, String nome, Integer id_criterio, Integer id_competencia){
		super();
		this.id_criterio = id_criterio;
		this.id_competencia = id_competencia;
		this.tipo = tipo;
		this.nome = nome;
	}

	public Integer getId_Criterio() {
		return id_criterio;
	}

	public void setId_Criterio(Integer id_criterio) {
		this.id_criterio = id_criterio;
	}

	public Integer getId_competencia() {
		return id_competencia;
	}

	public void setId_competencia(Integer id_competencia) {
		this.id_competencia = id_competencia;
	}

	public Tipo getTipoCriticidades() {
		return tipo;
	}

	public void setTipoCriticidades(Tipo tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_criterio, id_competencia, nome,
				tipo);
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    Criterio other = (Criterio) obj;
	    return Objects.equals(id_criterio, other.id_criterio) &&
	           Objects.equals(id_competencia, other.id_competencia) &&
	           Objects.equals(nome, other.nome) &&
	           tipo == other.tipo;
	}


	@Override
	public String toString() {
		return "Criterio [id_Criterio=" + id_criterio + ", id_competencia=" + id_competencia + ", tipoCriticidades="
				+ tipo + ", nome=" + nome;
	}

	public enum Tipo {
		Critica, Desejada;


	}
}
