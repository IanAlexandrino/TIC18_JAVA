package exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Usuarios usuarios = new Usuarios();
        boolean menu = true;
        int opSwitch;

        while(menu){

            System.out.println("1 - insere");
            System.out.println("2 - busca");
            System.out.println("3 - lista todos");
            System.out.println("4 - exclui");

            opSwitch = entrada.nextInt();

            switch (opSwitch){
                case 1:
                    usuarios.inserirUsuario();
                    break;

                case 2:
                    usuarios.buscarUsuario();
                    break;

                case 3:
                    usuarios.listarTodosUsuarios();
                    break;

                case 4:
                    usuarios.excluirUsuario();
                    break;

                default:
                    System.out.println("Opção errada");
                    menu = false;
            }

        }

    }

}
