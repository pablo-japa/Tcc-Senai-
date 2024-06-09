package com.AutoNote.senai.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoNote.senai.Service.AlunoService;
import com.AutoNote.senai.entity.Aluno;
import com.AutoNote.senai.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

	@Autowired
	private AlunoRepository alunoRepository;

	@Autowired
	private AlunoService alunoService;

	@GetMapping("/TodosAlunos")
	public Iterable<Aluno> findAll() {
		return alunoRepository.findAll();
	}

	@GetMapping("/consulta_aluno/{id_Aluno}")
	public Aluno findByIdAluno(@PathVariable Integer num_matricula_aluno) {
		return alunoRepository.findById(num_matricula_aluno).orElse(null);
	}

	@GetMapping("/criterios-criticos-atingidos")
	public List<Object[]> getCriteriosCriticosAtingidos() {
		return alunoService.getCriteriosCriticosAtingidos();
	}

	@GetMapping("/criterios-desejados-atingidos")
	public List<Object[]> getCriteriosDesejadosAtingidos() {
		return alunoService.getCriteriosDesejadosAtingidos();
	}

}
