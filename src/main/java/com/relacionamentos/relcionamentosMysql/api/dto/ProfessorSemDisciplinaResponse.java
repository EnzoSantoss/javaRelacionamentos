package com.relacionamentos.relcionamentosMysql.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfessorSemDisciplinaResponse {
    private Integer id;
    private String nome;
    private Integer idade;
    private String prontuario;
}
