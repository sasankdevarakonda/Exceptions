package unCheckedException;

import unCheckedException.Enumcode;
import unCheckedException.InvalidpasswordException;

public class WifiRepository {

    public String wifi(String password){
        String ExsistngPassword="sasank@007";


        if(password.equalsIgnoreCase(ExsistngPassword)){
       System.out.println("Wifi Connected");
    }else{
          throw new InvalidpasswordException(Enumcode.Enter_Wrong_Password.toString(),"Enter wrong Password");
        }
          return ExsistngPassword;
    }
}
