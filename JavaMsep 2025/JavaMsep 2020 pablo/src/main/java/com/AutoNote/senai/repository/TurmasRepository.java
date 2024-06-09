package com.AutoNote.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.AutoNote.senai.entity.Turmas;

public interface TurmasRepository extends JpaRepository<Turmas, Integer> {
    
    @Query("SELECT t FROM Turmas t WHERE t.id_turma = :id_turma")
    Iterable<Turmas> findAllByIdTurma(Integer id_turma);
}
