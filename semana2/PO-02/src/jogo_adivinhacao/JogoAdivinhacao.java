package jogo_adivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    private Random rand;
    private int nmrTeste;

    public JogoAdivinhacao(){
        rand = new Random();
    }

    public void menuJogo(){

        Scanner entrada = new Scanner(System.in);
        int opMenu;
        int chuteUsuario;
        String auxMenu = "S";

        do {

            System.out.println("=======JOGO=======");
            System.out.println("========DA========");
            System.out.println("====ADIVINHAÇÃO===\n");

            System.out.println("1. Iniciar Game");
            System.out.println("0. Sair");

            opMenu = entrada.nextInt();

            if (opMenu == 1){

                nmrTeste = rand.nextInt(101);

                System.out.println("Vamos lá, nosso sistema gerou um número e eu duvido que vc consiga acertar!!!!\n");

                do {

                    System.out.println("Insira o seu chute: ");
                    System.out.println(nmrTeste);
                    chuteUsuario = entrada.nextInt();

                    if (chuteUsuario == nmrTeste){

                        System.out.println("Parabéns, você acertou o número secreto!!!");
                        break;

                    } else if (chuteUsuario < nmrTeste){

                        System.out.println("Que pena, tente um número maior!");

                    } else if (chuteUsuario > nmrTeste) {

                        System.out.println("Que pena, tente um número menor!");

                    }

                } while (auxMenu != "N");


            } else if (opMenu == 0){

                return;

            } else {

                System.out.println("Opção errada, tente novamente!");

            }

        }while(opMenu != 0);

    }

}
