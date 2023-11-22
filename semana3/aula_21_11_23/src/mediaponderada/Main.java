package mediaponderada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MediaPonderada mediaPonderada = new MediaPonderada();
        float _nota1, _nota2, _nota3, _peso1, _peso2, _peso3;

        System.out.println("Calule a média ponderada de 3 valores: ");

        System.out.println("Nota 1: ");
        _nota1 = entrada.nextFloat();

        System.out.println("Peso da primeira nota: ");
        _peso1 = entrada.nextFloat();

        System.out.println("Nota 2: ");
        _nota2 = entrada.nextFloat();

        System.out.println("Peso da segunda nota: ");
        _peso2 = entrada.nextFloat();

        System.out.println("Nota 3:");
        _nota3 = entrada.nextFloat();

        System.out.println("Peso da terceira nota: ");
        _peso3 = entrada.nextFloat();

        mediaPonderada.CalculaMediaPonderada(_nota1, _nota2, _nota3, _peso1, _peso2, _peso3);
    }
}