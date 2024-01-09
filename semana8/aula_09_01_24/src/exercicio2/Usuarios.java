package exercicio2;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class Usuarios {

    private ArrayList<Usuario> usuarios;

    public Usuarios(){

        usuarios = new ArrayList();

    }

    public void inserirUsuario(){

        Scanner entrada = new Scanner(System.in);
        Usuario usuario = new Usuario();

        String auxNome;
        String auxEmail;
        String auxSenha;

        System.out.println("Insira o nome de usuário: ");
        auxNome = entrada.nextLine();

        System.out.println("Insira o email do usuário: ");
        auxEmail = entrada.nextLine();

        System.out.println("Insira a senha do usuário: ");
        auxSenha = entrada.nextLine();

        usuario.setNome(auxNome);
        usuario.setEmail(auxEmail);
        usuario.setSenha(auxSenha);

        usuarios.add(usuario);
    }

    public void buscarUsuario(){

        Scanner entrada = new Scanner(System.in);
        String auxNomeBusca;

        System.out.println("Digite o usuário que você quer buscar: ");
        auxNomeBusca = entrada.nextLine();

        for (Usuario usuario : usuarios){

            if (Objects.equals(usuario.getNome(), auxNomeBusca)){

                System.out.println("Usuário: \n");
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Email: " + usuario.getEmail() + "\n");

            } else {

                System.out.println("Usuário não encontrado!");

            }
        }

    }

    public void listarTodosUsuarios(){

        int i = 1;

        for (Usuario usuario : usuarios){
            System.out.println(i + "º Usuário\n");
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Email: " + usuario.getEmail() + "\n");
            i++;
        }

    }

    public void excluirUsuario(){

        Scanner entrada = new Scanner(System.in);
        String auxNomeExcluir;

        System.out.println("Digite o usuário que você quer excluir: ");
        auxNomeExcluir = entrada.nextLine();

        for (Usuario usuario : usuarios){

            if (Objects.equals(usuario.getNome(), auxNomeExcluir)){

                usuarios.remove(usuario);

            } else {

                System.out.println("Usuário não encontrado!");

            }
        }

    }
}
