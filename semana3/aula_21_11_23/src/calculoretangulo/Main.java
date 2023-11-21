package calculoretangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CalculaAreaRetangulo areaTrian = new CalculaAreaRetangulo();
        int _altura, _largura;

        System.out.println("Digite a altura do triângulo: ");
        _altura = entrada.nextInt();

        System.out.println("Digite a largura do triângulo: ");
        _largura = entrada.nextInt();

        areaTrian.calculaArea(_altura, _largura);
    }
}
