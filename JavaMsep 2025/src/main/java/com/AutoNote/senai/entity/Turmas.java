package com.AutoNote.senai.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turmas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_turma;
    private String periodo;
    private String nome;
    private String curso_turma; 
    private Integer num_matricula_aluno;

    public Turmas(Integer id_turma, String periodo, String nome, String curso_turma, Integer num_matricula_aluno) {
        super();
        this.id_turma = id_turma;
        this.periodo = periodo;
        this.nome = nome;
        this.curso_turma = curso_turma;
        this.num_matricula_aluno = num_matricula_aluno;
    }

    public Turmas() {
        super();
    }

    public Integer getId_turma() {
        return id_turma;
    }

    public void setId_turma(Integer id_turma) {
        this.id_turma = id_turma;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso_turma() {
        return curso_turma;
    }

    public void setCurso_turma(String curso_turma) {
        this.curso_turma = curso_turma;
    }

    public Integer getNum_matricula_aluno() {
        return num_matricula_aluno;
    }

    public void setNum_matricula_aluno(Integer num_matricula_aluno) {
        this.num_matricula_aluno = num_matricula_aluno;
    }

    @Override
    public String toString() {
        return "Turmas [id_turma=" + id_turma + ", periodo=" + periodo + ", nome=" + nome + ", curso_turma="
                + curso_turma + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_turma, nome, periodo, curso_turma);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Turmas other = (Turmas) obj;
        return Objects.equals(id_turma, other.id_turma) && Objects.equals(nome, other.nome)
                && Objects.equals(periodo, other.periodo) && Objects.equals(curso_turma, other.curso_turma);
    }
}
