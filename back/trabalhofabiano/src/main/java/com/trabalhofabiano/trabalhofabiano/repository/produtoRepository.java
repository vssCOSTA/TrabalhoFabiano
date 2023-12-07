package com.trabalhofabiano.trabalhofabiano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalhofabiano.trabalhofabiano.model.produtoModel;

@Repository
public interface produtoRepository extends JpaRepository<produtoModel, Integer> {

}
