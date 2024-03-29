package com.leilao.leilao.controller.form;

import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.model.Leilao;
import com.leilao.leilao.model.Lance;

public class LanceForm {

    private Double valor;
    private Leilao leilao;
    private Concorrente concorrente;

    public LanceForm() {
    }

    public LanceForm(Double valor, Leilao leilao, Concorrente concorrente) {
        this.valor = valor;
        this.leilao = leilao;
        this.concorrente = concorrente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Leilao getLeilao() {
        return leilao;
    }

    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }

    public Concorrente getConcorrente() {
        return concorrente;
    }

    public void setConcorrente(Concorrente concorrente) {
        this.concorrente = concorrente;
    }

    public Lance criaLance(){
        return new Lance(null, valor, leilao, concorrente);
    }
}
