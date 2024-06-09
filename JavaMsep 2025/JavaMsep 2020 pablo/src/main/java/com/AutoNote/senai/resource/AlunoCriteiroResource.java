package com.AutoNote.senai.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

}
