package com.leilao.leilao.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Leilao {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descricao;
    private Double valorMinimo;
    private Boolean status;
    @OneToMany
    List<Lance> listaLances;

    public Leilao() {
    }

    public Leilao(Long id, String descricao, Double valorMinimo, Boolean status, List<Lance> listaLances) {
        this.id = id;
        this.descricao = descricao;
        this.valorMinimo = valorMinimo;
        this.status = status;
        this.listaLances = listaLances;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(Double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public List<Lance> getListaLances() {
        return listaLances;
    }

    public void setListaLances(List<Lance> listaLances) {
        this.listaLances = listaLances;
    }
}
