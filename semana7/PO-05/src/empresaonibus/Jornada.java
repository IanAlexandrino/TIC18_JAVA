package empresaonibus;

import java.util.ArrayList;

public class Jornada {

    private Motorista motorista;
    private Veiculo veiculo;
    private ArrayList<Trajeto> trajetos;
    private int intervaloTempo;

    public Jornada(){

        trajetos = new ArrayList<>();

    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public void getMotorista() {
        System.out.println("Motorista direcionado para a jornada: " + motorista.getNome());
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setIntervaloTempo(int intervaloTempo) {
        this.intervaloTempo = intervaloTempo;
    }

    public int getIntervaloTempo() {
        return intervaloTempo;
    }
}
