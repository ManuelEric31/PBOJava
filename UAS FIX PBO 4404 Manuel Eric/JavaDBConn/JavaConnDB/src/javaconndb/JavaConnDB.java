/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaconndb;

/**
 *
 * @author manue
 */
import java.sql.*;
public class JavaConnDB {

    /**
     * @param args the command line arguments
     */
    String url, usr, pwd, dbn;
    public JavaConnDB (String dbn) {
        this.url = "jdbc:mysql://localhost/" + dbn;
        this.usr = "root"; //sesuaikan dengan user localhost 
        this.pwd = ""; //sesuaikan dengan password localhost 
    }
    public JavaConnDB (String host, String user, String pass,String dbn) {
        this.url = "jdbc:mysql://" + host + "/" + dbn;
        this.usr = user;
        this.pwd = pass;
    }
    
    public Connection getConnection() {
    Connection con = null;
    try {
        //Class.forName("com.mysql.jdbc.Driver");
				Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(this.url, this.usr, this.pwd);
    } catch (ClassNotFoundException e) {
        System.out.println ("Error #1 : " + e.getMessage());
        System.exit(0);
    } catch (SQLException e) {
        System.out.println ("Error #2 : " + e.getMessage());
        System.exit(0);
    }
        return con;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JavaConnDB conn = new JavaConnDB ("pbotesting"); // sesuaikan dengan nama database anda
        Connection c = conn.getConnection();
    }
    
}
