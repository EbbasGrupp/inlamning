
package DAO.Data;

import java.sql.Timestamp;


public class Humidity {
    
    private double hum;
    private String id;
    private Timestamp timeDate;
    
    

    /**
     * @return The humidity to set.
     */
    public double getHum() {
        return hum;
    }

    /**
     * Sets how much percentage of humidity it is in the air. Humidity comes from a sensor.
     * @param hum The new humidity.
     */
    public void setHum(double hum) {
        this.hum = hum;
    }

   

    /**
     * @return The ID of the humidity.
     */
    public String getId() {
        return id;
    }

    /**
     * The humidity 's unique ID. 
     * Should probably match up with its counterpart {@code Temperature} which comes from the same sensor.
     * {@link #setTempID(int)}
     * @param id A {@code String} with the sensors unique ID. 
     */
    public void setId(String id) {
        this.id = id;
    }

    

    /**
     * @return The Timestamp for when the humidity got sent.
     */
    public Timestamp getTimeDate() {
        return timeDate;
    }

    /**
     * Should be in the format {@code "yyyy-MM-dd HH:mm:ss"}.
     * Which translates to {@code "year-month-day hour:minute:second"}. 
     * <br>It'll be converted to {@code LocalDateTime} format later in another file.
     * @param timeDate Sets the humidity 's timestamp.
     */
    public void setTimeDate(Timestamp timeDate) {
        this.timeDate = timeDate;
    }

    
}