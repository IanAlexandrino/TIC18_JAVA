package parte_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        EmpresaOnibus empresaOnibus = new EmpresaOnibus();
        Scanner entrada = new Scanner(System.in);
        boolean auxwhile = true;
        int auxMenuPrincipal;

        while (auxwhile){

            System.out.print("##--Empresa Ônibus--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Área de Cadastro  |\n");
            System.out.print("| Opção 2 - Área de Pesquisa  |\n");
            System.out.print("| Opção 3 - Simular Viagem    |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            auxMenuPrincipal = entrada.nextInt();

            switch (auxMenuPrincipal){

                case 1:
                    empresaOnibus.menuCadastro();
                    break;

                case 2:
                    empresaOnibus.menuPesquisa();
                    break;

                case 3:
                    empresaOnibus.menuViagem();
                    break;

                case 4:
                    auxwhile = false;
                    System.out.println("Até a próxima!!");
                    break;

                default:
                    System.out.println("Opção incorreta, por favor, tente novamente!");
            }

        }


    }

}
