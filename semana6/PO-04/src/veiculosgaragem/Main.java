package veiculosgaragem;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro("carro", "verde", 2019, true);
        Moto moto = new Moto("moto", "azul", 2020, true);
        Garagem garagem = new Garagem(true);

        System.out.println("\nCarro: ");
        System.out.println(carro.acelerar());
        System.out.println(carro.ligar());
        System.out.println(carro.parar());

        System.out.println("\nMoto: ");
        System.out.println(moto.acelerar());
        System.out.println(moto.ligar());
        System.out.println(moto.parar());

        garagem.estacionar(carro);
        garagem.estacionar(moto);
        garagem.listaVeiculos();
    }

}
