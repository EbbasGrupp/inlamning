package DAO;

import DAO.Data.*;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("Service")
public class Service {
    DataDAO datDAO = new DataDAO();
    
    
    @GET
    @Path("Temperatuuure")
    @Produces(MediaType.APPLICATION_JSON)
    public Temperature getTempLastHour(){
        Temperature temp = datDAO.getTempLastHour();
        return temp;
    }
}
