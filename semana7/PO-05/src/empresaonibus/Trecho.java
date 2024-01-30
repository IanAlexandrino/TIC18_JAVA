package empresaonibus;

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

    public void getOrigemTrecho() {
        System.out.println(origemTrecho.getLocal());
    }

    public void setDestinoTrecho(PontosParada destinoTrecho) {
        this.destinoTrecho = destinoTrecho;
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

    public boolean verificaOrigemDestino(){

        return origemTrecho != null && destinoTrecho != null;

    }
}
