package com.relacionamentos.relcionamentosMysql.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorResponse {
    private Integer id;
    private String nome;
    private Integer idade;
    private String prontuario;
    private List<DisciplinaResponse> disciplina;
}
