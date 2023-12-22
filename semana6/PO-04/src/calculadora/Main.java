package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        boolean app = true;
        int opMenu;
        int auxNumLista;
        int auxNum1;
        int auxNum2;
        float auxNum3;
        float auxNum4;

        do {

            System.out.print("##-----CALCULADORA-----##\n\n");
            System.out.print("|------------------------------------|\n");
            System.out.print("| Opção 1 - Adição                   |\n");
            System.out.print("| Opção 2 - Subtração                |\n");
            System.out.print("| Opção 3 - Multiplicação            |\n");
            System.out.print("| Opção 4 - Divisão                  |\n");
            System.out.print("| Opção 5 - Lista de Adição          |\n");
            System.out.print("| Opção 6 - Lista de Subtração       |\n");
            System.out.print("| Opção 7 - Lista de Multiplicação   |\n");
            System.out.print("| Opção 8 - Lista de Divisão         |\n");
            System.out.print("| Opção 0 - Sair                     |\n");
            System.out.print("|------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            opMenu = entrada.nextInt();

            switch (opMenu){
                case 1:

                    System.out.println("Digite o primeiro número que vc quer Adicionar: ");
                    auxNum3 = entrada.nextFloat();

                    System.out.println("Digite o segundo número que vc quer Adicionar: ");
                    auxNum4 = entrada.nextFloat();

                    if (auxNum3 == (int) auxNum3 && auxNum4 == (int) auxNum4){

                        auxNum1 = (int) auxNum3;
                        auxNum2 = (int) auxNum4;

                        System.out.println("Resultado: " + calculadora.soma(auxNum1, auxNum2));

                    } else {

                        System.out.println("Resultado: " + calculadora.soma(auxNum3, auxNum4));

                    }
                    break;

                case 2:

                    System.out.println("Digite o primeiro número que vc quer Subtrair: ");
                    auxNum3 = entrada.nextFloat();

                    System.out.println("Digite o segundo número que vc quer Subtrair: ");
                    auxNum4 = entrada.nextFloat();

                    if (auxNum3 == (int) auxNum3 && auxNum4 == (int) auxNum4){

                        auxNum1 = (int) auxNum3;
                        auxNum2 = (int) auxNum4;

                        System.out.println("Resultado: " + calculadora.subtracao(auxNum1, auxNum2));

                    } else {

                        System.out.println("Resultado: " + calculadora.subtracao(auxNum3, auxNum4));

                    }
                    break;

                case 3:

                    System.out.println("Digite o primeiro número que vc quer Multiplicar: ");
                    auxNum3 = entrada.nextFloat();

                    System.out.println("Digite o segundo número que vc quer Multiplicar: ");
                    auxNum4 = entrada.nextFloat();

                    if (auxNum3 == (int) auxNum3 && auxNum4 == (int) auxNum4){

                        auxNum1 = (int) auxNum3;
                        auxNum2 = (int) auxNum4;

                        System.out.println("Resultado: " + calculadora.multiplicacao(auxNum1, auxNum2));

                    } else {

                        System.out.println("Resultado: " + calculadora.multiplicacao(auxNum3, auxNum4));

                    }
                    break;

                case 4:

                    System.out.println("Digite o Dividendo: ");
                    auxNum3 = entrada.nextFloat();

                    System.out.println("Digite o Divisor: ");
                    auxNum4 = entrada.nextFloat();

                    if (auxNum3 == (int) auxNum3 && auxNum4 == (int) auxNum4){

                        auxNum1 = (int) auxNum3;
                        auxNum2 = (int) auxNum4;

                        System.out.println("Resultado: " + calculadora.divisao(auxNum1, auxNum2));

                    } else {

                        System.out.println("Resultado: " + calculadora.divisao(auxNum3, auxNum4));

                    }
                    break;

                case 5:

                    System.out.println("Digite quantos números você quer na lista de soma: ");
                    auxNumLista = entrada.nextInt();

                    for (int i = 0 ; i < auxNumLista ; i++){

                        System.out.println("Digite o " + (i + 1) + "º número: ");
                        auxNum3 = entrada.nextFloat();

                        calculadora.adicionaNumerosLista(auxNum3);

                    }

                    calculadora.retornaOperacao(1);

                    break;

                case 6:

                    System.out.println("Digite quantos números você quer na lista de subtração: ");
                    auxNumLista = entrada.nextInt();

                    for (int i = 0 ; i < auxNumLista ; i++){

                        System.out.println("Digite o " + (i + 1) + "º número: ");
                        auxNum3 = entrada.nextFloat();

                        calculadora.adicionaNumerosLista(auxNum3);

                    }

                    calculadora.retornaOperacao(2);

                    break;

                case 7:

                    System.out.println("Digite quantos números você quer na lista de multiplicação: ");
                    auxNumLista = entrada.nextInt();

                    for (int i = 0 ; i < auxNumLista ; i++){

                        System.out.println("Digite o " + (i + 1) + "º número: ");
                        auxNum3 = entrada.nextFloat();

                        calculadora.adicionaNumerosLista(auxNum3);

                    }

                    calculadora.retornaOperacao(3);

                    break;

                case 8:

                    System.out.println("Digite quantos números você quer na lista de divisão: ");
                    auxNumLista = entrada.nextInt();

                    for (int i = 0 ; i < auxNumLista ; i++){

                        System.out.println("Digite o " + (i + 1) + "º número: ");
                        auxNum3 = entrada.nextFloat();

                        calculadora.adicionaNumerosLista(auxNum3);

                    }

                    calculadora.retornaOperacao(4);

                    break;

                case 0:

                    System.out.println("Até a próxima!");
                    app = false;

                    break;

                default:

                    System.out.println("\nOpção inválida, por favor informe uma opção válida!\n");

            }

        } while(app == true);

    }
}