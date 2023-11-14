package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

    private String nome, email, nacionalidade;
    private int quantidadeDePostagens, pontuacao;

    private ArrayList<String> postagens;

    public Usuario(String _nome, String _email, String _nacionalidade){
        this.nome = _nome;
        this.email = _email;
        this.nacionalidade = _nacionalidade;
        pontuacao = 0;
        quantidadeDePostagens = 0;
        postagens = new ArrayList<String>();
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

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public void getPontuacao() {
        System.out.println(pontuacao);
    }

    public void setQuantidadeDePostagens(int quantidadeDePostagens) {
        this.quantidadeDePostagens = quantidadeDePostagens;
    }

    public void getQuantidadeDePostagens() {
        System.out.println(quantidadeDePostagens);
    }

    public void adicionaPostagem(String _post){
        quantidadeDePostagens++;
        postagens.add(_post);

    }

    public void listaElementos(){
        System.out.println(postagens.getFirst());
        System.out.println(postagens.getLast());
    }

    public void alteraPontuacao(int delta){
        pontuacao = pontuacao + delta;

    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome, email, nacionalidade, postagem;

        System.out.println("Bem vindo! Vamos criar a sua conta.");
        System.out.println("Nome: ");
        nome = entrada.nextLine();
        System.out.println("Email: ");
        email = entrada.nextLine();
        System.out.println("Nacionalidade: ");
        nacionalidade = entrada.nextLine();

        Usuario novoUsuario = new Usuario(nome, email, nacionalidade);

        System.out.println("Envie a sua primeira postagem: ");
        postagem = entrada.nextLine();
        novoUsuario.adicionaPostagem(postagem);

        System.out.println("Envie a sua segunda postagem: ");
        postagem = entrada.nextLine();
        novoUsuario.adicionaPostagem(postagem);

        System.out.println("Envie a sua terceira postagem: ");
        postagem = entrada.nextLine();
        novoUsuario.adicionaPostagem(postagem);

        novoUsuario.listaElementos();
        novoUsuario.alteraPontuacao(1);
        novoUsuario.getQuantidadeDePostagens();
        novoUsuario.getPontuacao();
    }

}
