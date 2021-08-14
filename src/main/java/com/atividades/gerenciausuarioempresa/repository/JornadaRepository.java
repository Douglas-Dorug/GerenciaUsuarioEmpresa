package com.atividades.gerenciausuarioempresa.repository;

import com.atividades.gerenciausuarioempresa.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho,Long> {
}
