package com.relacionamentos.relcionamentosMysql.api.controller;

import com.relacionamentos.relcionamentosMysql.api.dto.DisciplinaRequestDTO;
import com.relacionamentos.relcionamentosMysql.domain.entity.Disciplina;
import com.relacionamentos.relcionamentosMysql.domain.entity.Professor;
import com.relacionamentos.relcionamentosMysql.domain.service.DisciplinaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/disciplina")
public class DisciplinaController {

    private final DisciplinaService disciplinaService;

    @GetMapping()
    public ResponseEntity<List<Disciplina>> getAllDisciplina(){
        return ResponseEntity.status(200).body(disciplinaService.getAllDisciplina());
    }

    @PostMapping()
    public ResponseEntity<Disciplina> createDisciplina(@RequestBody DisciplinaRequestDTO data){
        Disciplina disciplinaCreated = disciplinaService.createDisciplina(data);

        return ResponseEntity.status(201).body(disciplinaCreated);
    }

}
