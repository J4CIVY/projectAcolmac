package Persistencia;

import java.sql.*;

public class UsuariosDAO {

    private Connection connection;

    public UsuariosDAO() {
        Conexion conexion = new Conexion();
        this.connection = conexion.getConnection();
        createTable();
    }

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS users (id TEXT PRIMARY KEY, name TEXT, surname TEXT, pass TEXT, email TEXT)";
        Statement st;
        try {
            st = this.connection.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean create(String id, String name, String surname, String pass, String email) {
        String sql = "INSERT INTO users(id, name, surname, pass, email) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = this.connection.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, surname);
            ps.setString(4, pass);
            ps.setString(5, email);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public ResultSet validateUserLogin(String id, String pass) {

        String sql = "SELECT id, pass FROM users WHERE id = ? AND pass = ?";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = this.connection.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//        
//        
//        public void readAll() {
//        try {
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
//
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getInt("age"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//        
//        
//         public void update(int id, String name, int age) {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE users SET name=?, age=? WHERE id=?");
//            preparedStatement.setString(1, name);
//            preparedStatement.setInt(2, age);
//            preparedStatement.setInt(3, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void delete(int id) {
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id=?");
//            preparedStatement.setInt(1, id);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
//}

}
