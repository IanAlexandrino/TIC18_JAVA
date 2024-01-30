package empresaonibus;

public class Trecho {

    private static int contagemTrecho;
    private PontosParada origemTrecho;
    private PontosParada destinoTrecho;
    private int intervalo;

    public Trecho(){

        contagemTrecho++;

    }

    public int getContagemTrecho() {
        return contagemTrecho;
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

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public int getIntervalo() {
        return intervalo;
    }
}
