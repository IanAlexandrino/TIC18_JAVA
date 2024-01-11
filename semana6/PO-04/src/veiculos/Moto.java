package veiculos;

public class Moto extends Veiculo{

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
