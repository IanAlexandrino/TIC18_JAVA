package com.redesocial.redesocial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeuController {

    private int valor = 99;

    @RequestMapping("/valor")
    public int getValor(){
        return valor;
    }
}
