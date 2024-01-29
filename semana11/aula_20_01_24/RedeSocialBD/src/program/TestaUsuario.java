package program;

import DAO.UsuarioDAO;
import usuario.Usuario;

public class TestaUsuario {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setLogin("Joao");
        usuario.setSenha("joaorodrigues");
        usuario.setEmail("joaorodrigues@hotmail.com");
        UsuarioDAO.create(usuario.getLogin(), usuario.getSenha(), usuario.getEmail());

    }

}
