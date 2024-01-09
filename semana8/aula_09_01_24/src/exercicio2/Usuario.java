package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String email;
    private String senha;
    private ArrayList<String> listaPostagens;

    public Usuario(){

        listaPostagens = new ArrayList();

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setListaPostagens(String postagem) {
        listaPostagens.add(postagem);
    }

    public void getListaPostagens() {
        for (String postagem : listaPostagens){

            System.out.println(postagem);

        }
    }

    public void retornaUsuario(){

        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);

    }
}
