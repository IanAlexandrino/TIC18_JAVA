package com.leilao.leilao.controller.form;

import com.leilao.leilao.model.Lance;
import com.leilao.leilao.model.Leilao;

import java.util.List;

public class LeilaoForm {

    private String descricao;
    private Double valorMinimo;
    private Boolean status;
    List<Lance> listaLances;

    public LeilaoForm() {
    }

    public LeilaoForm(String descricao, Double valorMinimo, Boolean status, List<Lance> listaLances) {
        this.descricao = descricao;
        this.valorMinimo = valorMinimo;
        this.status = status;
        this.listaLances = listaLances;
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

    public Leilao criaLeilao(){
        return new Leilao(null, descricao, valorMinimo, status, listaLances);
    }
}
