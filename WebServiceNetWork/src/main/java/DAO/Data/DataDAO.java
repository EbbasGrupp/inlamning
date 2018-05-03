

package DAO.Data;

import DAO.Connect;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataDAO {
    
    /**
     * Get the temperature data from the last hour. Connects to the database and selects from the temperature table.
     * <br>Where the time should be around one hour before the current time. 
     * @return 
     */
    public Temperature getTempLastHour(){
        Temperature temp = new Temperature();
        Connect connect = new Connect();
        Connection con = connect.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from DataStorage.Temperature2");
            rs.last();
            
            
            LocalDateTime datTime = rs.getTimestamp("Date").toLocalDateTime();
            LocalDateTime oneHourAgo = LocalDateTime.now();
            oneHourAgo.minusHours(1);
            
            while ( rs.previous() ){
                if ( datTime.getHour() >= oneHourAgo.getHour()
                        && datTime.getDayOfMonth() == oneHourAgo.getDayOfMonth()
                        && datTime.getYear() == oneHourAgo.getYear()
                        && datTime.getMonthValue() == oneHourAgo.getMonthValue()){
                    
                        temp.setId(rs.getString("SensorId"));
                        temp.setTimeDate(rs.getTimestamp("Date"));
                        temp.setTemp(rs.getDouble("Temperature"));
                        break;
                }
            }
            
            
        } catch (SQLException ex) {}
        
        return temp;
    }
    
    /**
     * 
     * @return 
     */
    public Humidity getHumLastHour(){
        Humidity hum = new Humidity();
        Connect connect = new Connect();
        Connection con = connect.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from DataStorage.Humidity2");
            rs.last();
            
            LocalDateTime datTime = rs.getTimestamp("Date").toLocalDateTime();
            LocalDateTime oneHourAgo = LocalDateTime.now();
            oneHourAgo.minusHours(1);
            
            while ( rs.previous() ){
                if ( datTime.getHour() >= oneHourAgo.getHour()
                        && datTime.getDayOfMonth() == oneHourAgo.getDayOfMonth()
                        && datTime.getYear() == oneHourAgo.getYear()
                        && datTime.getMonthValue() == oneHourAgo.getMonthValue()){
                    
                            hum.setHum(rs.getDouble("Humidity"));
                            hum.setId(rs.getString("SensorId"));
                            hum.setTimeDate(rs.getTimestamp("Date"));            
                            break;
                }
            }
        } catch (SQLException ex){}
        
        return hum;
    }
    
    /**
     * 
     * @return 
     */
    public LightIntensity getLightLastHour(){
        LightIntensity lighty = new LightIntensity();
        Connect connect = new Connect();
        Connection con = connect.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from DataStorage.Light2");
            rs.last();
            
            LocalDateTime datTime = rs.getTimestamp("Date").toLocalDateTime();
            LocalDateTime oneHourAgo = LocalDateTime.now();
            oneHourAgo.minusHours(1);
            
            while ( rs.previous() ){
                if ( datTime.getHour() >= oneHourAgo.getHour()
                        && datTime.getDayOfMonth() == oneHourAgo.getDayOfMonth()
                        && datTime.getYear() == oneHourAgo.getYear()
                        && datTime.getMonthValue() == oneHourAgo.getMonthValue()){
                    
                            lighty.setLight(rs.getDouble("Light"));
                            lighty.setId(rs.getString("SensorId"));
                            lighty.setTime(rs.getTimestamp("Date"));           
                            break;
                }
            }
        } catch (SQLException ex){}
        
        return lighty;
    }
    
    
    /**
     * A method for returning all the temperature data from the last day.
     * First it connects to the AWS database,
     * @return 
     */
    public ArrayList<Temperature> getLastDayTemp(){
        ArrayList<Temperature> tempList = new ArrayList<>();
        Connect connect = new Connect();
        Connection con = connect.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from DataStorage.Temperature2");
            rs.last();
            while(rs.previous()){
                Temperature temp = new Temperature();
                LocalDateTime datTime = rs.getTimestamp("Date").toLocalDateTime();
                LocalDateTime lastDay = LocalDateTime.now();
                lastDay.minusDays(1);
                
                if(datTime.getDayOfMonth() >= lastDay.getDayOfMonth()
                       && datTime.getYear() == lastDay.getYear()
                        && datTime.getMonthValue() == lastDay.getMonthValue()){
                    
                    temp.setId(rs.getString("SensorId"));
                    temp.setTimeDate(rs.getTimestamp("Date"));
                    temp.setTemp(rs.getDouble("Temperature"));
                    tempList.add(temp);
                }
            }
        } catch ( SQLException ex ) {}
        
        return tempList;
    }
    
    public ArrayList<Humidity> getLastDayHum(){
        ArrayList<Humidity> humList = new ArrayList<>(); 
        Connect connect = new Connect();
        Connection con = connect.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from DataStorage.Humidity2");
            rs.last();
            while(rs.previous()){
                Humidity hum = new Humidity();
                LocalDateTime datTime = rs.getTimestamp("Date").toLocalDateTime();
                LocalDateTime lastDay = LocalDateTime.now();
                lastDay.minusDays(1);
                
                if(datTime.getDayOfMonth() >= lastDay.getDayOfMonth()
                        && datTime.getYear() == lastDay.getYear()
                        && datTime.getMonthValue() == lastDay.getMonthValue()){
                    hum.setId(rs.getString("SensorId"));
                    hum.setTimeDate(rs.getTimestamp("Date"));
                    hum.setHum(rs.getDouble("Humidity"));
                    humList.add(hum);
                }
            }
        } catch ( SQLException ex ) {
            ex.printStackTrace();
        }
        return humList;
    }
    
    
    public ArrayList<LightIntensity> getLastDayLight(){
        ArrayList<LightIntensity> lightList = new ArrayList<>();
        Connect connect = new Connect();
        Connection con = connect.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from DataStorage.Light2");
            rs.last();
            while(rs.previous()){
                LightIntensity light = new LightIntensity();
                LocalDateTime datTime = rs.getTimestamp("Date").toLocalDateTime();
                LocalDateTime lastDay = LocalDateTime.now();
                lastDay.minusDays(1);
                
                if(datTime.getDayOfMonth() >= lastDay.getDayOfMonth()
                        && datTime.getYear() == lastDay.getYear()
                        && datTime.getMonthValue() == lastDay.getMonthValue()){
                    light.setId(rs.getString("SensorId"));
                    light.setTime(rs.getTimestamp("Date"));
                    light.setLight(rs.getDouble("Light"));
                    lightList.add(light);
                }
            }
        } catch ( SQLException ex ) {}
        return lightList;
    }
    
    /**
     * A method for getting a list of all the connected Sensors.
     * Might not be needed..
     * <br>It begins by connecting to the database, where it proceeds to join all the tables with their column "SensorId".
     *  Which is the name of the sensor that sent the information. 
     * @return A {@code String} of name/ID for the sensors.
     */
    public ArrayList<String> getAllSensors(){
        ArrayList<String> sensorList = new ArrayList<>();
        Connect connect = new Connect();
        Connection con = connect.getConnection();
        
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select DataStorage.Temperature2.SensorId, DataStorage.Humidity2.SensorId, DataStorage.Light2.SensorId");
            while(rs.next()){
                String sensor = rs.getString("SensorId");
                if(!sensorList.contains(sensor)){
                    sensorList.add(sensor);
                }
            }  
            
        } catch ( SQLException ex ) {}
        
        return sensorList;
    }
}
