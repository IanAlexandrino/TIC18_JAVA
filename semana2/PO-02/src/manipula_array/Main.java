package manipula_array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ManipulaArray manipulaArray = new ManipulaArray();

        int opMenu;

        System.out.println("Digite a opção que você quer: ");
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

            default:

                System.out.println("Opção errada, tente novamente!");
        }

    }

}