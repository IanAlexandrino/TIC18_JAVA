package gerenciamentopedidos;

public class ItemPedido {

    private String nomeItem;
    private float valorItem;

    public String getNomeItem() {
        return nomeItem;
    }

    public float getValorItem() {
        return valorItem;
    }

    public void adicionarItem(String nome, float valor){

        this.nomeItem = nome;
        this.valorItem = valor;

    }

}
