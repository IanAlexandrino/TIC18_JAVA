package veiculosgaragem;

import java.util.ArrayList;
import java.util.Scanner;

public class Garagem {

    private ArrayList<Veiculo> veiculos;
    private boolean tomadaCargaEletrica;

    public Garagem (boolean tomadaCargaEletrica){

        this.tomadaCargaEletrica = tomadaCargaEletrica;
        veiculos = new ArrayList();

    }

    public void estacionar(Veiculo veiculo){

        veiculos.add(veiculo);

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
