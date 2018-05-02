
package com.mapr.demo.mqtt.simple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabaseHandler {
    
    public void handleMessage(FeatherData inData) throws SQLException{
        if (inData.getTopic() == "Temperature"){
            addTemp(inData);
        }
        else if (inData.getTopic() == "Humidity"){
            addHumidity(inData);
        }
        else if (inData.getTopic() == "Light"){
            addLight(inData);
        }
        else if (inData.getTopic() == "Debug"){
            System.out.println("DEBUG MESSAGE RECEIVED");
            inData.printDebug();
        }
        else{
            System.out.println("Message receive in unkown Topic");
            System.out.println("Printing message");
            inData.printDebug();
        }
        
    }
    public void addTemp (FeatherData inData) throws SQLException{
        String query = "insert into Temperature2 (id, Temp) values (?,?)";
        
       try  (Connection con =DriverManager.getConnection("jdbc:mysql://mydatabaseinstance.cxthl15unoib.us-east-2.rds.amazonaws.com/DataStorage", "ebbasgrupp", "ebbasgrupp4!");
        PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setInt(1, inData.getID());
            stmt.setDouble(2, inData.getData());
            stmt.setString(3, inData.getTimestamp());
           stmt.executeUpdate();
       }
       
       
           catch (Exception e){
                   e.printStackTrace();
           }
       
    }
    
     public void addHumidity (FeatherData inData) throws SQLException{
        String query = "insert into Humidity2 (Humidity) values (?)";
        
       try  (Connection con =DriverManager.getConnection("jdbc:mysql://mydatabaseinstance.cxthl15unoib.us-east-2.rds.amazonaws.com/DataStorage", "ebbasgrupp", "ebbasgrupp4!");
        PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setInt(1, inData.getID());
            stmt.setDouble(2, inData.getData());
            stmt.setString(3, inData.getTimestamp());
           stmt.executeUpdate();
       }
       
       
           catch (Exception e){
                   e.printStackTrace();
           }
       
    }
     
      public void addLight (FeatherData inData) throws SQLException{
        String query = "insert into Light2 (Light) values (?)";
        
       try  (Connection con =DriverManager.getConnection("jdbc:mysql://mydatabaseinstance.cxthl15unoib.us-east-2.rds.amazonaws.com/DataStorage", "ebbasgrupp", "ebbasgrupp4!");
        PreparedStatement stmt = con.prepareStatement(query)){
            stmt.setInt(1, inData.getID());
            stmt.setDouble(2, inData.getData());
            stmt.setString(3, inData.getTimestamp());
           stmt.executeUpdate();
       }
       
       
           catch (Exception e){
                   e.printStackTrace();
           }
       
    }
}