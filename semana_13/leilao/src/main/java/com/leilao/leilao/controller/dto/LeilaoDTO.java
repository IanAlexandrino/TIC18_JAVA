package com.leilao.leilao.controller.dto;

import com.leilao.leilao.model.Lance;
import com.leilao.leilao.model.Leilao;

import java.util.List;

public class LeilaoDTO {

    private Long Id;
    private String Descricao;
    private Double ValorMinimo;
    private Boolean Status;
    List<Lance> ListaLances;

    public LeilaoDTO(Leilao leilao) {

        this.Id = leilao.getId();
        this.Descricao = leilao.getDescricao();
        this.ValorMinimo = leilao.getValorMinimo();
        this.Status = leilao.getStatus();
        this.ListaLances = leilao.getListaLances();

    }

    public Long getId() {
        return Id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public Double getValorMinimo() {
        return ValorMinimo;
    }

    public Boolean getStatus() {
        return Status;
    }

    public List<Lance> getListaLances() {
        return ListaLances;
    }
}
