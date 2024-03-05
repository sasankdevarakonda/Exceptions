package checkedExceptions;

public class WifiController  {

    public int wifi (String password) throws InvalidpasswordException{
            try {
                WifiService service = new WifiService();
                return service.Wifi(password);
            }catch (InvalidpasswordException e){
                throw e;
            }
    }
}
