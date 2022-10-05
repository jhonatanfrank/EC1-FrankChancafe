package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
