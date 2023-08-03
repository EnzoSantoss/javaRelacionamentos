package com.relacionamentos.relcionamentosMysql.api.dto.mapper;

import com.relacionamentos.relcionamentosMysql.api.dto.DisciplinaResponse;
import com.relacionamentos.relcionamentosMysql.domain.entity.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaMapper {

    public static DisciplinaResponse toDisciplinaResponse (Disciplina disciplina){
        DisciplinaResponse response = new DisciplinaResponse();

        response.setId(disciplina.getId());
        response.setMateria(disciplina.getMateria());


        return response;
    }

    public static List<DisciplinaResponse> toDisciplinaResponseList (List<Disciplina> disciplinas){
        List<DisciplinaResponse> responses = new ArrayList<>();

        for(Disciplina disciplina: disciplinas){
            DisciplinaResponse disciplinaResponse = toDisciplinaResponse(disciplina);
            responses.add(disciplinaResponse);
        }

        return responses;
    }
}
