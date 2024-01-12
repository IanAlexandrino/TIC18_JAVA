package empresaonibus;

import java.util.ArrayList;

public class Veiculo {

    private String modelo;
    private ArrayList<Trajeto> trajetos;

    public Veiculo(){

        trajetos = new ArrayList<>();

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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
}
