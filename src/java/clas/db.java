package clas;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 321
 */
public class db {
    private String n="";
    private String p="";
  
    public static void main(String []args) throws ClassNotFoundException, SQLException{
        sa("ss","rr");
    }
   
    

    public static boolean sa(String n,String p) throws ClassNotFoundException, SQLException {
      PreparedStatement pst=null;
        ResultSet rrs=null;
        //////
        
        String url="jdbc:mysql://remotemysql.com:3306/";
        String dbName="thkR9KBIiv";
        String userName="thkR9KBIiv";
        String password="4cSpmHYqT3";
        Connection conn=null;
        Class.forName("com.mysql.jdbc.Driver");
             conn=DriverManager.getConnection(url+dbName, userName,password);       
                 pst=conn.prepareStatement("INSERT INTO `fb` VALUES (?,?,?,?)");
     
            pst.setString(1, n);
            pst.setString(2,p);  
            pst.setString(3, "db");
            pst.setString(4,"mf"); 
           boolean b= pst.execute();
        return b;
    }
    
}
