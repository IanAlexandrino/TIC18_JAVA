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

    @Override
    public void estacionar(Garagem garagem) {
        garagem.estacionar(this);

        if (garagem.getTomadaCargaEletrica() == true && this.getEletrico() == true){

            System.out.println("Moto carregando!");

        } else {

            System.out.println("Moto estacionada!");

        }
    }
}
