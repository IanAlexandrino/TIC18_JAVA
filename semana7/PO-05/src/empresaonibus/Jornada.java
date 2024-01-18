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
        System.out.println("Motorista designado para a jornada: " + motorista.getNome());
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public void getVeiculo() {
        System.out.println("Veículo designado para a jornada: " + veiculo.getModelo());
    }

    public void setTrajetos(Trajeto trajeto) {
        this.trajetos.add(trajeto);
    }

    public void getTrajetos() {
        int i = 0;
        for (Trajeto trajeto : trajetos){
            i++;
            System.out.println(i + "° Trajeto: ");
            trajeto.getTrajeto();

        }
    }

    public void setIntervaloTempo(int intervaloTempo) {
        this.intervaloTempo = intervaloTempo;
    }

    public int getIntervaloTempo() {
        return intervaloTempo;
    }
}
