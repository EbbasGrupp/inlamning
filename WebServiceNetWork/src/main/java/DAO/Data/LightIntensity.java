
package DAO.Data;

import java.sql.Timestamp;

public class LightIntensity {
    private double light;
    private Timestamp time;
    private String id;
     
      

    /**
     * @return The light intensity in some data format.
     */
    public double getLight() {
        return light;
    }

    /**
     * Sets what the new light intensity data should be. The data comes from a sensor.
     * @param light The new light intensity in some data format.
     */
    public void setLight(double light) {
        this.light = light;
    }
    
    
    /**
     * @return The ID of the light intensity.
     */
    public String getId() {
        return id;
    }

    /**
     * The Sensors ID. Whichever
     * No need to be match with anything else as this comes from a separate sensor which only checks light intensity. 
     * @param id A {@code String} which is the unique ID of the sensor.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    
    /**
     * @return The Timestamp for when the light data was sent.
     */
    public Timestamp getTime() {
        return time;
    }

    /**
     * Should be in the format {@code "yyyy-MM-dd HH:mm:ss"}.
     * Which translates to {@code "year-month-day hour:minute:second"}. 
     * <br>It'll be converted to {@code LocalDateTime} format later in another file.
     * @param time Sets the light 's timestamp.
     */
    public void setTime(Timestamp time) {
        this.time = time;
    }
}
