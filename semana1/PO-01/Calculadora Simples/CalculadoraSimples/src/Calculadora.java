import java.util.Scanner;

public class Calculadora {
    private float num1;
    private float num2;

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getNum2() {
        return num2;
    }

    public void CalculoNumeros(){
        Scanner entrada = new Scanner(System.in);
        int opCalculo = 0;
        float resultado;

        System.out.println("\nDigite o primeiro número que você quer calcular: ");
        num1 = entrada.nextFloat();

        System.out.println("\nAgora digite o segundo número que você quer calcular: ");
        num2 = entrada.nextFloat();

        System.out.println("\nInforme qual cálculo matemático você quer que seja feito: \n");
        do {

            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Divisão");
            System.out.println("4. Multiplicação\n");

            opCalculo = entrada.nextInt();

            switch (opCalculo) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("\nO resultado da adição entre os dois elementos informados é: " + resultado + "\n");
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("\nO resultado da subtração entre os dois elementos informados é: " + resultado + "\n");
                    break;
                case 3:
                    resultado = num1 / num2;
                    System.out.println("\nO resultado da divisão entre os dois elementos informados é: " + resultado + "\n");
                    break;
                case 4:
                    resultado = num1 * num2;
                    System.out.println("\nO resultado da multiplicação entre os dois elementos informados é: " + resultado + "\n");
                    break;
                default:
                    System.out.println("\nOpção informada não existe, por favor, escolha uma opção válida!\n");

            }
        }while (opCalculo < 1 || opCalculo > 4) ;

    }
}
