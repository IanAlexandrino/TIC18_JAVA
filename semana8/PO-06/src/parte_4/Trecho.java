package parte_4;

public class Trecho {

    private static int contagemTrecho;
    private PontosParada origemTrecho;
    private PontosParada destinoTrecho;
    private int intervalo;

    public Trecho(){

        origemTrecho = new PontosParada();
        destinoTrecho = new PontosParada();
        contagemTrecho++;

    }

    public int getContagemTrecho() {
        return contagemTrecho;
    }

    public void setOrigemTrecho(PontosParada origemTrecho) {
        this.origemTrecho = origemTrecho;
    }

    public String getOrigemTrecho() {
        return origemTrecho.getLocal();
    }

    public void setDestinoTrecho(PontosParada destinoTrecho) {
        this.destinoTrecho = destinoTrecho;
    }

    public String getDestinoTrecho() {
        return destinoTrecho.getLocal();
    }

    public void setIntervalo(int intervalo) {
        this.intervalo = intervalo;
    }

    public int getIntervalo() {
        return intervalo;
    }

    public boolean verificaOrigemDestino(){

        return origemTrecho != null && destinoTrecho != null;

    }
}
