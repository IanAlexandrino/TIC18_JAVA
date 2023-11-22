package conversortemperatura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConversorTemperatura convTemp = new ConversorTemperatura();
        int op;
        float _temperatura;

        do {
            System.out.println("    MENU    ");

            System.out.println("1. Converter Celsius para Fahrenheit");
            System.out.println("2. Converter Fahrenheit para Celsius");
            System.out.println("3. Sair");

            op = entrada.nextInt();

            if(op == 1){

                System.out.println("Digite a temperatura em Celsius para ser convertida: ");
                _temperatura = entrada.nextFloat();

                convTemp.celciusParaFahr(_temperatura);

            } else if (op == 2){

                System.out.println("Digite a temperatura em Fahrenheit para ser convertida: ");
                _temperatura = entrada.nextFloat();

                convTemp.fahrParCelsius(_temperatura);

            } else if (op < 1 || op > 3){

                System.out.println("Opção inexistente!");

            }

        }while(op != 3);

        System.out.println("Até a próxima");

    }
}
