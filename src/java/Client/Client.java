package Client;

import com.google.gson.Gson;
 
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.io.IOException;
import java.util.Scanner;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;



public class Client {
    private static ClientConfig config = new DefaultClientConfig();
    private static Client client = Client.create(config);
    private static WebResource service = client.resource(UriBuilder.fromUri("http://localhost:8080/Inlamning").build());//ebbas adress till datorn
    
    
    
    
    public static void main(String []args) throws IOException {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        String jsonString = service.path("rest").path("climateservice/data").accept(MediaType.APPLICATION_JSON).get(String.class);//getanrop
       
        Gson gson = new Gson();
       
        System.out.println(jsonString);
        System.out.println();
       

        
    }
}
