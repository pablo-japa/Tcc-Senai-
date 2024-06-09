package com.AutoNote.senai.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.AutoNote.senai.repository.AlunoRepository;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public List<Object[]> getCriteriosCriticosAtingidos() {
        return alunoRepository.countCriteriosCriticosAtingidos();
    }
    
    public List<Object[]> getCriteriosDesejadosAtingidos() {
        return alunoRepository.countCriteriosDesejadosAtingidos();
    }
}

