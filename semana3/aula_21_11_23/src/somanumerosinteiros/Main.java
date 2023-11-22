package somanumerosinteiros;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SomaNumeros soma = new SomaNumeros();
        int _nmr1;
        int _nmr2;

        System.out.println("Digite dois números para serem somados!");

        System.out.println("Número 1: ");
        _nmr1 = entrada.nextInt();

        System.out.println("Número 2: ");
        _nmr2 = entrada.nextInt();

        soma.CalculaNumeros(_nmr1, _nmr2);
    }
}