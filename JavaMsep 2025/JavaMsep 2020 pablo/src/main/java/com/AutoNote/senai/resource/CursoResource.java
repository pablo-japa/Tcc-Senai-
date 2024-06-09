package com.AutoNote.senai.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoNote.senai.entity.Curso;
import com.AutoNote.senai.repository.CursoRepository;

@RestController
@RequestMapping("/cursos")
public class CursoResource {
    
    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/todos")
    public Iterable<Curso> findAll() {
        return cursoRepository.findAll();
    }
}
