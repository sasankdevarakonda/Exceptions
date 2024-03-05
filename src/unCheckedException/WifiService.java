package unCheckedException;

import unCheckedException.WifiRepository;

public class WifiService {
    public int Wifi(String password){
        try {
            WifiRepository repository= new WifiRepository();
            repository.wifi(password);
        }catch (Exception e){
            throw e;
        }
        return 0;
    }
}
