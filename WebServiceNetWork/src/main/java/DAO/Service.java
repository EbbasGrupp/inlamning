package DAO;

import DAO.Data.*;
import java.util.ArrayList;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;


@Path("Service")
public class Service {
    DataDAO datDAO = new DataDAO();
    
    
    @GET
    @Path("TemperatureLastHour")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperature getTempLastHour(){
        Temperature temp = datDAO.getTempLastHour();
        return temp;
    }
    
    @GET
    @Path("HumidityLastHour")
    @Produces(MediaType.APPLICATION_JSON)
    public Humidity getHumLastHour(){
        Humidity hum = datDAO.getHumLastHour();
        return hum;
    }
    
    @GET
    @Path("LightLastHour")
    @Produces(MediaType.APPLICATION_JSON)
    public LightIntensity getLightLastHour(){
        LightIntensity light = datDAO.getLightLastHour();
        return light;
    }
    
    
    @GET
    @Path("TempLastDay")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Temperature> getLastDayTemp(){
        ArrayList<Temperature> tempList = datDAO.getLastDayTemp();
        return tempList;
    }
    
    @GET
    @Path("HumLastDay")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Humidity> getLastDayHum(){
        System.out.println("Hejsan");
        ArrayList<Humidity> humList = datDAO.getLastDayHum();
        System.out.println(humList.size());
        return humList;
    }
    
    @GET
    @Path("LightLastDay")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<LightIntensity> getLastDayLight(){
        ArrayList<LightIntensity> lightList = datDAO.getLastDayLight();
        return lightList;
    }
}
