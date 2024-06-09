package com.AutoNote.senai.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String nomeCurso;
    private String descricao;
    private int cargaHorariaHoras;

    public Curso() {
        super();
    }

    public Curso(String nomeCurso, String descricao, int cargaHorariaHoras) {
        super();
        this.nomeCurso = nomeCurso;
        this.descricao = descricao;
        this.cargaHorariaHoras = cargaHorariaHoras;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHorariaHoras() {
        return cargaHorariaHoras;
    }

    public void setCargaHorariaHoras(int cargaHorariaHoras) {
        this.cargaHorariaHoras = cargaHorariaHoras;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargaHorariaHoras, descricao, nomeCurso);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        return cargaHorariaHoras == other.cargaHorariaHoras && Objects.equals(descricao, other.descricao)
                && Objects.equals(nomeCurso, other.nomeCurso);
    }

    @Override
    public String toString() {
        return "Curso [nomeCurso=" + nomeCurso + ", descricao=" + descricao + ", cargaHorariaHoras="
                + cargaHorariaHoras + "]";
    }
}
