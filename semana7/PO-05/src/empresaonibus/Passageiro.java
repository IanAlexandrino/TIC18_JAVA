package empresaonibus;

public class Passageiro {

    private String Nome;
    private String cartaoPassageiro;
    private Trecho trechoPassageiro;

    public Passageiro(){

        trechoPassageiro = new Trecho();

    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setCartaoPassageiro(String cartaoPassageiro) {
        this.cartaoPassageiro = cartaoPassageiro;
    }

    public String getCartaoPassageiro() {
        return cartaoPassageiro;
    }

    public void setTrechoPassageiro(Trecho trecho) {
        this.trechoPassageiro = trecho;
    }

    public void getTrechoPassageiro() {
        System.out.println("Local de embarque do passageiro: ");
        trechoPassageiro.getOrigemTrecho();

        System.out.println("Local de destino do passageiro: ");
        trechoPassageiro.getDestinoTrecho();
    }
}
