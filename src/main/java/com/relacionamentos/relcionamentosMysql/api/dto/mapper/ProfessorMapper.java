package com.relacionamentos.relcionamentosMysql.api.dto.mapper;

import com.relacionamentos.relcionamentosMysql.api.dto.ProfessorResponse;
import com.relacionamentos.relcionamentosMysql.api.dto.ProfessorSemDisciplinaResponse;
import com.relacionamentos.relcionamentosMysql.domain.entity.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorMapper {

    public static ProfessorSemDisciplinaResponse toProfessoresSemDisciplina (Professor professor){

        ProfessorSemDisciplinaResponse professorSemDisciplinaResponse = new ProfessorSemDisciplinaResponse();

        professorSemDisciplinaResponse.setId(professor.getId());
        professorSemDisciplinaResponse.setNome(professor.getNome());
        professorSemDisciplinaResponse.setIdade(professor.getIdade());
        professorSemDisciplinaResponse.setProntuario(professor.getProntuario());

        return professorSemDisciplinaResponse;
    }

    public static List<ProfessorSemDisciplinaResponse> toProfessoresSemDisciplinaList (List<Professor> listaProfessores){
        List<ProfessorSemDisciplinaResponse> response = new ArrayList<>();
        for(Professor professor : listaProfessores){
            ProfessorSemDisciplinaResponse newProf = toProfessoresSemDisciplina(professor);
            response.add(newProf);
        }

        return response;
    }


    public static ProfessorResponse toProfessorComDisciplina(Professor professor){
        ProfessorResponse professorResponse = new ProfessorResponse();

        professorResponse.setId(professor.getId());
        professorResponse.setNome(professor.getNome());
        professorResponse.setProntuario(professor.getProntuario());
        professorResponse.setIdade(professorResponse.getIdade());
        professorResponse.setDisciplina(DisciplinaMapper.toDisciplinaResponseList(professor.getDisciplinas()));

        return professorResponse;
    }

    public static List<ProfessorResponse> toProfessoresComDisciplinaList (List<Professor> listaProfessores){
        List<ProfessorResponse> response = new ArrayList<>();
        for(Professor professor : listaProfessores){
            ProfessorResponse newProf = toProfessorComDisciplina(professor);
            response.add(newProf);
        }

        return response;
    }

}
