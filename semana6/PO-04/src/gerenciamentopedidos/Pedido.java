package gerenciamentopedidos;

import java.util.*;

public class Pedido {

    private int nmrPedido;
    private String cpfCliente;
    private ArrayList<ItemPedido> itensPedido;
    private ItemPedido itemPedido;

    public Pedido(){
        itensPedido = new ArrayList<>();
        itemPedido = new ItemPedido();
    }

    public void adicionaItensPedido(ItemPedido itemPedido){

        itensPedido.add(itemPedido);

    }

    public void adicionaItensPedido(ArrayList itensPedido){

        itensPedido.addAll(itensPedido);

    }

    public float totalPedido(){

        float totalPedido = 0;

        for (ItemPedido itemPedido : itensPedido){

            totalPedido += itemPedido.getValorItem();

        }

        return totalPedido;
    }

    public float totalPedido(int descontoVista){

        float totalPedido = 0;

        for (ItemPedido itemPedido : itensPedido){

            totalPedido += itemPedido.getValorItem();

        }

        float desconto = (descontoVista / 100) * totalPedido;

        totalPedido = totalPedido - desconto;

        return totalPedido;
    }

    public void informacoesPedido(){

        int i = 1;

        System.out.println("Segue pedido completo: \n");
        System.out.println("Número do pedido: " + nmrPedido);
        System.out.println("CPF do cliente: " + cpfCliente);
        System.out.println("Itens do pedido: ");
        for (ItemPedido itensPedido : itensPedido){
            System.out.println(i + ". " + itensPedido.getNomeItem());
        }

    }
}
