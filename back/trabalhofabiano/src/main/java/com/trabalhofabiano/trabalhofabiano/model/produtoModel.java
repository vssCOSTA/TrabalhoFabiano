package com.trabalhofabiano.trabalhofabiano.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="produtos")
public class produtoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String descricao, nome;
    Float valor;

    @OneToOne
    @JoinColumn(name = "idImagem")
    imagemModel Imagem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public imagemModel getImagem() {
        return Imagem;
    }

    public void setImagem(imagemModel imagem) {
        Imagem = imagem;
    }

    public produtoModel() {
    }

    public produtoModel(Integer id, String descricao, String nome, Float valor, imagemModel imagem) {
        this.id = id;
        this.descricao = descricao;
        this.nome = nome;
        this.valor = valor;
        Imagem = imagem;
    }
    
   


}
