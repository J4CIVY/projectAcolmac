package Persistencia;

import java.sql.*;

public class ApiBaseDAO {

    private Connection connection;

    public ApiBaseDAO() {
        Conexion conexion = new Conexion();
        this.connection = conexion.getConnection();
        createTableApi();
    }

    public void createTableApi() {
        String sql = "CREATE TABLE IF NOT EXISTS inquiries (Country TEXT PRIMARY KEY, OfficialName TEXT, Capital TEXT, Gini TEXT, CoiCode TEXT, Population TEXT, TimeZone TEXT, Continent TEXT)";
        Statement st;
        try {
            st = this.connection.createStatement();
            st.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean create(String country, String officialName, String capital, String gini, String coiCode, String population, String timeZone, String continent) {
        String sql = "INSERT INTO inquiries(Country, OfficialName, Capital, Gini, CoiCode, Population, TimeZone, Continent) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps;
        try {
            ps = this.connection.prepareStatement(sql);
            ps.setString(1, country);
            ps.setString(2, officialName);
            ps.setString(3, capital);
            ps.setString(4, gini);
            ps.setString(5, coiCode);
            ps.setString(6, population);
            ps.setString(7, timeZone);
            ps.setString(8, continent);
            ps.executeUpdate();
            this.connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

}
