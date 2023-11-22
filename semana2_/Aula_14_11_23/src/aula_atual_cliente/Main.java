package aula_atual_cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        String cpf;

        System.out.println("Bem vindo ao cadastro de clientes!");
        System.out.println("Cadastre o seu cliente: ");

        System.out.println("Nome: ");
        nome = entrada.nextLine();
        System.out.println("CPF: ");
        cpf = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        System.out.println("Aqui está o dados do seu cliente cadastrado: ");
        System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());

        System.out.println("Agora altere os dados do seu cliente cadastrado: ");

        System.out.println("Nome atual: " + cliente.getNome());
        System.out.println("Novo nome: ");
        nome = entrada.nextLine();

        System.out.println("CPF atual: " + cliente.getCpf());
        System.out.println("Novo CPF: ");
        cpf = entrada.nextLine();

        cliente.setNome(nome);
        cliente.setCpf(cpf);

        System.out.println("Cliente alterado com sucesso!");

        System.out.println("Nome: " + cliente.getNome() + ", CPF: " + cliente.getCpf());


    }
}
