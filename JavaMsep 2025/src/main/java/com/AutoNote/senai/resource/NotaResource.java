package com.AutoNote.senai.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoNote.senai.entity.Competencia;
import com.AutoNote.senai.entity.Notas;
import com.AutoNote.senai.repository.NotaRepository;

@RestController
@RequestMapping("/Notas")
public class NotaResource {

	@Autowired
	private NotaRepository notaRepository;

	@PostMapping("/CriarNotas")
	public ResponseEntity<?> createNotas(@RequestBody List<Notas> notas) {
		for (Notas nota : notas) {
			System.out.println(nota);
			System.out.println(nota.getNota());
			System.out.println(nota.getNome_aluno());

			if (nota.getNota() == null) {
				return ResponseEntity.badRequest().body("Nota cannot be null");
			}

			notaRepository.save(nota);
		}
		return ResponseEntity.created(URI.create("/Nota/TodasNotas")).body(notas);
	}

	@GetMapping("/BuscarNotas")
	public List<Notas> getAllNotas() {
		return notaRepository.findAll();
	}
}
