package empresaonibus;

public class Motorista {

    private Jornada jornada;

    public Motorista(){

    }

    public void setJornada(int intervaloTempo) {
        this.jornada = new Jornada(intervaloTempo);
    }

    public void getJornada() {
        System.out.println(jornada.getIntervaloTempo());
    }
}
