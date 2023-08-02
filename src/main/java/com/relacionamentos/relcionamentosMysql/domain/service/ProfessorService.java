package com.relacionamentos.relcionamentosMysql.domain.service;

import com.relacionamentos.relcionamentosMysql.domain.entity.Professor;
import com.relacionamentos.relcionamentosMysql.domain.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public List<Professor> getAllProfessor(){
        return professorRepository.findAll();
    }

    public Professor creatProfessor(Professor data){
        return professorRepository.save(data);
    }
}
