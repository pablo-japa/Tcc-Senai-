package com.AutoNote.senai.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.AutoNote.senai.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, String> {
    
    @Query("SELECT c FROM Curso c WHERE c.nomeCurso = :nomeCurso")
    Iterable<Curso> findAllByNomeCurso(String nomeCurso);
}
