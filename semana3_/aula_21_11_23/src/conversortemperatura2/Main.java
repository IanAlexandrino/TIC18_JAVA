package conversortemperatura2;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConversorTemperatura2 convTemp = new ConversorTemperatura2();
        String opcaoTemperatura;
        int _opcao;
        float _temperatura;

            System.out.println("Informe a unidade da temperatura (EX: F para Fahrenheit e C para Celsius): ");
            opcaoTemperatura = entrada.nextLine();

            System.out.println("Informe a temperatura: ");
            _temperatura = entrada.nextFloat();

            if (Objects.equals(opcaoTemperatura, "C")){

                _opcao = 0;

                convTemp.converteTemperatura(_temperatura, _opcao);

            } else if (Objects.equals(opcaoTemperatura, "F")){

                _opcao = 1;

                convTemp.converteTemperatura(_temperatura, _opcao);

            }
    }
}
