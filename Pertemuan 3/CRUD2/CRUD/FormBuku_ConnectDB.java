
package CRUD;

import java.sql.*;

public class FormBuku_ConnectDB {
    private static Connection mysqlconnect;
    
    public static Connection DB_Connection() throws SQLException
    {
        if(mysqlconnect==null)
        {
            try
            {
                String DB = "jdbc:mysql://localhost:3306/data";
                String user ="root";
                String pass ="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                mysqlconnect = ( Connection ) DriverManager.getConnection(DB,user,pass);
            }
            
            catch (SQLException e)
            {
                System.out.println("Gagal Koneksi ke Database !!!");
            }
        }
        
        return mysqlconnect;
    }
}
