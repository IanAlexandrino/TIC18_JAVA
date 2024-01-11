package veiculosgaragem;

import java.util.ArrayList;
import java.util.Scanner;

public class Garagem {

    private ArrayList<Veiculo> veiculos;
    private boolean tomadaCargaEletrica;

    public Garagem (){

        veiculos = new ArrayList();

    }

    public void estacionar(){

        Scanner entrada = new Scanner(System.in);
        int op;

        System.out.println("Qual o tipo do seu veículo?");

        System.out.println("1. Carro");
        System.out.println("2. Moto");

        op = entrada.nextInt();

        if (op == 1){

            Carro carro = new Carro();
            carro.setModelo("carro");
            carro.setCor("verde");
            carro.setAno(2019);
            carro.setEletrico(true);

            veiculos.add(carro);


        } else if (op == 2){

            Moto moto = new Moto();
            moto.setModelo("moto");
            moto.setCor("azul");
            moto.setAno(2020);
            moto.setEletrico(true);

            veiculos.add(moto);

        }

    }

    public void removerVeiculos(){

        Scanner entrada = new Scanner(System.in);
        String auxModelo;
        String auxCor;
        int auxAno;
        boolean auxEletrico;

        System.out.println("Informe os dados do veículo que você quer remover: ");

        System.out.println("Modelo: ");
        auxModelo = entrada.nextLine();

        System.out.println("Cor: ");
        auxCor = entrada.nextLine();

        System.out.println("Ano: ");
        auxAno = entrada.nextInt();

        System.out.println("Veículo elétrico? ");
        auxEletrico = entrada.nextBoolean();

        for (Veiculo veiculo : veiculos){

            if (veiculo.getModelo() == auxModelo && veiculo.getCor() == auxCor && veiculo.getAno() == auxAno && veiculo.getEletrico() == auxEletrico){

                veiculos.remove(veiculo);

            }

        }

    }

    public void listaVeiculos(){

        for (Veiculo veiculo : veiculos){
            System.out.println("Modelo: " + veiculo.getModelo() + "\nCor: " + veiculo.getCor() + "\nAno: " + veiculo.getAno() + "\nVeículo elétrico? " + veiculo.getEletrico());
        }

    }
}
