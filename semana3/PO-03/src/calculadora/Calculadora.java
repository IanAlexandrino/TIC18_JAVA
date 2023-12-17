package calculadora;

public class Calculadora {

    private int numInteiro1;
    private int numInteiro2;
    private int numFloat1;
    private int numFloat2;
    private String resultado;

    public Calculadora(){

    }

    public String operacaoAdicaoInt(int _num1, int _num2){

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        resultado = "O resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 + numInteiro2);

        return resultado;
    }

    public String operacaoAdicaoFloat(int _num1, int _num2){

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        resultado = "O resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 + numFloat2);

        return resultado;
    }

    public String operacaoSubtracaoInt(int _num1, int _num2){

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        resultado = "O resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 - numInteiro2);

        return resultado;

    }

    public String operacaoSubtracaoFloat(int _num1, int _num2){

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        resultado = "O resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 - numFloat2);

        return resultado;

    }

    public String operacaoMultiplicacaoInt(int _num1, int _num2){

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        resultado = "O resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 * numInteiro2);

        return resultado;

    }

    public String operacaoMultiplicacaoFloat(int _num1, int _num2){

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        resultado = "O resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 * numFloat2);

        return resultado;

    }

    public String operacaoDivisaoInt(int _num1, int _num2){

        this.numInteiro1 = _num1;
        this.numInteiro2 = _num2;

        resultado = "O resultado da soma de " + numInteiro1 + " e " + numInteiro2 + " é: " + (numInteiro1 / numInteiro2);

        return resultado;

    }

    public String operacaoDivisaoFloat(int _num1, int _num2){

        this.numFloat1 = _num1;
        this.numFloat2 = _num2;

        resultado = "O resultado da soma de " + numFloat1 + " e " + numFloat2 + " é: " + (numFloat1 / numFloat2);

        return resultado;

    }

}
