package configuracao;

import java.util.ArrayList;
import java.util.Scanner;

public class Configuracao {

    private String nome;
    private String alfabeto;
    private int tamanhoSenha;
    private int maxTentativas;

    public Configuracao(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void definirAlfabeto(String alfabeto) throws Exception{

        if((alfabeto == null) || (alfabeto.length() < 2)){

            Exception e = new Exception("O alfabeto deve possuir mais de 1 caracter");
            throw e;

        }

        boolean r = checaRepetido(alfabeto);

        if(r){

        Exception e = new Exception("Não pode haver caracteres repetidos no alfabeto");
        throw e;

        }

        this.alfabeto = alfabeto;

    }

    public String getAlfabeto() {
        return alfabeto;
    }

    protected boolean checaRepetido(String alfabeto){
        for (int i = 0 ; i < alfabeto.length() ; i++){

            char c1 = alfabeto.charAt(i);
            for (int j = i + 1 ; j < alfabeto.length() ; j++){

                char c2= alfabeto.charAt(j);
                if (c1 == c2) return true;

            }

        }

        return false;
    }
}
