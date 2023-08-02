package com.relacionamentos.relcionamentosMysql.domain.service;

import com.relacionamentos.relcionamentosMysql.api.dto.DisciplinaRequestDTO;
import com.relacionamentos.relcionamentosMysql.domain.entity.Disciplina;
import com.relacionamentos.relcionamentosMysql.domain.entity.Professor;
import com.relacionamentos.relcionamentosMysql.domain.repository.DisciplinaRepository;
import com.relacionamentos.relcionamentosMysql.domain.repository.ProfessorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;
    private final ProfessorRepository professorRepository;

    public Disciplina createDisciplina(DisciplinaRequestDTO data){
        Optional<Professor> professor = professorRepository.findById(data.getProfessor_id());

        if(professor.isPresent()){
            Disciplina createDisciplina = new Disciplina();
            createDisciplina.setMateria(data.getMateria());
            createDisciplina.setProfessor(professor.get());
            return disciplinaRepository.save(createDisciplina);
        }else{
            throw new RuntimeException("não foi possivel salvar essa disciplina");
        }
    }

    public List<Disciplina> getAllDisciplina(){
        return disciplinaRepository.findAll();
    }
}
