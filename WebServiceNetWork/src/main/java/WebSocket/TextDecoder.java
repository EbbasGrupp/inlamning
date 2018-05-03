

package WebSocket;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import DAO.Data.Data;

import com.google.gson.Gson;


public class TextDecoder implements Decoder.Text<Data>{
    
    @Override
    public Data decode(String s) throws DecodeException {
        Gson gson = new Gson();
        Data message = gson.fromJson(s, Data.class);
        
        return message;
    }
    
    
    @Override
    public boolean willDecode(String s){
        return (s != null);
    }
    
    @Override
    public void init(EndpointConfig endpointConfig){
            
    }
    
    @Override
    public void destroy(){
        
    }
}
