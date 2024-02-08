package com.controleacademico.controleacademico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class HelloWorld {

    @RequestMapping("/")
    @ResponseBody
    public String helloWorld(){

        return "asdddddddddddd";

    }

    @RequestMapping("/ian")
    @ResponseBody
    public String oloquinho(){

        String conteudo= arrayParaString(retornaConteudoArquivo());

        return conteudo;

    }

    public ArrayList<String> retornaConteudoArquivo(){

        ArrayList<String> dado = new ArrayList<>();
        File arquivo = new File("loucura.txt");
        boolean existe = arquivo.exists();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){

            while(br.ready()){

                dado.add(br.readLine());

            }

        } catch (IOException e){

            System.out.println("Erro: " + e.getMessage());

        }

        return dado;
    }

    public static String arrayParaString(ArrayList<String> array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String elemento : array) {
            stringBuilder.append(elemento).append("\n\n"); // Adiciona o elemento seguido de uma quebra de linha
        }
        return stringBuilder.toString();
    }

}
