
package DAO.Data;

import java.sql.Timestamp;


public class Data {
    
    private double hum;
    private double temp;
    private double light;
    private String id;
    private String topic;
    private Timestamp timeDate;

    /**
     * @return the hum
     */
    public double getHum() {
        return hum;
    }

    /**
     * @param hum the hum to set
     */
    public void setHum(double hum) {
        this.hum = hum;
    }

    /**
     * @return the temp
     */
    public double getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(double temp) {
        this.temp = temp;
    }

    /**
     * @return the light
     */
    public double getLight() {
        return light;
    }

    /**
     * @param light the light to set
     */
    public void setLight(double light) {
        this.light = light;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public String getTopic() {
        return topic;
    }

    /**
     * @param topic the topic to set
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }
    
    /**
     * @return the timeDate
     */
    public Timestamp getTimeDate() {
        return timeDate;
    }

    /**
     * @param timeDate the timeDate to set
     */
    public void setTimeDate(Timestamp timeDate) {
        this.timeDate = timeDate;
    }
    
    
}
