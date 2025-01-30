/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gyovannaz;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 20221074010034
 */
public class Gyovannaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String url = "jdbc: mysql: //localhost/sakila";
        String urs = "root";
        String pwd = "1234";

        try {
            Connection con = DriverManager.getConnection(url, urs, pwd);
            System.out.println("");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        // *****************************CRUD*************************************
        Statement st = con.createStatement();

        String query = "select * from customer limit 5";

        ResultSet rs = st.executeQuery(query);

        ResultSetMetaData md = rs.getMetaData();
        int col = md.getColumnCount(); 
        System.out.println("Tabela: "+md.getCatalogName(1));
        for (int i = 1; i <= col; i++) {
            System.out.println(md.getCatalogName(i)+"\t");     
        }
           System.out.println("");
    }
            while (rs.next()){
                for (int i = 1; i <= col; i++){
                    System.out.print(rs.getString(i)+"\t");                    
                          
            }
                System.out.println("");
}
