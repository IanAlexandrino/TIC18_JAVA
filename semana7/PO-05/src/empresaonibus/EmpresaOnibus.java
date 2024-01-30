package empresaonibus;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaOnibus {

    private ArrayList<Veiculo> veiculos;
    private ArrayList<Motorista> motoristas;
    private ArrayList<Cobrador> cobradores;
    private ArrayList<Passageiro> passageiros;
    private ArrayList<PontosParada> pontosParadas;
    private ArrayList<Trecho> trechos;
    private ArrayList<Trajeto> trajetos;
    private ArrayList<Jornada> jornadas;



    public EmpresaOnibus(){

        veiculos = new ArrayList<>();
        motoristas = new ArrayList<>();
        cobradores = new ArrayList<>();
        passageiros = new ArrayList<>();
        pontosParadas = new ArrayList<>();
        trechos = new ArrayList<>();
        trajetos = new ArrayList<>();
        jornadas = new ArrayList<>();

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

    public void setTrajetos(Trajeto trajeto){

        this.trajetos.add(trajeto);

    }

    public void getTrajetos(){

        System.out.println("Trajetos: \n");
        for (Trajeto trajeto : trajetos){
            System.out.println("Id do trajeto: " + trajeto.getContagemTrajeto());
            trajeto.getTrajeto();

            System.out.println("\n-----------------------------\n");
        }

    }

    public void setTrechos(Trecho trecho) {
        this.trechos.add(trecho);
    }

    public void getTrechos(){

        System.out.println("Trechos: ");
        for (Trecho trecho : trechos){

            System.out.println("Id do trecho: " + trecho.getContagemTrecho());
            System.out.println("Origem: ");
            trecho.getOrigemTrecho();
            System.out.println("Destino: ");
            trecho.getDestinoTrecho();

            System.out.println("\n-----------------------------\n");
        }

    }

    public void simulaViagem(){

    }

    public void menuCadastro(){

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
            System.out.print("| Opção 6 - Cadastro de Trechos           |\n");
            System.out.print("| Opção 7 - Cadastro de Trajetos          |\n");
            System.out.print("| Opção 8 - Cadastro de Jornadas          |\n");
            System.out.print("| Opção 9 - Voltar                        |\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            auxMenuCadastro = entrada.nextInt();

            switch (auxMenuCadastro){

                case 1:
                    if (trajetos.isEmpty()){

                        System.out.println("Crie um trajeto primeiro para poder fazer o cadastro de veículos!!");

                    } else {

                        boolean auxLoopTrajeto = true;
                        System.out.println("Identifique o modelo do veículo que você quer cadastrar: ");
                        String auxModeloVeiculo = entrada.nextLine();
                        Veiculo veiculo = new Veiculo(auxModeloVeiculo);

                        while (auxLoopTrajeto){

                            System.out.println("Escolha o id do trajeto que vc quer designar para o veículo: ");
                            getTrajetos();

                            int auxIdTrajeto = entrada.nextInt();

                            for (Trajeto trajeto : trajetos){

                                if (trajeto.getContagemTrajeto() == auxIdTrajeto){

                                    veiculo.setTrajetos(trajeto);

                                }

                            }

                            System.out.println("Quer adicionar mais algum trajeto para o veículo?(S/N)");

                            String auxLoop = entrada.nextLine();

                            if (auxLoop == "N"){

                                auxLoopTrajeto = false;
                                setVeiculos(veiculo);

                            }

                        }

                    }
                    break;

                case 2:
                    if (trajetos.isEmpty()){

                        System.out.println("Crie um trajeto primeiro para poder fazer o cadastro de motoristas!!");

                    } else {

                        boolean auxLoopTrajeto = true;
                        System.out.println("Identifique o nome do motorista que você quer cadastrar: ");
                        String auxNomeMotorista = entrada.nextLine();
                        Motorista motorista = new Motorista(auxNomeMotorista);

                        while (auxLoopTrajeto){

                            System.out.println("Escolha o id do trajeto que vc quer designar para o motorista: ");
                            getTrajetos();

                            int auxIdTrajeto = entrada.nextInt();

                            for (Trajeto trajeto : trajetos){

                                if (trajeto.getContagemTrajeto() == auxIdTrajeto){

                                    motorista.setTrajetos(trajeto);

                                }

                            }

                            System.out.println("Quer adicionar mais algum trajeto para o motorista?(S/N)");

                            String auxLoop = entrada.nextLine();

                            if (auxLoop == "N"){

                                auxLoopTrajeto = false;
                                setMotoristas(motorista);

                            }

                        }

                    }
                    break;

                case 3:
                    if (trajetos.isEmpty()){

                        System.out.println("Crie um trajeto primeiro para poder fazer o cadastro de cobradores!!");

                    } else {

                        boolean auxLoopTrajeto = true;
                        System.out.println("Identifique o nome do cobrador que você quer cadastrar: ");
                        String auxNomeCobrador = entrada.nextLine();
                        Cobrador cobrador = new Cobrador(auxNomeCobrador);

                        while (auxLoopTrajeto){

                            System.out.println("Escolha o id do trajeto que vc quer designar para o cobrador: ");
                            getTrajetos();

                            int auxIdTrajeto = entrada.nextInt();

                            for (Trajeto trajeto : trajetos){

                                if (trajeto.getContagemTrajeto() == auxIdTrajeto){

                                    cobrador.setTrajetos(trajeto);

                                }

                            }

                            System.out.println("Quer adicionar mais algum trajeto para o cobrador?(S/N)");

                            String auxLoop = entrada.nextLine();

                            if (auxLoop == "N"){

                                auxLoopTrajeto = false;
                                setCobradores(cobrador);

                            }

                        }

                    }
                    break;

                case 4:
                    if (trechos.isEmpty()){

                        System.out.println("Crie um trecho primeiro para poder fazer o cadastro de passageiros!!");

                    } else {

                        System.out.println("Identifique o nome do passageiro que você quer cadastrar: ");
                        String auxNomePassageiro = entrada.nextLine();
                        Passageiro passageiro = new Passageiro();
                        passageiro.setNome(auxNomePassageiro);



                        System.out.println("Escolha o id do trecho que vc quer designar para o passageiro: ");
                        getTrechos();

                        int auxIdTrecho = entrada.nextInt();

                        for (Trecho trecho : trechos){

                            if (trecho.getContagemTrecho() == auxIdTrecho){

                                passageiro.setTrechoPassageiro(trecho);

                            }

                        }

                        setPassageiros(passageiro);

                    }
                    break;

                case 5:
                    System.out.println("Informe o nome do local que vai ser cadastrado como um ponto de parada: ");
                    String auxPontoParada = entrada.nextLine();
                    PontosParada pontosParada = new PontosParada(auxPontoParada);
                    setPontosParadas(pontosParada);
                    break;

                case 6 :

                    break;

                case 9:
                    auxwhile = false;
                    break;

                default:
                    System.out.println("Opção incorreta, por favor, tente novamente!");
            }

        }

    }

    public void menuPesquisa(){

    }

    public void menuViagem(){

    }

}