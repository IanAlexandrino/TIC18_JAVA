package empresaonibus;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaOnibus {

    private ArrayList<Veiculo> veiculos;
    private ArrayList<Motorista> motoristas;
    private ArrayList<Cobrador> cobradores;
    private ArrayList<Passageiro> passageiros;

    public EmpresaOnibus(){

        veiculos = new ArrayList<>();
        motoristas = new ArrayList<>();
        cobradores = new ArrayList<>();
        passageiros = new ArrayList<>();

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
        for (Cobrador cobrador : cobradores){

            System.out.println(cobrador);

        }
    }

    public void setPassageiros(Passageiro passageiro) {
        passageiros.add(passageiro);
    }

    public void getPassageiros() {
        for (Passageiro passageiro : passageiros){

            System.out.println(passageiro);

        }
    }

    public void gerenciaTrajetoVeiculo(){

    }

    public void simulaViagem(){

    }

    public void MenuCadastro(){

    }

    public void MenuPesquisa(){

    }

    public void MenuViagem(){

    }

    public void main(String[] args) {

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
                    this.MenuCadastro();
                    break;

                case 2:
                    this.MenuPesquisa();
                    break;

                case 3:
                    this.MenuViagem();
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