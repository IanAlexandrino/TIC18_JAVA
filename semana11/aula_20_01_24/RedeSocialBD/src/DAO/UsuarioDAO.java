package DAO;

import usuario.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void create (String login, String senha, String email){

        Usuario usuario = new Usuario();

        Connection con = DAO.conectar();

        String query = "INSERT INTO Usuario(Login, Senha, Email) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, login);
            ps.setString(2, senha);
            ps.setString(3, email);
            System.out.println(ps.toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



    }

}
