package com.leilao.leilao.model;

import jakarta.persistence.*;

@Entity
public class Lance {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valor;
    @ManyToOne
    private Leilao leilao;
    @ManyToOne
    private Concorrente concorrente;

    public Lance() {
    }

    public Lance(Long id, Double valor, Leilao leilao, Concorrente concorrente) {
        this.id = id;
        this.valor = valor;
        this.leilao = leilao;
        this.concorrente = concorrente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
