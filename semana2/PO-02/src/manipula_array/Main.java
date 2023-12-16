package manipula_array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ManipulaArray manipulaArray = new ManipulaArray();

        int opMenu;

        do {

            System.out.println("===============MENU===============\n");
            System.out.println("1. Crie sua lista de números inteiros");
            System.out.println("2. Crie uma lista de números inteiros aleatórios");
            System.out.println("3. Calcule a soma de todos os elementos da sua lista");
            System.out.println("4. Encontre o maior valor da sua lista");
            System.out.println("5. Encontre o menor valor da sua lista");
            System.out.println("0. Sair\n");

            System.out.println("Opção: ");
            opMenu = entrada.nextInt();

            switch (opMenu){

                case 1:

                    manipulaArray.insereUsuario();
                    break;

                case 2:

                    manipulaArray.insereElementoAutomatico();
                    break;

                case 3:

                    manipulaArray.calculaSomaTodosElementos();
                    break;

                case 4:

                    manipulaArray.encontraMaiorValorLista();
                    break;

                case 5:

                    manipulaArray.encontraMenorValorLista();
                    break;

                case 0:

                    System.out.println("Até a próxima!");
                    break;

                default:

                    System.out.println("Opção errada, tente novamente!");

            }

        } while(opMenu != 0);


    }

}