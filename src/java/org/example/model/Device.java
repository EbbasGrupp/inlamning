/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example.model;
import HelloWorldService.Temp;

public class Device {

    private int id;
    private String name;
    private String humidity;
    private String temperature;
    private String lightintensity;
    private String status;

    public Device() {
    }
    
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the temperature
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(String temperature) {
        Temp temp = new Temp();
        this.temperature = String.valueOf(temp.getTemp());
    }

    /**
     * @return the lightintensity
     */
    public String getLightintensity() {
        return lightintensity;
    }

    /**
     * @param lightintensity the lightintensity to set
     */
    public void setLightintensity(String lightintensity) {
        this.lightintensity = lightintensity;
    }
}