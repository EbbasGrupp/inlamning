
package WebSocket;

import DAO.Data.Data;
import com.google.gson.Gson;
import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;


public class TextEncoder implements Encoder.Text<Data> {
    
    @Override
    public String encode(Data data) throws EncodeException {
        Gson gson = new Gson();
        String json = gson.toJson(data);
        return json;
    }
    
    @Override
    public void init(EndpointConfig endpointConfig){
        
    }
    
    @Override
    public void destroy(){
        
    }
    
}
