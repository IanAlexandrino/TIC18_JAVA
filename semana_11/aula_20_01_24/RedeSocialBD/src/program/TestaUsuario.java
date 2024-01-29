package program;

import DAO.UsuarioDAO;
import usuario.Usuario;

public class TestaUsuario {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();


        UsuarioDAO.readAllUsers();

        UsuarioDAO.deleteUser("josias");

        UsuarioDAO.readAllUsers();
    }

}
