/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logindesign;
import java.sql.*;
/**
 *
 * @author Utilizator
 */
public class MyConnection {
    
    
    
    
    public static void main (String[] args){
        getConnection();
    }
    
    public static Connection getConnection(){
        Connection connection = null;
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost/proiectpoliclinica";
            String username = "root";
            String password = "123456";
            
            Class.forName(driver);
            connection = DriverManager.getConnection(url,username,password);
            //System.out.println("connected");
            
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return connection;
    }
    
}
