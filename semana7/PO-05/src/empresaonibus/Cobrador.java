package empresaonibus;

import java.util.ArrayList;

public class Cobrador {

    private String nome;
    private ArrayList<Trajeto> trajetos;

    public Cobrador(String nome){

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

            trajeto.getTrajeto();

        }
    }
}
