package gerenciamentopedidos;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Pedido pedido = new Pedido();
        ItemPedido itemPedido = new ItemPedido();

        boolean app = true;
        int opMenu;
        int auxDescontoVista;

        do {

            System.out.print("##-----GERENCIADOR DE PEDIDOS-----##\n\n");
            System.out.print("|-----------------------------------------------|\n");
            System.out.print("| Opção 1 - Adicionar item ao Pedido            |\n");
            System.out.print("| Opção 2 - Adicionar Lista de Itens ao Pedido  |\n");
            System.out.print("| Opção 3 - Visualizar Pedido                   |\n");
            System.out.print("| Opção 4 - Valor Total do Pedido               |\n");
            System.out.print("| Opção 5 - Valor Total do Pedido a vista       |\n");
            System.out.print("| Opção 6 - Valor Total do Pedido a prazo       |\n");
            System.out.print("| Opção 0 - Sair                                |\n");
            System.out.print("|-----------------------------------------------|\n");
            System.out.print("Digite uma opção: ");

            opMenu = entrada.nextInt();

            if (opMenu == 1){

                pedido.adicionarPedidosUnicos();

            } else if (opMenu == 2) {

                pedido.adicionarPedidosLista();

            } else if (opMenu == 3) {

                pedido.informacoesPedido();

            } else if (opMenu == 4) {

                System.out.println("Valor total do pedido: R$" + pedido.totalPedido());

            } else if (opMenu == 5) {

                System.out.println("Informe o desonto do pedido a vista: ");
                auxDescontoVista = entrada.nextInt();

                System.out.println(pedido.totalPedido(auxDescontoVista));

            } else if (opMenu == 6) {



            } else if (opMenu == 0) {

                System.out.println("Até a próxima!");
                app = false;

            } else {

                System.out.println("Opção errada, insira uma opção válida!!!");

            }

        } while (app);

        entrada.close();

    }

}
