package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    private static final String URL = "jdbc:mysql://ul9sz1l10xtxy20l:Gwgs4nNfsdFwQzCxiihh@bvnp9l2wptkemmjpjzu6-mysql.services.clever-cloud.com:3306/bvnp9l2wptkemmjpjzu6";
    private static final String USER = "ul9sz1l10xtxy20l";
    private static final String PASSWD = "Gwgs4nNfsdFwQzCxiihh";

    public static Connection conectar(){

        Connection con = null;
        try{

            con = DriverManager.getConnection(URL, USER, PASSWD);
            System.out.println("Conexâo feita com sucesso!");

        } catch (SQLException e) {

            System.out.println("Erro na conexâo");

        }

        return con;

    }

    public static void main(String[] args) {

        DAO.conectar();

    }

}
