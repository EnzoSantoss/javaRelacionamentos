package com.relacionamentos.relcionamentosMysql.api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DisciplinaRequestDTO {
    private Integer professor_id;
    private String materia;
}
