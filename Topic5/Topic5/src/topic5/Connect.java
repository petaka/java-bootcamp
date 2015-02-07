/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package topic5;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author usuario
 */
public class Connect {
    Connection con = null;
 
    public Connection connection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/highschool", "root", "root");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
    }
}
