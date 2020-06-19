/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fikri
 */
import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class koneksi {
   public static Connection con;
   public static Connection mysql;
   public static Statement stm;
   public static Connection configDB() throws SQLException {
       try {
           String url = "jdbc:mysql://localhost/data";
           String user = "root";
           String pass= "";
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
           stm = con.createStatement();
           System.out.println("koneksi berhasil ;");
           
       } catch (Exception e) {
           System.err.println("Koneksi ");
       }
       return mysql;
   }
}
    

