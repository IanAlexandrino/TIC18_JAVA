package empresaonibus;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaOnibus {

    private ArrayList<Veiculo> veiculos;
    private ArrayList<Motorista> motoristas;
    private ArrayList<Cobrador> cobradores;
    private ArrayList<Passageiro> passageiros;
    private ArrayList<PontosParada> pontosParadas;

    public EmpresaOnibus(){

        veiculos = new ArrayList<>();
        motoristas = new ArrayList<>();
        cobradores = new ArrayList<>();
        passageiros = new ArrayList<>();
        pontosParadas = new ArrayList<>();

    }

    public void setVeiculos(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void getVeiculos() {
        for (Veiculo veiculo : veiculos){

            System.out.println(veiculo);

        }
    }

    public void setMotoristas(Motorista motorista) {
        motoristas.add(motorista);
    }

    public void getMotoristas() {
        for (Motorista motorista : motoristas){

            System.out.println(motorista);

        }
    }

    public void setCobradores(Cobrador cobrador) {
        cobradores.add(cobrador);
    }

    public void getCobradores() {
        System.out.println("Cobradores:\n");
        for (Cobrador cobrador : cobradores){

            System.out.println("Cobrador: " + cobrador.getNome());
            cobrador.getTrajetos();

        }
    }

    public void setPassageiros(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void getPassageiros() {
        System.out.println("Passageiros:\n");
        for (Passageiro passageiro : passageiros){

            System.out.println("Passageiro: " + passageiro.getNome());
            System.out.println("Tipo de cartão do passageiro: " + passageiro.getCartaoPassageiro());
            passageiro.getTrechoPassageiro();
            System.out.println("---------------------------------------");

        }
    }

    public void setPontosParadas(PontosParada pontosParada) {
        this.pontosParadas.add(pontosParada);
    }

    public void getPontosParadas() {
        System.out.println("Pontos de parada:\n");
        for (PontosParada pontosParada : pontosParadas){

            System.out.println("Local: " + pontosParada.getLocal());

        }
    }

    public void gerenciaTrajetoVeiculo(){

    }

    public void simulaViagem(){

    }

    public static void menuCadastro(){

        Scanner entrada = new Scanner(System.in);
        boolean auxwhile = true;
        int auxMenuCadastro;

        while (auxwhile){

            System.out.print("##--Área de Cadastro--##\n\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("| Opção 1 - Cadastro de Veículos          |\n");
            System.out.print("| Opção 2 - Cadastro de Motoristas        |\n");
            System.out.print("| Opção 3 - Cadastro de Cobradores        |\n");
            System.out.print("| Opção 4 - Cadastro de Passageiros       |\n");
            System.out.print("| Opção 5 - Cadastro de Pontos de parada  |\n");
            System.out.print("| Opção 6 - Voltar                        |\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            auxMenuCadastro = entrada.nextInt();

            switch (auxMenuCadastro){

                case 1:
                    this.menuCadastro();
                    break;

                case 2:
                    this.menuPesquisa();
                    break;

                case 3:
                    this.menuViagem();
                    break;

                case 4:
                    auxwhile = false;
                    System.out.println("Até a próxima!!");
                    break;

                default:
                    System.out.println("Opção incorreta, por favor, tente novamente!");
            }

        }

    }

    public static void menuPesquisa(){

    }

    public static void menuViagem(){

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean auxwhile = true;
        int auxMenuPrincipal;

        while (auxwhile){

            System.out.print("##--Empresa Ônibus--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Área de Cadastro  |\n");
            System.out.print("| Opção 2 - Área de Pesquisa  |\n");
            System.out.print("| Opção 3 - Simular Viagem    |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            auxMenuPrincipal = entrada.nextInt();

            switch (auxMenuPrincipal){

                case 1:
                    menuCadastro();
                    break;

                case 2:
                    menuPesquisa();
                    break;

                case 3:
                    menuViagem();
                    break;

                case 4:
                    auxwhile = false;
                    System.out.println("Até a próxima!!");
                    break;

                default:
                    System.out.println("Opção incorreta, por favor, tente novamente!");
            }

        }

    }
}