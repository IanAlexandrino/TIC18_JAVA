import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner entrada = new Scanner(System.in);
        int op = 0;

        do {

            System.out.println("#####################################");
            System.out.println("#############CALCULADORA#############");
            System.out.println("#####################################");

            System.out.println("\n1. Calcular números");
            System.out.println("2. Sair do programa\n");

            op = entrada.nextInt();

            if (op == 1){
                calculadora.CalculoNumeros();
            }else if (op < 1 || op > 2){

                System.out.println("\nOpção informada não existe, por favor, escolha uma opção válida!\n");

            }else{

            }

        }while(op != 2);

        System.out.println("\nAté a próxima!!!");

    }
}