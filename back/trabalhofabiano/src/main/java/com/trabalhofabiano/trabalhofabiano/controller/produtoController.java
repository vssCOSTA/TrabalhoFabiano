package com.trabalhofabiano.trabalhofabiano.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trabalhofabiano.trabalhofabiano.model.produtoModel;
import com.trabalhofabiano.trabalhofabiano.repository.produtoRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("produtos")
public class produtoController {

    @Autowired
    private produtoRepository produtoRepository;

    @GetMapping
    public List<produtoModel> findAll() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<produtoModel> findById(@RequestParam Integer id) {
        return produtoRepository.findById(id);
    }

}
