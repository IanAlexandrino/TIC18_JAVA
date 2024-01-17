package empresaonibus;

import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo {

    private String modelo;
    private ArrayList<Trajeto> trajetos;
    private Checkpoint checkpoint;

    public Veiculo(String modelo){

        this.modelo = modelo;
        trajetos = new ArrayList<>();

    }

    public String getModelo() {
        return modelo;
    }

    public void setTrajetos(Trajeto trajeto) {
        trajetos.add(trajeto);
    }

    public void getTrajetos() {
        for (Trajeto trajeto : trajetos){

            System.out.println(trajeto);

        }
    }

    public void setCheckpoint(Checkpoint checkpoint) {
        this.checkpoint = checkpoint;
    }

    public void getCheckpoint() {
        System.out.println("Local do checkpoint: " + checkpoint.getLocalCheckpoint() + "\n\nHora em que o veículo chegou no checkpoint: " + checkpoint.getHoraCheckpoint());
    }

    public void gravaHoraCheckpoint(){

        Scanner entrada = new Scanner(System.in);
        int auxHora;
        int auxMin;

        System.out.println("Veículo chegou no checkpoint, informe a hora que ele chegou(Ex: 09:35): ");
        System.out.println("Hora: ");
        auxHora = entrada.nextInt();

        System.out.println("Minuto: ");
        auxMin = entrada.nextInt();

        checkpoint.setHoraCheckpoint(auxHora + ":" + auxMin);

    }
}
