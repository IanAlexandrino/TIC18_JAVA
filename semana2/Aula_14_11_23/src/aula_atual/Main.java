package aula_atual;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio(0, 0, 0);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Que horas são? ");

        relogio.retornaHoraCompleta();

    }
}