package program;

import DAO.UsuarioDAO;
import usuario.Usuario;

public class TestaUsuario {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setLogin("pedro");
        usuario.setSenha("pedrorodrigues");
        usuario.setEmail("pedrorodrigues@hotmail.com");
        UsuarioDAO.createUsuario(usuario.getLogin(), usuario.getSenha(), usuario.getEmail());

        UsuarioDAO.readAllUsers();
    }

}
