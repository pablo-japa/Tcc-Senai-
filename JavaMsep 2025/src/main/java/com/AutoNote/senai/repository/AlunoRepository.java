package com.AutoNote.senai.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.AutoNote.senai.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
		
		@Query("Select a from Aluno a where a.num_matricula_aluno = num_matricula_aluno")
		Iterable<Aluno> findByNum_matricula_aluno(Integer num_matricula_aluno);
		
		 @Query("SELECT a.nome AS nome_aluno, COUNT(ac.id) AS criterios_criticos_atingidos " +
		           "FROM Aluno a " +
		           "LEFT JOIN AlunoCriterio ac ON a.num_matricula_aluno = ac.num_matricula_aluno_capacidade " +
		           "LEFT JOIN Criterio c ON ac.id_criterioAluno = c.id_criterio " +
		           "WHERE c.tipo = 'Critica' AND ac.avaliado = 'SIM' " +
		           "GROUP BY a.nome")
		    List<Object[]> countCriteriosCriticosAtingidos();
		    
		    @Query("SELECT a.nome AS nome_aluno, COUNT(ac.id) AS criterios_desejados_atingidos " +
		            "FROM Aluno a " +
		            "LEFT JOIN AlunoCriterio ac ON a.num_matricula_aluno = ac.num_matricula_aluno_capacidade " +
		            "LEFT JOIN Criterio c ON ac.id_criterioAluno = c.id_criterio " +
		            "WHERE c.tipo = 'Desejada' AND ac.avaliado = 'SIM' " +
		            "GROUP BY a.nome")
		     List<Object[]> countCriteriosDesejadosAtingidos();

}
