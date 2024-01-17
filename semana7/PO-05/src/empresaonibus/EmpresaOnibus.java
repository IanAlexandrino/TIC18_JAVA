package empresaonibus;

import java.util.ArrayList;

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

    public static void main(String[] args) {


    }
}