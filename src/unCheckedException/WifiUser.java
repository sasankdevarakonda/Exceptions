package unCheckedException;

import unCheckedException.InvalidpasswordException;
import unCheckedException.WifiController;

public class WifiUser {
    public static void main(String[]args){
       try {
         WifiController controller=new WifiController();
        controller.wifi("sasank@007");

       }catch (InvalidpasswordException e){
           System.out.println(e.geterrorCode().toString()+"  "+e.getMessage());
       }
    }
}
