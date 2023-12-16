package manipula_array;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {

    private ArrayList<Integer> listaInteiros;
    private int tamanhoArray;
    private int elementoLista;

    public ManipulaArray(){
        listaInteiros = new ArrayList<>();
    }

    public void insereUsuario(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos elementos você quer adicionar na lista: ");
        tamanhoArray = entrada.nextInt();

        System.out.println("Ok, insira os números para a sua lista de " + tamanhoArray + " inteiros!");

        for (int i = 0; i < tamanhoArray ; i++){
            System.out.println("Insira o " + i + 1 + "º número inteiro:");
            elementoLista = entrada.nextInt();
            listaInteiros.add(elementoLista);
        }

        System.out.println("Lista completa!");
    }

    public void insereElementoAutomatico(){

        Scanner entrada = new Scanner(System.in);
        Random randon = new Random();

        System.out.println("Digite quantos elementos você quer que tenham na lista: ");
        tamanhoArray = entrada.nextInt();

        System.out.println("Ok, agora sua lista de " + tamanhoArray + " inteiros vai ser gerada!");

        for (int i = 0; i < tamanhoArray ; i++){
            elementoLista = randon.nextInt(10);
            listaInteiros.add(elementoLista);
        }

        System.out.println("Lista completa!");

    }

    public void calculaSomaTodosElementos(){

        int soma = 0;

        for (Integer n : listaInteiros) {

            soma += n.intValue();

        }

        System.out.println("A soma de todos os elementos da sua lista é: " + soma);

    }

    public void encontraMaiorValorLista(){

        int maior = Integer.MIN_VALUE;

        for (Integer listaInteiro : listaInteiros) {

            if (listaInteiro > maior) {

                maior = listaInteiro;

            }
        }

        System.out.printf("Maior número inteiro da sua lista é: " + maior);

    }

    public void encontraMenorValorLista(){

        int menor = Integer.MAX_VALUE;

        for (Integer listaInteiro : listaInteiros) {

            if (listaInteiro < menor) {

                menor = listaInteiro;

            }
        }

        System.out.printf("Menor número inteiro da sua lista é: " + menor);


    }

}


