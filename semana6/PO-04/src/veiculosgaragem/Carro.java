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

    @Override
    public void estacionar(Garagem garagem) {
        garagem.estacionar(this);

        if (garagem.getTomadaCargaEletrica() == true && this.getEletrico() == true){

            System.out.println("Carro carregando!");

        } else {

            System.out.println("Carro estacionado!");

        }
    }
}
