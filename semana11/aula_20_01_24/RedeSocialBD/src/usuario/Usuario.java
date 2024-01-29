package usuario;

import java.util.ArrayList;

public class Usuario {

    private String login, senha, email;
    private ArrayList<String> postagens;

    public Usuario(){

        postagens = new ArrayList<>();

    }

    public void getPostagens() {
        for (String postagem : postagens){

            System.out.println(postagem);

        }
    }

    public void setPostagens(ArrayList<String> _postagens) {
        postagens.addAll(_postagens);
    }

    public void addPostagem(String postagem){

        postagens.add(postagem);

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
