package com.relacionamentos.relcionamentosMysql.domain.repository;

import com.relacionamentos.relcionamentosMysql.domain.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
