package com.leilao.leilao.controller.dto;

import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.model.Lance;
import com.leilao.leilao.model.Leilao;


public class LanceDTO {

    private Long Id;
    private Double Valor;
    private Leilao Leilao;
    private Concorrente Concorrente;

    public LanceDTO(Lance lance) {

        this.Id = lance.getId();
        this.Valor = lance.getValor();
        this.Leilao = lance.getLeilao();
        this.Concorrente = lance.getConcorrente();

    }

    public Long getId() {
        return Id;
    }

    public Double getValor() {
        return Valor;
    }

    public com.leilao.leilao.model.Leilao getLeilao() {
        return Leilao;
    }

    public com.leilao.leilao.model.Concorrente getConcorrente() {
        return Concorrente;
    }
}
