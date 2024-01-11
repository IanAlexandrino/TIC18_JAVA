package veiculosgaragem;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();
        Garagem garagem = new Garagem();

        System.out.println("\nCarro: ");
        System.out.println(carro.acelerar());
        System.out.println(carro.ligar());
        System.out.println(carro.parar());

        System.out.println("\nMoto: ");
        System.out.println(moto.acelerar());
        System.out.println(moto.ligar());
        System.out.println(moto.parar());

        garagem.estacionar();
        garagem.estacionar();
        garagem.listaVeiculos();
    }

}
