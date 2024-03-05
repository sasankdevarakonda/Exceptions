package checkedExceptions;

public class WifiUser {
    public static void main(String[]args){
       try {
           WifiController controller = new WifiController();
           controller.wifi("sasank");
       }catch (InvalidpasswordException e){
           System.out.println(e.geterrorCode()+" "+e.getMessage());
       }

    }
}
