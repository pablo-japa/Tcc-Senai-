package com.AutoNote.senai.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AutoNote.senai.entity.Turmas;
import com.AutoNote.senai.repository.TurmasRepository;

@RestController
@RequestMapping("/Turmas")
public class TurmasResource {

    private final TurmasRepository turmasRepository;

    @Autowired
    public TurmasResource(TurmasRepository turmasRepository) {
        this.turmasRepository = turmasRepository;
    }

    @PostMapping("/CriarTurmas")
    public Turmas criarTurmas(@RequestBody Turmas turmas) {
        return turmasRepository.save(turmas);
    }

    @GetMapping("/BuscarTurmas")
    public List<Turmas> findAll() {
        return turmasRepository.findAll();
    }
}
