package com.AutoNote.senai.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "professor")
public class Professor implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfessor;
	private String cpfProfessor;
	private String nome;
	private String email;
	private String senha;
	private Date dataRegistro;
	private Date ultimoAcesso;

	public Professor() {
		super();
	}

	// Construtor
	public Professor(Integer idProfessor, String cpfProfessor, String nome, String email, String senha, Date dataRegistro,
			Date ultimoAcesso) {
		super();
		this.idProfessor = idProfessor;
		this.cpfProfessor = cpfProfessor;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataRegistro = dataRegistro;
		this.ultimoAcesso = ultimoAcesso;
	}

	// Getters e Setters
	public Integer getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getCpfProfessor() {
		return cpfProfessor;
	}

	public void setCpfProfessor(String cpfProfessor) {
		this.cpfProfessor = cpfProfessor;
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

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Date getUltimoAcesso() {
		return ultimoAcesso;
	}

	public void setUltimoAcesso(Date ultimoAcesso) {
		this.ultimoAcesso = ultimoAcesso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpfProfessor, dataRegistro, email, idProfessor, nome, senha, ultimoAcesso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(cpfProfessor, other.cpfProfessor) && Objects.equals(dataRegistro, other.dataRegistro)
				&& Objects.equals(email, other.email) && idProfessor == other.idProfessor
				&& Objects.equals(nome, other.nome) && Objects.equals(senha, other.senha)
				&& Objects.equals(ultimoAcesso, other.ultimoAcesso);
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", cpfProfessor=" + cpfProfessor + ", nome=" + nome
				+ ", email=" + email + ", senha=" + senha + ", dataRegistro=" + dataRegistro + ", ultimoAcesso="
				+ ultimoAcesso + "]";
	}

}
