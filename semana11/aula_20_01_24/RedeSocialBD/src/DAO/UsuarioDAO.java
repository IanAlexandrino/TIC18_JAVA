package DAO;

import usuario.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

    public static void createUsuario (String login, String senha, String email){

        Usuario usuario = new Usuario();

        Connection con = DAO.conectar();

        String query = "INSERT INTO Usuario(Login, Senha, Email) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login);
            ps.setString(2, senha);
            ps.setString(3, email);
            System.out.println(ps.toString());

            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void readAllUsers(){

        ArrayList<Usuario> usuarios = new ArrayList<>();

        Connection con = DAO.conectar();

        String query = "SELECT Login, Senha, Email FROM Usuario";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rS = ps.executeQuery();

            while (rS.next()){

                Usuario usuario = new Usuario();
                usuario.setLogin(rS.getString("Login"));
                usuario.setSenha(rS.getString("Senha"));
                usuario.setEmail(rS.getString("Email"));
                usuarios.add(usuario);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        for (Usuario usuario : usuarios){

            System.out.println("Usuário: " + usuario.getLogin() + "-" + usuario.getSenha() + "-" + usuario.getEmail());

        }

    }

}
