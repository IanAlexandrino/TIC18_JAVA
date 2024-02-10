package parte_4;

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
        PontosParadaCSV.insereDadosArquivo(pontosParada);
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
        TrechoCSV.insereDadosArquivo(trecho);
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

    public void setJornadas(Jornada jornada){

        jornadas.add(jornada);

    }

    public void getJornadas() {
        int contador = 0;

        for (Jornada jornada : jornadas){
            contador++;
            System.out.println(contador + "ª Jornada:");
            jornada.getMotorista();
            jornada.getVeiculo();
            jornada.getCobrador();
            jornada.getTrajetos();
            System.out.println(jornada.getIntervaloTempo());

        }
    }

    public void carregaDados(){

        pontosParadas.addAll(PontosParadaCSV.carregaDadosArquivo());
        trechos.addAll(TrechoCSV.carregaDadosArquivo());

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
                    Scanner entradaPontosParada = new Scanner(System.in);
                    System.out.println("Informe o nome do local que vai ser cadastrado como um ponto de parada: ");
                    String auxPontoParada = entradaPontosParada.nextLine();
                    PontosParada pontosParada = new PontosParada();
                    pontosParada.setLocal(auxPontoParada);
                    setPontosParadas(pontosParada);
                    break;

                case 6 :
                    if (pontosParadas.isEmpty() || pontosParadas.size() == 1){

                        System.out.println("Para criar um trecho você precisa ter cadastrado no mínimo 2 pontos de parada!!");

                    } else {

                        Trecho trecho = new Trecho();
                        boolean auxTrecho = true;

                        while (auxTrecho){

                            System.out.println("Dentre esses pontos de parada escolha um para ser o de origem: ");
                            getPontosParadas();
                            String auxPontoOrigem = entrada.nextLine();

                            System.out.println("Agora dentre esses pontos de parada escolha um para ser o de destino: ");
                            getPontosParadas();
                            String auxPontoDestino = entrada.nextLine();

                            for (PontosParada auxPontosParada : pontosParadas){

                                if (auxPontosParada.getLocal() == auxPontoOrigem){

                                    trecho.setOrigemTrecho(auxPontosParada);

                                } else if (auxPontosParada.getLocal() == auxPontoDestino){

                                    trecho.setDestinoTrecho(auxPontosParada);

                                }

                            }

                            if (!trecho.verificaOrigemDestino()){

                                System.out.println("Um dos pontos de origem ou destino não está cadastrado, por favor, cadastre um ponto válido!!");

                            } else {

                                auxTrecho = false;
                                setTrechos(trecho);

                            }

                        }

                    }

                    break;

                case 7:
                    if (trechos.isEmpty()){

                        System.out.println("Crie um trecho primeiro para poder fazer o cadastro de trajetos!!");

                    } else {

                        boolean auxLoopTrecho = true;
                        Trajeto trajeto = new Trajeto();
                        int auxIdTrecho;
                        String auxUserLoopTrecho;

                        while (auxLoopTrecho){

                            System.out.println("Escolha o id de um trecho para adicionar no trajeto: ");
                            getTrechos();
                            auxIdTrecho = entrada.nextInt();

                            for (Trecho trecho : trechos){

                                if (trecho.getContagemTrecho() == auxIdTrecho){

                                    trajeto.setTrajeto(trecho);

                                }

                            }

                            System.out.println("Deseja adicionar mais trechos ao trajeto(S/N)?");
                            auxUserLoopTrecho = entrada.nextLine();
                            if (auxUserLoopTrecho == "N"){

                                auxLoopTrecho = false;
                                setTrajetos(trajeto);

                            }

                        }

                    }
                    break;

                case 8:
                    if (motoristas.isEmpty()){

                        System.out.println("Cadastre primeiro um motorista para continuar com o cadastro de uma Jornada!!");

                    } else if (veiculos.isEmpty()) {

                        System.out.println("Cadastre primeiro um Veículo para continuar com o cadastro de uma Jornada!!");

                    } else if (cobradores.isEmpty()) {

                        System.out.println("Cadastre primeiro um cobrador para continuar com o cadastro de uma Jornada!!");

                    } else if (trajetos.isEmpty()) {

                        System.out.println("Cadastre primeiro um trajeto para continuar com o cadastro de uma Jornada!!");

                    } else {

                        boolean auxLoopTrajetoJornada = true;
                        Jornada jornada = new Jornada();
                        String auxMotorista, auxLoopTrajeto, auxVeiculo, auxCobrador;
                        int auxIntervaloTempo;

                        int auxTrajeto;

                        System.out.println("Informe o nome do motorista que você quer cadastrar para a jornada:");
                        getMotoristas();
                        auxMotorista = entrada.nextLine();

                        for (Motorista motorista : motoristas){

                            if (motorista.getNome() == auxMotorista){

                                jornada.setMotorista(motorista);

                            }

                        }

                        System.out.println("Informe o modelo do veículo que você quer cadastrar para a jornada:");
                        getVeiculos();
                        auxVeiculo = entrada.nextLine();

                        for (Veiculo veiculo : veiculos){

                            if (veiculo.getModelo() == auxVeiculo){

                                jornada.setVeiculo(veiculo);

                            }

                        }

                        System.out.println("Informe o nome do cobrador que você quer cadastrar para a jornada:");
                        getCobradores();
                        auxCobrador = entrada.nextLine();

                        for (Cobrador cobrador : cobradores){

                            if (cobrador.getNome() == auxCobrador){

                                jornada.setCobrador(cobrador);

                            }

                        }

                        while (auxLoopTrajetoJornada){

                            System.out.println("Informe o id do trajeto que você quer cadastrar para a jornada");
                            getTrajetos();
                            auxTrajeto = entrada.nextInt();

                            for (Trajeto trajeto : trajetos){

                                if (trajeto.getContagemTrajeto() == auxTrajeto){

                                    jornada.setTrajetos(trajeto);

                                }

                            }

                            System.out.println("Você deseja adicionar mais algum trajeto(S/N)?");
                            auxLoopTrajeto = entrada.nextLine();
                            if (auxLoopTrajeto == "N"){

                                auxLoopTrajetoJornada = false;

                            }

                        }

                        System.out.println("Informe o intervalo de tempo da Jornada:");
                        auxIntervaloTempo = entrada.nextInt();
                        jornada.setIntervaloTempo(auxIntervaloTempo);

                        setJornadas(jornada);
                    }
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

        Scanner entrada = new Scanner(System.in);
        boolean auxWhile = true;
        int auxMenuPesquisa;

        while (auxWhile) {

            System.out.print("##--Área de Pesquisa--##\n\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("| Opção 1 - Veículos cadastrados          |\n");
            System.out.print("| Opção 2 - Motoristas cadastrados        |\n");
            System.out.print("| Opção 3 - Cobradores cadastrados        |\n");
            System.out.print("| Opção 4 - Passageiros cadastrados       |\n");
            System.out.print("| Opção 5 - Pontos de parada cadastrados  |\n");
            System.out.print("| Opção 6 - Trechos cadastrados           |\n");
            System.out.print("| Opção 7 - Trajetos cadastrados          |\n");
            System.out.print("| Opção 8 - Jornadas cadastradas          |\n");
            System.out.print("| Opção 9 - Voltar                        |\n");
            System.out.print("|-----------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            auxMenuPesquisa = entrada.nextInt();

            switch (auxMenuPesquisa){

                case 1:
                    getVeiculos();
                    break;

                case 2:
                    getMotoristas();
                    break;

                case 3:
                    getCobradores();
                    break;

                case 4:
                    getPassageiros();
                    break;

                case 5:
                    getPontosParadas();
                    break;

                case 6:
                    getTrechos();
                    break;

                case 7:
                    getTrajetos();
                    break;

                case 8:
                    getJornadas();
                    break;

                case 9:
                    auxWhile = false;
                    break;

                default:

                    System.out.println("Opção incorreta, por favor, tente novamente!");

            }

        }
    }

    public void menuViagem(){

    }

    public static void main(String[] args) {


        EmpresaOnibus empresaOnibus = new EmpresaOnibus();
        empresaOnibus.carregaDados();
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
                    empresaOnibus.menuCadastro();
                    break;

                case 2:
                    empresaOnibus.menuPesquisa();
                    break;

                case 3:
                    empresaOnibus.menuViagem();
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