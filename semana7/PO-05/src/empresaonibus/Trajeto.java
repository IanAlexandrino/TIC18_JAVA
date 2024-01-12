package empresaonibus;

import java.util.ArrayList;

public class Trajeto {

    private ArrayList<Trecho> trajeto;

    public Trajeto(){

        trajeto = new ArrayList<>();

    }

    public void setTrajeto(Trecho trecho) {
        trajeto.add(trecho);
    }

    public void getTrajeto() {
        for (Trecho trecho : trajeto){

            System.out.println(trecho);

        }
    }
}
