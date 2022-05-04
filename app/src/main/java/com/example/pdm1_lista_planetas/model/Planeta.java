package com.example.pdm1_lista_planetas.model;

import java.util.Objects;

public class Planeta {
    private int id;
    private String nome;
    private String descricao;
    private String imagemNome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getImagemNome() {
        return imagemNome;
    }

    public void setImagemNome(String imagemNome) {
        this.imagemNome = imagemNome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planeta planeta = (Planeta) o;
        return Objects.equals(nome, planeta.nome) && Objects.equals(descricao, planeta.descricao) && Objects.equals(imagemNome, planeta.imagemNome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, imagemNome);
    }
}
