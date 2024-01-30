package empresaonibus;

import java.util.ArrayList;

public class Trajeto {

    private static int contagemTrajeto;
    private ArrayList<Trecho> trajeto;
    private String trajetoAtual;
    private Checkpoint checkpoint;

    public Trajeto(){

        contagemTrajeto++;
        trajeto = new ArrayList<>();

    }

    public int getContagemTrajeto() {

        return contagemTrajeto;
    }

    public void setTrajeto(Trecho trecho) {
        trajeto.add(trecho);
    }

    public void getTrajeto() {
        int i = 0;
        for (Trecho trecho : trajeto){
            i++;
            System.out.println(i + "° Trecho: ");

            System.out.println("Origem: ");
            trecho.getOrigemTrecho();

            System.out.println("Destino: ");
            trecho.getDestinoTrecho();

        }
    }
}
