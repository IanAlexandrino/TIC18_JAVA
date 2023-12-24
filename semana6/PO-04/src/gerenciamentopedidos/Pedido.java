package gerenciamentopedidos;

import java.util.*;

public class Pedido {

    private int nmrPedido;
    private String cpfCliente = "";
    private ArrayList<ItemPedido> itensPedido = new ArrayList<>();
    private ItemPedido itemPedido = new ItemPedido();
    private Random random = new Random();
    private Scanner entrada = new Scanner(System.in);

    public Pedido(){
        nmrPedido = random.nextInt(1000);
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

    public float totalPedido(int nmrPrestacoes, float juros){

        float totalPedido = 0;

        for (ItemPedido itemPedido : itensPedido){

            totalPedido += itemPedido.getValorItem();

        }

        float prestacao = totalPedido / nmrPrestacoes;
        totalPedido = 0;

        for (int i = 0 ; i < nmrPrestacoes ; i++){

            prestacao = prestacao * (1 - juros / 100);
            totalPedido += prestacao;

        }

        return totalPedido;
    }

    public void informacoesPedido(){

        int i = 1;

        System.out.println("Segue pedido completo: \n");
        System.out.println("Número do pedido: " + nmrPedido);
        System.out.println("CPF do cliente: " + cpfCliente);
        System.out.println("Itens do pedido: ");
        for (ItemPedido itemPedido : itensPedido){
            System.out.println(i + ". Item: " + itemPedido.getNomeItem() + " Valor: R$" + itemPedido.getValorItem() + "\n");
            i++;
        }

    }

    public void adicionarPedidosUnicos(){

        int auxQntdItem;
        String auxCpf;
        String auxNomeItem;
        float auxValorItem;

        if (cpfCliente == ""){

            System.out.println("Informe o CPF do cliente: ");
            auxCpf = entrada.nextLine();
            cpfCliente = auxCpf;

            System.out.println("Quantos itens você quer adicionar no seu pedido? ");
            auxQntdItem = entrada.nextInt();
            entrada.nextLine();

            for (int i = 0 ; i < auxQntdItem ; i++) {

                ItemPedido auxItemPedido = new ItemPedido();

                System.out.println("Insira o nome do seu " + (i + 1) + "º item: ");
                auxNomeItem = entrada.nextLine();
                System.out.println(auxNomeItem);

                System.out.println("Insira o valor do seu " + (i + 1) + "º item: ");
                auxValorItem = entrada.nextFloat();
                entrada.nextLine();
                System.out.println(auxValorItem);

                auxItemPedido.adicionarItem(auxNomeItem, auxValorItem);
                System.out.println(auxItemPedido.getNomeItem() + auxItemPedido.getValorItem());

                adicionaItensPedido(auxItemPedido);

            }

        } else {

                System.out.println("Quantos itens você quer adicionar no seu pedido? ");
                auxQntdItem = entrada.nextInt();
                entrada.nextLine();

                for (int i = 0; i < auxQntdItem; i++) {

                    ItemPedido auxItemPedido = new ItemPedido();

                    System.out.println("Insira o nome do seu " + (i + 1) + "º item: ");
                    auxNomeItem = entrada.nextLine();
                    System.out.println(auxNomeItem);

                    System.out.println("Insira o valor do seu " + (i + 1) + "º item: ");
                    auxValorItem = entrada.nextFloat();
                    entrada.nextLine();
                    System.out.println(auxValorItem);

                    auxItemPedido.adicionarItem(auxNomeItem, auxValorItem);
                    System.out.println(auxItemPedido.getNomeItem() + auxItemPedido.getValorItem());

                    adicionaItensPedido(auxItemPedido);

                }

        }

    }

    public void adicionarPedidosLista(){

        ArrayList<ItemPedido> auxItensPedido = new ArrayList<>();
        int auxQntdItem;
        String auxCpf;
        String auxNomeItem;
        float auxValorItem;

        if (cpfCliente == "") {

            System.out.println("Informe o CPF do cliente: ");
            auxCpf = entrada.nextLine();
            cpfCliente = auxCpf;

            System.out.println("Quantos itens você quer adicionar no seu pedido? ");
            auxQntdItem = entrada.nextInt();

            for (int i = 0 ; i < auxQntdItem ; i++){
                System.out.println("Insira o nome do seu " + (i + 1) + "º item: ");
                auxNomeItem = entrada.nextLine();

                System.out.println("Insira o valor do seu " + (i + 1) + "º item: ");
                auxValorItem = entrada.nextFloat();

                itemPedido.setNomeItem(auxNomeItem);
                itemPedido.setValorItem(auxValorItem);

                auxItensPedido.add(itemPedido);

            }

            adicionaItensPedido(auxItensPedido);
            auxItensPedido.clear();

        } else {

            System.out.println("Quantos itens você quer adicionar no seu pedido? ");
            auxQntdItem = entrada.nextInt();

            for (int i = 0 ; i < auxQntdItem ; i++){
                System.out.println("Insira o nome do seu " + (i + 1) + "º item: ");
                auxNomeItem = entrada.nextLine();

                System.out.println("Insira o valor do seu " + (i + 1) + "º item: ");
                auxValorItem = entrada.nextFloat();

                itemPedido.setNomeItem(auxNomeItem);
                itemPedido.setValorItem(auxValorItem);

                auxItensPedido.add(itemPedido);

            }

            adicionaItensPedido(auxItensPedido);
            auxItensPedido.clear();

        }


    }

}
