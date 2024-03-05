package unCheckedException;

import unCheckedException.InvalidpasswordException;

public class WifiController {
    public int wifi(String password){
       try{
            WifiService service = new WifiService();
            return service.Wifi(password);
        }catch (InvalidpasswordException e){
            throw e;
        }
    }
}
