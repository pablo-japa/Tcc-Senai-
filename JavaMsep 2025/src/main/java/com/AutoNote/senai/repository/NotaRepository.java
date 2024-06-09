package com.AutoNote.senai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.AutoNote.senai.entity.Notas;

@Repository
public interface NotaRepository extends JpaRepository<Notas, Integer> {
	
	@Query("Select n from Notas n where n.idNota = idNota")
	Iterable <Notas> findAll(Integer Notas);
}
