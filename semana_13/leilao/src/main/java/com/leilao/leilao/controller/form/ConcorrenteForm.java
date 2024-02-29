package com.leilao.leilao.controller.form;

import com.leilao.leilao.model.Concorrente;
import com.leilao.leilao.model.Lance;

import java.util.List;

public class ConcorrenteForm {

    private String nome;
    private String cpf;
    List<Lance> listaLances;

    public ConcorrenteForm() {
    }

    public ConcorrenteForm(String nome, String cpf, List<Lance> listaLances) {
        this.nome = nome;
        this.cpf = cpf;
        this.listaLances = listaLances;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Lance> getListaLances() {
        return listaLances;
    }

    public void setListaLances(List<Lance> listaLances) {
        this.listaLances = listaLances;
    }

    public Concorrente criaConcorrente(){
        return new Concorrente(null, nome, cpf, listaLances);
    }
}
