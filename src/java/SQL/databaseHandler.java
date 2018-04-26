
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class databaseHandler {
    public void addTemp (double d) throws SQLException{
        String query = "insert into Temperature (Temp) values (?)";
        
       try  (Connection con =DriverManager.getConnection("jdbc:mysql://mydatabaseinstance.cxthl15unoib.us-east-2.rds.amazonaws.com", "ebbasgrupp", "ebbasgrupp4!");
        PreparedStatement stmt = con.prepareStatement(query)){
           stmt.setDouble(1, d);
           stmt.executeUpdate();
       }
       
       
           catch (Exception e){
                   e.printStackTrace();
           }
       
    }
    
     public void addHumidity (double d) throws SQLException{
        String query = "insert into Humidity (Humidity) values (?)";
        
       try  (Connection con =DriverManager.getConnection("jdbc:mysql://mydatabaseinstance.cxthl15unoib.us-east-2.rds.amazonaws.com", "ebbasgrupp", "ebbasgrupp4!");
        PreparedStatement stmt = con.prepareStatement(query)){
           stmt.setDouble(1, d);
           stmt.executeUpdate();
       }
       
       
           catch (Exception e){
                   e.printStackTrace();
           }
       
    }
     
      public void addLight (double d) throws SQLException{
        String query = "insert into Light (Light) values (?)";
        
       try  (Connection con =DriverManager.getConnection("jdbc:mysql://mydatabaseinstance.cxthl15unoib.us-east-2.rds.amazonaws.com", "ebbasgrupp", "ebbasgrupp4!");
        PreparedStatement stmt = con.prepareStatement(query)){
           stmt.setDouble(1, d);
           stmt.executeUpdate();
       }
       
       
           catch (Exception e){
                   e.printStackTrace();
           }
       
    }
}
