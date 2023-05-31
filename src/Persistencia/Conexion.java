package Persistencia;

import java.sql.*;

public class Conexion {

    private Connection connection;

    public Conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection("jdbc:sqlite:projectAcolmac.db");
            System.out.println("Buena Esa");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return this.connection;
    }
}
