package trocavariaveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        TrocaVariaveis trocaVa = new TrocaVariaveis();
        int _valor1 = 5, _valor2 = 10;

        trocaVa.trocaVariaveis(_valor1, _valor2);
    }
}
