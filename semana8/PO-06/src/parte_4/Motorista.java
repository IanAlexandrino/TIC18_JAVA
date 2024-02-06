package parte_4;

import java.util.ArrayList;

public class Motorista {

    private String nome;
    private ArrayList<Trajeto> trajetos;


    public Motorista(String nome){

        this.nome = nome;
        trajetos = new ArrayList<>();

    }

    public String getNome() {
        return nome;
    }

    public void setTrajetos(Trajeto trajeto) {
        trajetos.add(trajeto);
    }

    public void getTrajetos() {
        for (Trajeto trajeto : trajetos){

            System.out.println(trajeto);

        }
    }
}
