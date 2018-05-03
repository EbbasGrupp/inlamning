
package DAO.Data;

import java.sql.Timestamp;


public class Temperature {
    private double temp;
    private String id;
    private Timestamp timeDate;
    
    
    
    /**
     * @return The temperature in Celsius.
     */
    public double getTemp() {
        return temp;
    }

    /**
     * Sets what the temperature is in Celsius. The data comes from a sensor.
     * @param temp The new temperature.
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    
    /**
     * @return The ID of the temperature.
     */
    public String getId() {
        return id;
    }

    /**
     * The temperature 's unique ID.
     * Should probably match with its counterpart {@code Humidity} which comes from the same sensor.
     * {@link #setHumID(int)}
     * @param id A {@code String} that represents the unique ID of the sensor.
     */
    public void setId(String id) {
        this.id = id;
    }

    
    /**
     * @return The Timestamp for when the temperature got sent.
     */
    public Timestamp getTimeDate() {
        return timeDate;
    }

    /**
     * Should be in the format {@code "yyyy-MM-dd HH:mm:ss"}.
     * Which translates to {@code "year-month-day hour:minute:second"}. 
     * <br>It'll be converted to {@code LocalDateTime} format later in another file.
     * @param timeDate Sets the temperature 's timestamp.
     */
    public void setTimeDate(Timestamp timeDate) {
        this.timeDate = timeDate;
    }
}
