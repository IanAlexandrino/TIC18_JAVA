package veiculosgaragem;

public class Moto extends Veiculo {

    public Moto(String modelo, String cor, int ano, boolean eletrico) {
        super(modelo, cor, ano, eletrico);
    }

    @Override
    public String acelerar() {
        return "Moto acelerando!";
    }

    @Override
    public String ligar() {
        return "Moto ligada!";
    }

    @Override
    public String parar() {
        return "Moto parada!";
    }

}
