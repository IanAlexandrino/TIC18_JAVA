package conversor_moedas;

public class ConversorMoedas {
    private float valor;
    private float taxaCambio;

    public ConversorMoedas(){

    }

    public void setTaxaCambio(float taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void converteMoeda(float _valor, float _taxaCambio){

        this.valor = _valor;
        this.taxaCambio = _taxaCambio;

        float valorConvertido = valor * taxaCambio;

        System.out.println("O valor convertido é: " + valorConvertido + "\n");
    }
}
