
package WebSocket;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.websocket.EncodeException;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import DAO.Data.*;
import java.util.ArrayList;


@ServerEndpoint(value = "/Service", decoders = TextDecoder.class, encoders = TextEncoder.class)
public class Endpoint {
    
    private Session session;
    private static DataDAO dao = new DataDAO();
    
    
    @OnOpen
    public void onOpen(Session session) throws IOException, EncodeException, InterruptedException {
        this.session = session;
        ArrayList<String> sensorLista = dao.getAllSensors();
        this.session.getBasicRemote().sendObject(sensorLista);
        System.out.println("Client has connected.");
        
        while( true ){
            Data data = dao.getData();
            this.session.getBasicRemote().sendObject(data);
            Thread.sleep(3000);
        }
    }
    
    @OnMessage
    public void onMessage(Session session, Data data) throws IOException, EncodeException {
        
        Humidity hum = dao.getHumLastHour();
        this.session.getBasicRemote().sendObject(hum);
    }
    
    
}
