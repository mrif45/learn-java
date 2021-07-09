/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rifqi Adam
 */
public class Koneksi {
    Connection conn = null;
    public static Connection koneksi(){
        String driver = "com.mysql.cj.jdbc.Driver";
        String host  = "jdbc:mysql://localhost:3306/rental_mobil";
        String user = "root";
        String password = "adam12345";
        try {
            Class.forName(driver);
            Connection conn = (Connection) DriverManager.getConnection(host,user,password);
            System.out.println("Koneksi Berhasil");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    } 

    public ResultSet querySelectAll(String user, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
