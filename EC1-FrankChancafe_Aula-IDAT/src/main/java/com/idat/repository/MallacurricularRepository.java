package com.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.model.Mallacurricular;

@Repository
public interface MallacurricularRepository extends JpaRepository<Mallacurricular, Integer> {

}
