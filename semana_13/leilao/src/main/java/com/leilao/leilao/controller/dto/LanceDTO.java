package com.leilao.leilao.controller.dto;

import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.model.Lance;
import com.leilao.leilao.model.Leilao;


public class LanceDTO {

    private Long Id;
    private Double Valor;
    private LeilaoDTO Leilao;
    private ConcorrenteDTO Concorrente;

    public LanceDTO(Lance lance) {
    }
}
