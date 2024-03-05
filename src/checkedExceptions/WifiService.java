package checkedExceptions;

public class WifiService {
    public int Wifi(String password) throws InvalidpasswordException{
        try {
            WifiRepository repository= new WifiRepository();
            repository.wifi(password);
        }catch (InvalidpasswordException e){
            throw e;
        }
        return 0;
    }
}
