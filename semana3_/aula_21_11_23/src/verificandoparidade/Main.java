package verificandoparidade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ParidadeInteiros paridadeInteiros = new ParidadeInteiros();
        int _num;

        System.out.println("Informe um número para saber se el é par ou impar: ");
        _num = entrada.nextInt();

        paridadeInteiros.ParImpar(_num);

    }
}
