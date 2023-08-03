package com.relacionamentos.relcionamentosMysql.api.controller;

import com.relacionamentos.relcionamentosMysql.api.dto.ProfessorResponse;
import com.relacionamentos.relcionamentosMysql.api.dto.ProfessorSemDisciplinaResponse;
import com.relacionamentos.relcionamentosMysql.api.dto.mapper.ProfessorMapper;
import com.relacionamentos.relcionamentosMysql.domain.entity.Professor;
import com.relacionamentos.relcionamentosMysql.domain.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private final ProfessorService professorService;
    @GetMapping()
    public ResponseEntity<List<ProfessorResponse>> getAllProfessores(){

        List<Professor> allProfessor = professorService.getAllProfessor();

        List<ProfessorResponse> response = ProfessorMapper.toProfessoresComDisciplinaList(allProfessor);


        return ResponseEntity.status(200).body(response);
    }

    @PostMapping()
    public ResponseEntity<Professor>  createProfessor (@RequestBody Professor data ){
        Professor professorCreated = professorService.creatProfessor(data);

        return ResponseEntity.status(201).body(professorCreated);
    }
}
