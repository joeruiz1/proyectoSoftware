/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Conexion.conexion;
import Modelo.ventas;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Labing
 */
public class ventasDao {
 
       private Connection connection;
       
    private ventasDao(){
        connection = conexion.getConnection();
    
    }
    
    public List<ventas> Listarventas() {
        List<ventas> users = new ArrayList<ventas>();
        try {
            System.out.println("LLegue hasta aca");
            Statement statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("select * from ventas");
            while (rs.next()) {
            ventas v = new ventas();
//               v.setUbicacionEspa(rs.getString("ubicacionEspacial"));
               
               
                users.add(v);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }
    
    
    
    
}
