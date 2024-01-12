package empresaonibus;

import java.util.ArrayList;

public class Veiculo {

    private String modelo;
    private ArrayList<PontosParada> pontosParadas;

    public Veiculo(){

        pontosParadas = new ArrayList<>();

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPontosParadas(PontosParada pontosParada) {
        pontosParadas.add(pontosParada);
    }

    public void getPontosParadas() {
        for (PontosParada pontosParada : pontosParadas){

            System.out.println(pontosParada);

        }
    }
}
