/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapr.demo.mqtt.simple;

/**
 *
 * @author Andreas
 */
public class FeatherData {
    public String deviceName;
    public int deviceID;
    public double data;
    public String dataTimestamp;
    public String topic;
    
    public FeatherData(String Message, String Topic){
        String[] parts = Message.split(" ");
        this.deviceName = parts[0];
        this.data = Double.parseDouble(parts[1]);
        this.dataTimestamp = parts[2] + " " + parts[3];
        this.topic = Topic;
    }
    
    public int getID(){
        return deviceID;
    }
    
    public double getData(){
        return data;
    }
    
    public String getTimestamp(){
        return dataTimestamp;
    }
    
    public String getTopic(){
        return topic;
    }
    
    public void setID(int ID){
        this.deviceID = ID;
    }
    
    public String getName(){
        return deviceName;
    }
    
    public void printDebug(){
        
        System.out.println("MESSAGE INFO");
        System.out.println(getID());
        System.out.println(getData());
        System.out.println(getTimestamp());
        System.out.println(getName());
        System.out.println(getTopic());
        System.out.println("END OF DEBUG MESSAGE DUMP");
    }
}
