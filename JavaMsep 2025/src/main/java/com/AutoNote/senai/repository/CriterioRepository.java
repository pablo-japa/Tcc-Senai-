package com.AutoNote.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.AutoNote.senai.entity.Criterio;

@Repository
public interface CriterioRepository extends JpaRepository<Criterio, Integer> {

	@Query("Select c from Criterio c where c.id_criterio = id_criterio")
	Iterable<Criterio> findByNum_matricula_aluno(Integer id_criterio);

}