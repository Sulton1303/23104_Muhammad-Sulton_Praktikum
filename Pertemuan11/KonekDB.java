/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class KonekDB {
    private static Connection connect;
    
    public static Connection tryConnect() throws SQLException, ClassNotFoundException {
        try {
            if (connect == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "");
            }
            return connect;
        } catch (SQLException e) {
            System.err.println("Error: connection failed " + e.getMessage());
            throw e;
        }
    }
    
}
