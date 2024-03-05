package checkedExceptions;

public class WifiRepository {
    public String wifi(String password)throws InvalidpasswordException{
        String ExsistngPassword="sasank@007";


        if(password.equalsIgnoreCase(ExsistngPassword)){
            System.out.println("Wifi Connected");
        }else{
            throw new InvalidpasswordException(Enumcode.Enter_Wrong_Password.toString()," ");
        }
        return ExsistngPassword;
    }
}
