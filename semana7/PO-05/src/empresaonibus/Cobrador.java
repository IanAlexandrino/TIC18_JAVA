package empresaonibus;

public class Cobrador {

    private Jornada jornada;

    public Cobrador(){

    }

    public void setJornada(int intervaloTempo) {
        this.jornada = new Jornada(intervaloTempo);
    }

    public void getJornada() {
        System.out.println(jornada.getIntervaloTempo());
    }
}
