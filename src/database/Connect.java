/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Acer
 */
public class Connect {

    private static Connection conn;

    public Connection getConnection() {
        return conn;
    }

    public Connect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3307/qlvattu";
        conn = DriverManager.getConnection(url, "root", "");
    }

    public ResultSet getData(String tbName) throws SQLException {
        Statement s = conn.createStatement();
        String sql = "select * from " + tbName;
        ResultSet rs = s.executeQuery(sql);
        return rs;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connect kn = new Connect();
        ResultSet rs = kn.getData("xemay");
        while (rs.next()) {
            System.out.println(rs.getString("tenxe"));
            System.out.println(rs.getString("mauxe"));
            System.out.println(rs.getString("bienxe"));
            System.out.println(rs.getString("loaixe"));
            System.out.println(rs.getString("loaixe"));
            System.out.println(rs.getString("loaixe"));

        }
    }
}
