package veiculosgaragem;

public class Carro extends Veiculo {

    public Carro(String modelo, String cor, int ano, boolean eletrico) {
        super(modelo, cor, ano, eletrico);
    }

    @Override
    public String acelerar() {
        return "Carro acelerando!";
    }

    @Override
    public String ligar() {
        return "Carro ligado!";
    }

    @Override
    public String parar() {
        return "Carro parado!";
    }

}
