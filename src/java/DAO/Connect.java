
package DAO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect {
    
    
    /**
     * A separate method for getting a connection to the Database. 
     * @return The connection if it was successful, otherwise returning {@code null}.
     */
    public Connection getConnection(){
        Connection con = null;
        Properties prop = new Properties();
        try{
            //Byt senare!! 0:
            prop.load(new FileInputStream("/Users/VictorPonten/NetBeansProjects/inlamning1/src/conf/settings.properties"));
            
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
}
