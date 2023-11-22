package trocavariaveis2;

public class TrocaVariaveis2 {
    private int valor1;
    private int valor2;

    public void trocaVariaveis(int _valor1, int _valor2){
        this.valor1 = _valor1;
        this.valor2 = _valor2;

        valor1 = valor1^valor2;
        valor2 = valor2^valor1;
        valor1 = valor1^valor2;

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
}
