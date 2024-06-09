package com.AutoNote.senai.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoNote.senai.entity.AlunoCriterio;
import com.AutoNote.senai.repository.AlunoCriterioRepository;

@RestController
@RequestMapping("/AlunoCriterio")
public class AlunoCriteiroResource {
	
	@Autowired
	private AlunoCriterioRepository alunoCriterioRepository;
	
	@GetMapping("/TodosAvaliados")
	public Iterable<AlunoCriterio> findAll(){
		
		return alunoCriterioRepository.findAll();
		
	}
	
	@PostMapping("/criarAvaliados")
	public AlunoCriterio createAvaliado(@RequestBody AlunoCriterio alunocriterio) {
		System.out.println(alunocriterio.getData());
		return alunoCriterioRepository.save(alunocriterio);
	}
	
	@PutMapping("/atualizaAvaliado")
	public AlunoCriterio atualizaAvaliado(@RequestBody AlunoCriterio alunocriterio) {
		System.out.println(alunocriterio.getData());
		return alunoCriterioRepository.save(alunocriterio);
		
	}
	
	@PutMapping("/atualizarAvaliacao/matricula/{numMatricula}")
    public ResponseEntity<AlunoCriterio> atualizarAvaliacaoPorMatricula(@PathVariable Integer numMatricula, @RequestBody AlunoCriterio avaliacao) {
        return alunoCriterioRepository.findByNumMatricula(numMatricula)
                .map(existingAvaliacao -> {
                    existingAvaliacao.setId_criterioAluno(avaliacao.getId_criterioAluno());
                    existingAvaliacao.setNum_matricula_aluno_capacidade(avaliacao.getNum_matricula_aluno_capacidade());
                    existingAvaliacao.setAvaliado(avaliacao.getAvaliado());
                    existingAvaliacao.setData(avaliacao.getData());
                    AlunoCriterio updatedAvaliacao = alunoCriterioRepository.save(existingAvaliacao);
                    return ResponseEntity.ok(updatedAvaliacao);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
