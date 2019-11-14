/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdrproject;
import java.sql.*;

/**
 *
 * @author maysa
 */
public class ConnectionClass {
    String urlPilote="com.mysql.jdbc.Driver";
    String urlBD="jdbc:mysql://localhost:3306/Project";
    Connection Cnx;
    
    
    
    public ConnectionClass (){
        try
        {
            Class.forName(urlPilote);
            System.out.println("Driver done");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("e");
        }
        try
        {
            Cnx=(Connection) DriverManager.getConnection(urlBD,"root","maysa12345");
            System.out.println("Connected to database successfully");
        }
        catch(SQLException e)
        {
            System.out.println("Not connected to database!");
            System.out.println("e");
        }
    }
    Connection ObtenirCnx()
    {
        return (this.Cnx);
    }
   
}
