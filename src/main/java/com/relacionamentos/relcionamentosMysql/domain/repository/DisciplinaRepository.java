package com.relacionamentos.relcionamentosMysql.domain.repository;

import com.relacionamentos.relcionamentosMysql.domain.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
}
