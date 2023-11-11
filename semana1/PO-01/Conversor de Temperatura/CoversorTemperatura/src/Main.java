import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conversor conversor = new Conversor();
        Scanner entrada = new Scanner(System.in);
        int op = 0;
        float auxC;
        float auxF;

        do {
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            System.out.println("&&&&&&&&&&&&&&&&&CONVERSOR&&&&&&&&&&&&&&&&&");
            System.out.println("&&&&&&&&&&&&&&&&TEMPERATURA&&&&&&&&&&&&&&&&");
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

            System.out.println("\n1. Converter Celsius para Fahrenheit");
            System.out.println("2. Converter Fahrenheit para Celsius");
            System.out.println("3. Sair\n");

            op = entrada.nextInt();

            if(op == 1){

                System.out.println("\nDigite quantos graus Celsius devem ser convertidos para Fahrenheit: \n");
                auxC = entrada.nextFloat();

                conversor.ConverteCelsiusFahrenheit(auxC);

            }else if(op == 2){

                System.out.println("\nDigite quantos graus Fahrenheit devem ser convertidos para Celsius: \n");
                auxF = entrada.nextFloat();

                conversor.ConverteFahrenheitCelsius(auxF);

            }else if(op < 1 || op > 3){

                System.out.println("\nOpção inválida, por favor, informe uma opção válida!\n");

            }else{

            }

        }while(op != 3);

        System.out.println("\nAté a próxima!");

    }
}