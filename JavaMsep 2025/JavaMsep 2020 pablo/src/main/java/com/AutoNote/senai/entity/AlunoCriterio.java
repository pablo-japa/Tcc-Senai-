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
public class AlunoCriterio implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_alunoCriterio;
	private Integer id_criterioAluno;
	private Integer num_matricula_aluno_capacidade;
	@Enumerated(EnumType.STRING)
	private Avaliado avaliado;
	private String data; // Altera o tipo de dados para java.sql.Date

	public AlunoCriterio() {
		super();
	}

	public AlunoCriterio(Integer id_alunoCriterio, Integer id_criterioAluno, Integer num_matricula_aluno_capacidade,
			Avaliado avaliado, String data) {
		super();
		this.id_alunoCriterio = id_alunoCriterio;
		this.id_criterioAluno = id_criterioAluno;
		this.num_matricula_aluno_capacidade = num_matricula_aluno_capacidade;
		this.avaliado = avaliado;
		this.data = data;
	}

	public Integer getId_alunoCriterio() {
		return id_alunoCriterio;
	}

	public void setId_alunoCriterio(Integer id_alunoCriterio) {
		this.id_alunoCriterio = id_alunoCriterio;
	}

	public Integer getId_criterioAluno() {
		return id_criterioAluno;
	}

	public void setId_criterioAluno(Integer id_criterioAluno) {
		this.id_criterioAluno = id_criterioAluno;
	}

	public Integer getNum_matricula_aluno_capacidade() {
		return num_matricula_aluno_capacidade;
	}

	public void setNum_matricula_aluno_capacidade(Integer num_matricula_aluno_capacidade) {
		this.num_matricula_aluno_capacidade = num_matricula_aluno_capacidade;
	}

	public Avaliado getAvaliado() {
		return avaliado;
	}

	public void setAvaliado(Avaliado avaliado) {
		this.avaliado = avaliado;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(avaliado, data, id_alunoCriterio, id_criterioAluno, num_matricula_aluno_capacidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AlunoCriterio other = (AlunoCriterio) obj;
		return avaliado == other.avaliado && Objects.equals(data, other.data)
				&& Objects.equals(id_alunoCriterio, other.id_alunoCriterio)
				&& Objects.equals(id_criterioAluno, other.id_criterioAluno)
				&& Objects.equals(num_matricula_aluno_capacidade, other.num_matricula_aluno_capacidade);
	}

	enum Avaliado {
		SIM("SIM"), NAO("NAO"), AVALIAR("AVALIAR");

		private String descricao;

		Avaliado(String descricao) {
			this.descricao = descricao;
		}

		public String getDescricao() {
			return descricao;
		}
	}
}
