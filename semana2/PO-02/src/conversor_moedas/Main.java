package conversor_moedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ConversorMoedas convM = new ConversorMoedas();
        int opMenu;
        float auxValor;
        float auxTaxaCambio;

        do{

            System.out.println("=====MENU=====");
            System.out.println("1. Converter valor");
            System.out.println("0. Sair");
            opMenu = entrada.nextInt();

            if (opMenu == 1) {

                System.out.println("Digite o valor que você quer converter: ");
                auxValor = entrada.nextFloat();

                System.out.println("Agora digite a taxa de câmbio da moeda: ");
                auxTaxaCambio = entrada.nextFloat();

                convM.converteMoeda(auxValor, auxTaxaCambio);

            } else if (opMenu == 0){

                return;

            } else{

                System.out.println("Opção incorreta!");

            }
        }while(opMenu != 0);

        System.out.println("Até a próxima!");

    }

}
