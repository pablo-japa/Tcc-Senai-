package com.AutoNote.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.AutoNote.senai.entity.Competencia;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia, Integer> {
	
 
    @Query("SELECT c FROM Competencia c WHERE c.id_competencia = id_competencia")
    Iterable<Competencia> findByNome( Integer id_competencia);

	@Query("SELECT c FROM Competencia c WHERE c.tipo = 'socioemocional'")
	Iterable<Competencia> findByTipoS();

	@Query("SELECT c FROM Competencia c WHERE c.tipo = 'basica'")
	Iterable<Competencia> findByTipoB();

	@Query("SELECT c FROM Competencia c WHERE c.tipo = 'tecnica'")
	Iterable<Competencia> findByTipoT();
	
}



	
