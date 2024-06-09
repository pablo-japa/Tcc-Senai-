package com.AutoNote.senai.resource;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.AutoNote.senai.entity.Competencia;
import com.AutoNote.senai.repository.CompetenciaRepository;

@RestController
@RequestMapping("/Competencia")
public class CompetenciaResource {

    @Autowired
    private final CompetenciaRepository competenciaRepository;

    @Autowired
    public CompetenciaResource(CompetenciaRepository competenciaRepository) {
        this.competenciaRepository = competenciaRepository;
    }

    @GetMapping("/competencias")
    public List<Competencia> getAllCompetencia() {
        return competenciaRepository.findAll();
    }

    @GetMapping("/consulta_Competencia/{id_competencia}")
    public ResponseEntity<Competencia> findByIdCompetencia(@PathVariable Integer id_competencia) {
    	 Optional<Competencia> competencia = competenciaRepository.findById(id_competencia);
  	    return competencia.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/CriarCompetencia")
    public Competencia createCompetencia(@RequestBody Competencia competencia) {
	    System.out.println("Tipo: "+competencia);
    	return competenciaRepository.save(competencia);
    }

        @GetMapping("/BuscarCompetencia/socioEmocional")
    public Iterable<Competencia> findByTipoS() {
        return competenciaRepository.findByTipoS();
    }

    @GetMapping("/BuscarCompetencia/basicas")
    public Iterable<Competencia> findByTipoB() {
        return competenciaRepository.findByTipoB();
    }

    @GetMapping("/BuscarCompetencia/tecnicas")
    public Iterable<Competencia> findByTipoT() {
        return competenciaRepository.findByTipoT();
    }
}
