package com.AutoNote.senai.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Aluno implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_matricula_aluno;
	private String nome;
	private Boolean status_aluno;
	private String email_aluno;
	
	public Aluno() {
		super();
	}

	public Aluno(Integer num_matricula_aluno, String nome, Boolean status_aluno, String email_aluno) {
		super();
		this.num_matricula_aluno = num_matricula_aluno;
		this.nome = nome;
		this.status_aluno = status_aluno;
		this.email_aluno = email_aluno;
	}

	public Integer getNum_matricula_aluno() {
		return num_matricula_aluno;
	}

	public void setNum_matricula_aluno(Integer num_matricula_aluno) {
		this.num_matricula_aluno = num_matricula_aluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getStatus_aluno() {
		return status_aluno;
	}

	public void setStatus_aluno(Boolean status_aluno) {
		this.status_aluno = status_aluno;
	}

	public String getEmail_aluno() {
		return email_aluno;
	}

	public void setEmail_aluno(String email_aluno) {
		this.email_aluno = email_aluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email_aluno, nome, num_matricula_aluno, status_aluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(email_aluno, other.email_aluno) && Objects.equals(nome, other.nome)
				&& Objects.equals(num_matricula_aluno, other.num_matricula_aluno)
				&& Objects.equals(status_aluno, other.status_aluno);
	}

	@Override
	public String toString() {
		return "Aluno [num_matricula_aluno=" + num_matricula_aluno + ", nome=" + nome + ", status_aluno=" + status_aluno
				+ ", email_aluno=" + email_aluno + "]";
	}
	
	

	

}