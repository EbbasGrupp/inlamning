
package com.mapr.demo.mqtt.simple;

import DAO.Connect;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SensorTable {

     public Connection getConnection(){
        Connection con = null;
        Properties prop = new Properties();
        try{
            //Byt senare!! 0:
            prop.load(new FileInputStream("inlamning/src/conf/settings.properties"));
            
        } catch (IOException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(prop.getProperty("connectionString"),
                    prop.getProperty("name"),
                    prop.getProperty("password"));
        } catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return con;
    }
     
    public int getSensorId (String sensorName) throws SQLException {
        Connection c = getConnection();
        Statement stmt = c.createStatement();
        String query = "select id from SensorTable where SensorId like  "+sensorName;
        ResultSet rs = stmt.executeQuery(query);
        int id = -1;
        while(rs.next()){
            id = rs.getInt(id);
            
            
        }
        return id;
}
}
