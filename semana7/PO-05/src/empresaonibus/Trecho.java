package empresaonibus;

public class Trecho {

    private PontosParada origemTrecho;
    private PontosParada destinoTrecho;

    public Trecho(){

    }

    public void setOrigemTrecho(String origemTrecho) {
        this.origemTrecho = new PontosParada(origemTrecho);
    }

    public void getOrigemTrecho() {
        System.out.println(origemTrecho.getLocal());
    }

    public void setDestinoTrecho(String destinoTrecho) {
        this.destinoTrecho = new PontosParada(destinoTrecho);
    }

    public void getDestinoTrecho() {
        System.out.println(destinoTrecho.getLocal());
    }
}
