package parte_4;

import java.util.ArrayList;
import java.util.Random;

public class Trajeto {

    private final int contagemTrajeto;
    private ArrayList<Trecho> trajeto;
    private String trajetoAtual;
    private Checkpoint checkpoint;

    public Trajeto(){

        Random random = new Random();
        contagemTrajeto = random.nextInt(200);
        trajeto = new ArrayList<>();

    }

    public int getContagemTrajeto() {

        return contagemTrajeto;
    }

    public void setTrajeto(Trecho trecho) {
        trajeto.add(trecho);
    }

    public ArrayList<Trecho> getTrajeto() {

        return trajeto;
    }
}
