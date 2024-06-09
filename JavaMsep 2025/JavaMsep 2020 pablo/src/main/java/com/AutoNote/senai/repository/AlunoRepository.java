package com.AutoNote.senai.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.AutoNote.senai.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
		
		@Query("Select a from Aluno a where a.num_matricula_aluno = num_matricula_aluno")
		Iterable<Aluno> findByNum_matricula_aluno(Integer num_matricula_aluno);


}
