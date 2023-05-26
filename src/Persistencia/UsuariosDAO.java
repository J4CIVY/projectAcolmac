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
        try {
            Statement statement = this.connection.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
 
    public boolean create(String id, String name, String surname, String pass, String email) {
        String sql = "INSERT INTO users(id, name, surname, pass, email) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setString(1, id );
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setString(4, pass);
            preparedStatement.setString(5, email);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public ResultSet validateUserLogin(String id, String pass) {
        
        String sql = "SELECT id, pass FROM users WHERE id = ? AND pass = ?";
        try {
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setString(1, id );
            preparedStatement.setString(2, pass );
            ResultSet resultSet = preparedStatement.executeQuery();
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
   