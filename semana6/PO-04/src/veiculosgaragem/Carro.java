package veiculosgaragem;

public class Carro extends Veiculo {

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
