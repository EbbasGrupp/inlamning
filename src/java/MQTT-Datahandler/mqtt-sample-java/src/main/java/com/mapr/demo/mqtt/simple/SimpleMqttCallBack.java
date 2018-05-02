package com.mapr.demo.mqtt.simple;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class SimpleMqttCallBack implements MqttCallback {
    
    DatabaseHandler D = new DatabaseHandler();

  public void connectionLost(Throwable throwable) {
    System.out.println("Connection to MQTT broker lost!");
  }

  public void messageArrived(String topic, MqttMessage mqttMessage) throws Exception {
    String Message = mqttMessage.toString();
    FeatherData inData = new FeatherData(Message, topic);
    System.out.println("Message received in Topic: " + topic );
    System.out.println("Message: " + Message);
    D.handleMessage(inData);
    
  }

  public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
  }
}
