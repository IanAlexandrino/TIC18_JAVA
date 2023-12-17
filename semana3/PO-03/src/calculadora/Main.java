package calculadora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        float auxNumFloat1;
        float auxNumFloat2;
        int auxNumInt1;
        int auxNumInt2;

        int opMenu;

        do {

            System.out.println("========MENU=========");
            System.out.println("=====CALCULADORA=====\n");

            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair\n");

            opMenu = entrada.nextInt();

            switch (opMenu){
                case 1:

                    System.out.println("Digite o primeiro número que vc quer adicionar: ");
                    auxNumFloat1 = entrada.nextFloat();

                    System.out.println("Digite o segundo número que vc quer adicionar: ");
                    auxNumFloat2 = entrada.nextFloat();

                    if (auxNumFloat1 == (int) auxNumFloat1 && auxNumFloat2 == (int) auxNumFloat2){

                        auxNumInt1 = (int) auxNumFloat1;
                        auxNumInt2 = (int) auxNumFloat2;

                        System.out.println(calculadora.operacaoAdicaoInt(auxNumInt1, auxNumInt2));

                    } else {

                        System.out.println(calculadora.operacaoAdicaoFloat(auxNumFloat1, auxNumFloat2));

                    }
                    break;

                case 2:

                    System.out.println("Digite o primeiro número que vc quer diminuir: ");
                    auxNumFloat1 = entrada.nextFloat();

                    System.out.println("Digite o segundo número que vc quer diminuir: ");
                    auxNumFloat2 = entrada.nextFloat();

                    if (auxNumFloat1 == (int) auxNumFloat1 && auxNumFloat2 == (int) auxNumFloat2){

                        auxNumInt1 = (int) auxNumFloat1;
                        auxNumInt2 = (int) auxNumFloat2;

                        System.out.println(calculadora.operacaoSubtracaoInt(auxNumInt1, auxNumInt2));

                    } else {

                        System.out.println(calculadora.operacaoSubtracaoFloat(auxNumFloat1, auxNumFloat2));

                    }
                    break;

                case 3:

                    System.out.println("Digite o primeiro número que vc quer multiplicar: ");
                    auxNumFloat1 = entrada.nextFloat();

                    System.out.println("Digite o segundo número que vc quer multiplicar: ");
                    auxNumFloat2 = entrada.nextFloat();

                    if (auxNumFloat1 == (int) auxNumFloat1 && auxNumFloat2 == (int) auxNumFloat2){

                        auxNumInt1 = (int) auxNumFloat1;
                        auxNumInt2 = (int) auxNumFloat2;

                        System.out.println(calculadora.operacaoMultiplicacaoInt(auxNumInt1, auxNumInt2));

                    } else {

                        System.out.println(calculadora.operacaoMultiplicacaoFloat(auxNumFloat1, auxNumFloat2));

                    }
                    break;

                case 4:

                    System.out.println("Digite o dividendo: ");
                    auxNumFloat1 = entrada.nextFloat();

                    System.out.println("Digite o divisor: ");
                    auxNumFloat2 = entrada.nextFloat();

                    if (auxNumFloat1 == (int) auxNumFloat1 && auxNumFloat2 == (int) auxNumFloat2){

                        auxNumInt1 = (int) auxNumFloat1;
                        auxNumInt2 = (int) auxNumFloat2;

                        System.out.println(calculadora.operacaoDivisaoInt(auxNumInt1, auxNumInt2));

                    } else {

                        System.out.println(calculadora.operacaoDivisaoFloat(auxNumFloat1, auxNumFloat2));

                    }
                    break;

                case 0:

                    System.out.println("Até a próxima!!");
                    break;

                default:

                    System.out.println("\nOpção incorreta, tente novamente!\n");

            }

        } while (opMenu != 0);

    }
}