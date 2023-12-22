package calculadora;

import java.util.ArrayList;

public class Calculadora {

    private ArrayList<Float> listaOperacao = new ArrayList<>();

    public Calculadora(){

    }

    public int soma(int num1, int num2){

        int soma;
        soma = num1 + num2;

        return soma;
    }

    public float soma(float num1, float num2){

        float soma;
        soma = num1 + num2;

        return soma;
    }

    public int subtracao(int num1, int num2){

        int subtracao;
        subtracao = num1 - num2;

        return subtracao;
    }

    public float subtracao(float num1, float num2){

        float subtracao;
        subtracao = num1 - num2;

        return subtracao;
    }

    public int multiplicacao(int num1, int num2){

        int multiplicacao;
        multiplicacao = num1 * num2;

        return multiplicacao;
    }

    public float multiplicacao(float num1, float num2){

        float multiplicacao;
        multiplicacao = num1 * num2;

        return multiplicacao;
    }

    public int divisao(int num1, int num2){

        int divisao;
        divisao = num1 / num2;

        return divisao;
    }

    public float divisao(float num1, float num2){

        float divisao;
        divisao = num1 / num2;

        return divisao;
    }

    public void adicionaNumerosLista(float num1){
        listaOperacao.add(num1);
    }

    public void retornaOperacao(int op){

        float operacao = 0;

        switch (op){
            case 1:

                for (Float n : listaOperacao){
                    operacao += n.floatValue();
                }

                if ( operacao == (int) operacao){

                    System.out.println("O resultado da lista de soma é: " + (int) operacao + "\n");

                } else {

                    System.out.println("O resultado da lista de soma é: " + operacao + "\n");

                }

                listaOperacao.clear();

                break;

            case 2:

                operacao = listaOperacao.get(0);

                for (int n = 1 ; n < listaOperacao.size() ; n++){
                    operacao -= listaOperacao.get(n);
                }

                if ( operacao == (int) operacao){

                    System.out.println("O resultado da lista de subtração é: " + (int) operacao + "\n");

                } else {

                    System.out.println("O resultado da lista de subtração é: " + operacao + "\n");

                }

                listaOperacao.clear();

                break;

            case 3:

                operacao = listaOperacao.get(0);

                for (int n = 1 ; n < listaOperacao.size() ; n++){
                    operacao *= listaOperacao.get(n);
                }

                if ( operacao == (int) operacao){

                    System.out.println("O resultado da lista de multiplicação é: " + (int) operacao + "\n");

                } else {

                    System.out.println("O resultado da lista de multiplicação é: " + operacao + "\n");

                }

                listaOperacao.clear();

                break;

            case 4:

                operacao = listaOperacao.get(0);

                for (int n = 1 ; n < listaOperacao.size() ; n++){
                    operacao /= listaOperacao.get(n);
                }

                if ( operacao == (int) operacao){

                    System.out.println("O resultado da lista de divisão é: " + (int) operacao + "\n");

                } else {

                    System.out.println("O resultado da lista de divisão é: " + operacao + "\n");

                }

                listaOperacao.clear();

                break;
        }


    }
}
