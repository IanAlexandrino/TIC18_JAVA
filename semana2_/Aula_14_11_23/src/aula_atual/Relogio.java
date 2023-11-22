package aula_atual;

public class Relogio{

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio(int _hora, int _minuto, int _segundo){
        this.hora = _hora;
        this.minuto = _minuto;
        this.segundo = _segundo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public void insereHoraCompleta(int _hora, int _minuto, int _segundo) {

        this.hora = _hora;
        this.minuto = _minuto;
        this.segundo = _segundo;

    }

    public void retornaHoraCompleta() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public void avancar(){

        segundo++;

        if (segundo > 59){

            minuto++;
            segundo = 0;

            if (minuto > 59){

                hora++;
                minuto = 0;

                if (hora > 23){

                    hora = 0;
                }
            }
        }
    }
}
