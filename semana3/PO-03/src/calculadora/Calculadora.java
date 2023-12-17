package calculadora;

public class Calculadora {

    private int numInteiro1;
    private int numInteiro2;
    private float numFloat1;
    private float numFloat2;
    private String resultado;

    public Calculadora(){

    }

    public String operacaoAdicaoInt(int _num1, int _num2){

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        resultado = "\nO resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 + numInteiro2) + "\n";

        return resultado;
    }

    public String operacaoAdicaoFloat(float _num1, float _num2){

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        resultado = "\nO resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 + numFloat2) + "\n";

        return resultado;
    }

    public String operacaoSubtracaoInt(int _num1, int _num2){

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        resultado = "\nO resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 - numInteiro2) + "\n";

        return resultado;

    }

    public String operacaoSubtracaoFloat(float _num1, float _num2){

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        resultado = "\nO resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 - numFloat2) + "\n";

        return resultado;

    }

    public String operacaoMultiplicacaoInt(int _num1, int _num2){

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        resultado = "\nO resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 * numInteiro2) + "\n";

        return resultado;

    }

    public String operacaoMultiplicacaoFloat(float _num1, float _num2){

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        resultado = "\nO resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 * numFloat2) + "\n";

        return resultado;

    }

    public String operacaoDivisaoInt(int _num1, int _num2) throws DivisionByZeroException {

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        if (numInteiro2 == 0){

            throw new DivisionByZeroException("Divisão feita por zero não é permitida!\n");

        }

        resultado = "\nO resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 / numInteiro2) + "\n";

        return resultado;

    }

    public String operacaoDivisaoFloat(float _num1, float _num2) throws DivisionByZeroException {

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        if (numFloat2 == 0){

            throw new DivisionByZeroException("Divisão feita por zero não é permitida!\n");

        }

        resultado = "\nO resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 / numFloat2) + "\n";

        return resultado;

    }

}
