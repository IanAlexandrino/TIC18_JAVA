package concatenandostrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ConcatenaString objString = new ConcatenaString();
        String _string1, _string2, _string3;
        int op;

        System.out.println("Digite a sua primeira string: ");
        _string1 = entrada.nextLine();

        System.out.println("Digite a sua segunda string: ");
        _string2 = entrada.nextLine();

        do {
            System.out.println("    Menu    ");

            System.out.println("1. Concatenar strings");
            System.out.println("2. Exibir strings");
            System.out.println("3. Sair");

            System.out.println("Opção: ");
            op = entrada.nextInt();

            if (op == 1){
                objString.ConcatenaStrings(_string1, _string2);
            } else if (op == 2){
                objString.ExibeStrings();
            } else if (op < 1 || op > 3){
                System.out.println("Opação inexistente!");
            }else{

            }

        }while (op != 3);

        System.out.println("Até a próxima!");
    }
}
