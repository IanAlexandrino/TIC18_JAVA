package gerenciamentopedidos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int nmrPedido;
    private String cpfCliente;
    private ArrayList<ItemPedido> itensPedido;
    private ItemPedido itemPedido;

    public Pedido(){
        itensPedido = new ArrayList<>();
        itemPedido = new ItemPedido();
    }



}
