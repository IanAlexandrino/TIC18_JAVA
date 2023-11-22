package trocavariaveis;

public class TrocaVariaveis {
    private int valor1;
    private int valor2;
    private int valorAux;

    public void trocaVariaveis(int _valor1, int _valor2){
        this.valor1 = _valor1;
        this.valor2 = _valor2;

        valorAux = valor1;
        valor1 = valor2;
        valor2 = valorAux;

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
}
