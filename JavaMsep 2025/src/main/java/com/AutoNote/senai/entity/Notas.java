package com.AutoNote.senai.entity;

import java.io.Serializable;
import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Notas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNota;
    private String nome_aluno;
    private Integer nota;
    private String dia_hoje;
    
	public Notas() {
		super();
	}

	public Notas(Integer idNota, String nome_aluno, Integer nota, String dia_hoje) {
		super();
		this.idNota = idNota;
		this.nome_aluno = nome_aluno;
		this.nota = nota;
		this.dia_hoje = dia_hoje;
	}

	public Integer getIdNota() {
		return idNota;
	}

	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getDia_hoje() {
		return dia_hoje;
	}

	public void setDia_hoje(String dia_hoje) {
		this.dia_hoje = dia_hoje;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dia_hoje, idNota, nome_aluno, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notas other = (Notas) obj;
		return Objects.equals(dia_hoje, other.dia_hoje) && Objects.equals(idNota, other.idNota)
				&& Objects.equals(nome_aluno, other.nome_aluno) && Objects.equals(nota, other.nota);
	}

	@Override
	public String toString() {
		return "Notas [idNota=" + idNota + ", nome_aluno=" + nome_aluno + ", nota=" + nota + ", dia_hoje=" + dia_hoje
				+ "]";
	}

    
    
}
