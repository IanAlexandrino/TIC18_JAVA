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
        int auxInsereUsuario = 0;

        if (listaInteiros.size() > 0){

            System.out.println("Já existe uma lista de inteiros cadastrada, quer criar uma nova lista ou adicionar elementos na lista já existentente?\n");
            System.out.println("1. Criar nova lista");
            System.out.println("2. Adicionar elementos na lista existente\n");
            auxInsereUsuario = entrada.nextInt();

            if (auxInsereUsuario == 1){

                listaInteiros.clear();
                System.out.println("\nLista apagada com sucesso!\n");

            } else if (auxInsereUsuario == 2){



            } else {

                while(auxInsereUsuario != 1 && auxInsereUsuario != 2) {
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida!\n");

                    System.out.println("1. Criar nova lista");
                    System.out.println("2. Adicionar elementos na lista existente\n");
                    auxInsereUsuario = entrada.nextInt();

                    if (auxInsereUsuario == 1){

                        listaInteiros.clear();
                        System.out.println("\nLista apagada com sucesso!\n");

                    } else if (auxInsereUsuario == 2){

                    }
                }

            }

        }

        if (auxInsereUsuario == 2){

            System.out.println("Digite quantos elementos você quer adicionar na lista: ");

        } else if (auxInsereUsuario == 1 || auxInsereUsuario == 0){

            System.out.println("Digite quantos elementos você quer que a sua lista tenha: ");

        }

        tamanhoArray = entrada.nextInt();

        System.out.println("\nOk, insira os números para a sua lista de " + tamanhoArray + " inteiros!\n");

        for (int i = 0; i < tamanhoArray ; i++){
            System.out.println("Insira o " + (i + 1) + "º número inteiro:");
            elementoLista = entrada.nextInt();
            listaInteiros.add(elementoLista);
        }

        System.out.println("Lista completa!\n");
    }

    public void insereElementoAutomatico(){

        Scanner entrada = new Scanner(System.in);
        Random randon = new Random();
        int auxInsereUsuario = 0;

        if (listaInteiros.size() > 0){

            System.out.println("Já existe uma lista de inteiros cadastrada, quer criar uma nova lista ou adicionar elementos na lista já existentente?\n");
            System.out.println("1. Criar nova lista");
            System.out.println("2. Adicionar elementos na lista existente\n");
            auxInsereUsuario = entrada.nextInt();

            if (auxInsereUsuario == 1){

                listaInteiros.clear();
                System.out.println("\nLista apagada com sucesso!\n");

            } else if (auxInsereUsuario == 2){

            } else {

                while(auxInsereUsuario != 1 && auxInsereUsuario != 2) {
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida!\n");

                    System.out.println("1. Criar nova lista");
                    System.out.println("2. Adicionar elementos na lista existente\n");
                    auxInsereUsuario = entrada.nextInt();

                    if (auxInsereUsuario == 1){

                        listaInteiros.clear();
                        System.out.println("\nLista apagada com sucesso!\n");

                    } else if (auxInsereUsuario == 2){

                    }
                }
            }

        }

        if (auxInsereUsuario == 2){

            System.out.println("Digite quantos elementos você quer adicionar na lista: ");

        } else if (auxInsereUsuario == 1 || auxInsereUsuario == 0){

            System.out.println("Digite quantos elementos você quer que a sua lista tenha: ");

        }

        tamanhoArray = entrada.nextInt();

        System.out.println("\nOk, agora sua lista de " + tamanhoArray + " inteiros vai ser gerada!\n");

        for (int i = 0; i < tamanhoArray ; i++){
            elementoLista = randon.nextInt(10);
            listaInteiros.add(elementoLista);
        }

        System.out.println("Lista completa!\n");

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

        System.out.printf("Maior número inteiro da sua lista é: " + maior + "\n\n");

    }

    public void encontraMenorValorLista(){

        int menor = Integer.MAX_VALUE;

        for (Integer listaInteiro : listaInteiros) {

            if (listaInteiro < menor) {

                menor = listaInteiro;

            }
        }

        System.out.printf("Menor número inteiro da sua lista é: " + menor + "\n\n");


    }

}


