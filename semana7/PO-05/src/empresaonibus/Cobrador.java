package empresaonibus;

import java.util.ArrayList;

public class Cobrador {

    private String nome;
    private Jornada jornada;
    private ArrayList<Trajeto> trajetos;

    public Cobrador(String nome){

        this.nome = nome;
        trajetos = new ArrayList<>();

    }

    public void setJornada(int intervaloTempo) {
        this.jornada = new Jornada(intervaloTempo);
    }

    public void getJornada() {
        System.out.println(jornada.getIntervaloTempo());
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
